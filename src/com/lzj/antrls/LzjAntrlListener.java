// Generated from LzjAntrl.g by ANTLR 4.5.3
package com.lzj.antrls;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LzjAntrlParser}.
 */
public interface LzjAntrlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LzjAntrlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LzjAntrlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#tagState}.
	 * @param ctx the parse tree
	 */
	void enterTagState(LzjAntrlParser.TagStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#tagState}.
	 * @param ctx the parse tree
	 */
	void exitTagState(LzjAntrlParser.TagStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(LzjAntrlParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(LzjAntrlParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(LzjAntrlParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(LzjAntrlParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(LzjAntrlParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(LzjAntrlParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#to_op}.
	 * @param ctx the parse tree
	 */
	void enterTo_op(LzjAntrlParser.To_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#to_op}.
	 * @param ctx the parse tree
	 */
	void exitTo_op(LzjAntrlParser.To_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LzjAntrlParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LzjAntrlParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#or_op}.
	 * @param ctx the parse tree
	 */
	void enterOr_op(LzjAntrlParser.Or_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#or_op}.
	 * @param ctx the parse tree
	 */
	void exitOr_op(LzjAntrlParser.Or_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(LzjAntrlParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(LzjAntrlParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#and_op}.
	 * @param ctx the parse tree
	 */
	void enterAnd_op(LzjAntrlParser.And_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#and_op}.
	 * @param ctx the parse tree
	 */
	void exitAnd_op(LzjAntrlParser.And_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(LzjAntrlParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(LzjAntrlParser.OtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#preState}.
	 * @param ctx the parse tree
	 */
	void enterPreState(LzjAntrlParser.PreStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#preState}.
	 * @param ctx the parse tree
	 */
	void exitPreState(LzjAntrlParser.PreStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#logicState}.
	 * @param ctx the parse tree
	 */
	void enterLogicState(LzjAntrlParser.LogicStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#logicState}.
	 * @param ctx the parse tree
	 */
	void exitLogicState(LzjAntrlParser.LogicStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(LzjAntrlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(LzjAntrlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LzjAntrlParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LzjAntrlParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterCompare_op(LzjAntrlParser.Compare_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitCompare_op(LzjAntrlParser.Compare_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntrlParser#not_op}.
	 * @param ctx the parse tree
	 */
	void enterNot_op(LzjAntrlParser.Not_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntrlParser#not_op}.
	 * @param ctx the parse tree
	 */
	void exitNot_op(LzjAntrlParser.Not_opContext ctx);
}