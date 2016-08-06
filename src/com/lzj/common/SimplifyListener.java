package com.lzj.common;

import com.lzj.antlrs.LzjAntlrBaseListener;
import com.lzj.antlrs.LzjAntlrParser;
import com.lzj.entity.Area;
import com.lzj.entity.Function;
import com.lzj.utils.Utils;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Created by lzj on 2016/8/2.
 */
public class SimplifyListener extends LzjAntlrBaseListener {

    private ParseTreeProperty<Function> values = new ParseTreeProperty<>();

    @Override
    public void exitExp(LzjAntlrParser.ExpContext ctx) {
        super.exitExp(ctx);
        Function f = values.get(ctx.term(0));
        if (!f.hasResult()) {
            System.out.println(f.sentence);
        }
    }

    @Override
    public void exitTerm(LzjAntlrParser.TermContext ctx) {
        super.exitTerm(ctx);
        String op = ctx.or_op().toString();
        doOption(ctx, new OptionListener() {
            Function temp = new Function();

            @Override
            public void doubleConst(Function first, Function second) {
                temp.result = first.result || second.result;
            }

            @Override
            public void leftConst(Function first, Function second) {
                temp = orFunction(temp, first, second);
            }

            @Override
            public void rightConst(Function first, Function second) {
                temp = orFunction(temp, second, first);
            }

            @Override
            public void NotConst(Function first, Function second) {
                temp.op = op;
                StringBuilder builder = getStringBuilder(first, second, temp.op);
                temp.sentence = builder.toString();
            }

            @Override
            public Function getResult() {
                return temp;
            }
        });
    }

    /**
     * like a(1) || b(1)  --> 1 || b(1) = 1;  0 || b(1) = b(1);
     *
     * @param f
     * @param first
     * @param second
     * @return
     */
    private Function orFunction(Function f, Function first, Function second) {
        if (first.result) {
            f.result = true;
        } else {
            f = second;
        }
        return f;
    }


    @Override
    public void exitFactor(LzjAntlrParser.FactorContext ctx) {
        super.exitFactor(ctx);
        String op = ctx.and_op().toString();
        doOption(ctx, new OptionListener() {
            Function temp = new Function();

            @Override
            public void doubleConst(Function first, Function second) {
                temp.result = first.result && second.result;
            }

            @Override
            public void leftConst(Function first, Function second) {
                temp = andFunction(temp, first, second);
            }

            @Override
            public void rightConst(Function first, Function second) {
                temp = andFunction(temp, second, first);
            }

            @Override
            public void NotConst(Function first, Function second) {
                temp.op = op;
                StringBuilder builder = getStringBuilder(first, second, temp.op);
                temp.sentence = builder.toString();
            }

            @Override
            public Function getResult() {
                return temp;
            }
        });

    }


    /**
     * like a(1) && b(1)  --> 1 && b(1) = b(1);  0 && b(1) = 0;
     *
     * @param f
     * @param a
     * @param b
     * @return
     */
    private Function andFunction(Function f, Function a, Function b) {
        if (a.result) {
            f = b;
        } else {
            f.result = false;
        }
        return f;
    }


    /**
     * only to find the variable and deliver the variable to the user
     * let them do what they want to do through the callback of listener
     *
     * @param ctx
     * @param listener
     */
    private void doOption(ParserRuleContext ctx, OptionListener listener) {
        Function first = values.get(ctx.getChild(0));
        for (int i = 1; i < ctx.getChildCount(); i++) {
            Function second = values.get(ctx.getChild(i));
            if (second == null) {
                continue;
            }
            if (first.hasResult() && second.hasResult()) {
                listener.doubleConst(first, second);
            } else if (first.hasResult()) {
                listener.leftConst(first, second);
            } else if (second.hasResult()) {
                listener.rightConst(first, second);
            } else {
                listener.NotConst(first, second);
            }
            first = listener.getResult();
        }
        values.put(ctx, first);
    }


    private StringBuilder getStringBuilder(Function l, Function r, String op) {
        StringBuilder builder = new StringBuilder();
        combine(l, builder, op);
        builder.append(op);
        combine(r, builder, op);
        return builder;
    }

    private void combine(Function l, StringBuilder builder, String op) {
        if (op.equals(l.op)) {
            builder.append(l.sentence);
        } else {
            builder.append("( ");
            builder.append(l.sentence);
            builder.append(" )");
        }
    }

    @Override
    public void exitOther(LzjAntlrParser.OtherContext ctx) {
        super.exitOther(ctx);
        Function f = null;
        if (ctx.preState() != null) {
            f = values.get(ctx.preState());
        } else if (ctx.logicState() != null) {
            f = values.get(ctx.logicState());
        } else if (ctx.exp() != null) {
            f = values.get(ctx.exp());
        }
        values.put(ctx, f);
    }


    /**
     * find the same as area variable and calculate its value
     * otherwise deliver the variable to parent
     *
     * @param ctx
     */
    @Override
    public void exitPreState(LzjAntlrParser.PreStateContext ctx) {
        super.exitPreState(ctx);
        Function f = new Function();
        for (Area area : Utils.areas) {
            if (area.compare(ctx.predicate().getText(), ctx.var().getText())) {
                if (area.result) {
                    if (ctx.not_op() != null) {
                        f.result = false;
                    } else {
                        f.result = true;
                    }
                } else {
                    if (ctx.not_op() != null) {
                        f.result = true;
                    } else {
                        f.result = false;
                    }
                }
            }
        }
        if (f.result == null) {
            f.sentence = ctx.getText();
        }
        values.put(ctx, f);
    }

    /**
     * calculate the variable from logic statement
     *
     * @param ctx
     */
    @Override
    public void exitLogicState(LzjAntlrParser.LogicStateContext ctx) {
        super.exitLogicState(ctx);
        Function f = new Function();
        String op = ctx.compare_op().getText();
        if (ctx.getChildCount() == 1) {
            f.result = ctx.var(0).getText().equals("1");
        } else {
            int l = Integer.parseInt(ctx.var(0).getText());
            int r = Integer.parseInt(ctx.var(1).getText());
            if (">".equals(op)) {
                f.result = l > r;
            } else if ("<".equals(op)) {
                f.result = l < r;
            } else if ("=".equals(op)) {
                f.result = l == r;
            } else if ("!=".equals(op)) {
                f.result = l != r;
            } else if (">=".equals(op)) {
                f.result = l >= r;
            } else if ("<=".equals(op)) {
                f.result = l <= r;
            }
        }
        values.put(ctx, f);
    }


}
