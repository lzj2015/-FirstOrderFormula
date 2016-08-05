package com.lzj.common;

import com.lzj.antlrs.LzjAntlrBaseListener;
import com.lzj.antlrs.LzjAntlrParser;
import com.lzj.entity.Area;
import com.lzj.utils.Utils;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzj on 2016/8/1.
 */
public class LParseListener extends LzjAntlrBaseListener {

    public ParseTreeProperty<String> values = new ParseTreeProperty<>();


    public static List<String> allSentences = new ArrayList<>();


    @Override
    public void exitTagState(LzjAntlrParser.TagStateContext ctx) {
        super.exitTagState(ctx);

        LzjAntlrParser.TagContext tag = ctx.tag();
        String temp = values.get(ctx.exp());

        for (int i = 0; i < tag.var().size(); i++) {
            boolean flag;
            if (tag.key(i).getText().equals("$")) { //and op
                flag = true;
            } else {// %   or op
                flag = false;
            }
            temp = instantiationVar(tag, i, temp.toCharArray(), flag);
        }
        temp = "( " + temp + " )";

        // there will add the sentences to list before finish this statement otherwise deliver the sentence to parent
        if (ctx.getParent() instanceof LzjAntlrParser.OtherContext) {
            values.put(ctx,  temp);
        } else {
            temp += ";";
            allSentences.add(temp);
        }
    }


    /**
     * to instantiation the variable from the areas variable and then add the sentence to list
     * combine the sentences
     * if the tag is all we use the && to combine the sentences
     * else if the tag is exists we use the || to combine the sentences
     *
     * @param tag
     * @param i
     * @param tempList
     * @param exp
     */
    private String instantiationVar(LzjAntlrParser.TagContext tag, int i, char[] exp, boolean flag) {
        StringBuilder tempBulider = new StringBuilder();
        for (Area area : Utils.areas) {
            StringBuilder builder = new StringBuilder();
            for (char temp : exp) {
                if (Character.isUpperCase(temp) && tag.var(i).getText().charAt(0) == temp) {//if the predicate of sentence  is the same as the ares variable predicate then change the var to const
                    builder.append(area.var);
                } else {
                    builder.append(temp);
                }
            }

            if (flag) {
                tempBulider.append(" && ");
                tempBulider.append("( ");
                tempBulider.append(builder.toString());
                tempBulider.append(" )");
            } else {
                tempBulider.append(" || ");
                tempBulider.append("( ");
                tempBulider.append(builder.toString());
                tempBulider.append(" )");
            }
        }
        //to delete the  redundant symbol
        if (tempBulider.length() > 0) {
            tempBulider.delete(0, 4);
        }
        return tempBulider.toString();
    }


    @Override
    public void exitProgram(LzjAntlrParser.ProgramContext ctx) {
        super.exitProgram(ctx);
        System.out.println(allSentences.toString());
    }

    @Override
    public void exitOther(LzjAntlrParser.OtherContext ctx) {
        super.exitOther(ctx);
        if (ctx.preState() != null) {
            values.put(ctx, ctx.preState().getText());
        } else if (ctx.tagState() != null) {
            values.put(ctx, values.get(ctx.tagState()));
        } else if (ctx.logicState() != null) {
            values.put(ctx, ctx.logicState().getText());
        }
    }

    @Override
    public void exitFactor(LzjAntlrParser.FactorContext ctx) {
        super.exitFactor(ctx);
        deliverVar(ctx);
    }

    @Override
    public void exitTerm(LzjAntlrParser.TermContext ctx) {
        super.exitTerm(ctx);
        deliverVar(ctx);
    }

    @Override
    public void exitExp(LzjAntlrParser.ExpContext ctx) {
        super.exitExp(ctx);
        if (ctx.getParent() instanceof LzjAntlrParser.ProgramContext) {
            allSentences.add(ctx.getText() + ";");
        }
        deliverVar(ctx);
    }

    /**
     * the function that will deliver the var to parent node.
     *
     * @param ctx
     */
    private void deliverVar(RuleContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            String temp = values.get(ctx.getChild(i));
            if (temp == null) {
                builder.append(ctx.getChild(i).getText());
            } else {
                builder.append(temp);
            }
        }
        values.put(ctx, builder.toString());
    }
}
