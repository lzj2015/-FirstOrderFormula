// Generated from LzjAntlr.g by ANTLR 4.5.3
package com.lzj.antlrs;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LzjAntlrParser}.
 */
public interface LzjAntlrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LzjAntlrParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LzjAntlrParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#tagState}.
	 * @param ctx the parse tree
	 */
	void enterTagState(LzjAntlrParser.TagStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#tagState}.
	 * @param ctx the parse tree
	 */
	void exitTagState(LzjAntlrParser.TagStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(LzjAntlrParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(LzjAntlrParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(LzjAntlrParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(LzjAntlrParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(LzjAntlrParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(LzjAntlrParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#to_op}.
	 * @param ctx the parse tree
	 */
	void enterTo_op(LzjAntlrParser.To_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#to_op}.
	 * @param ctx the parse tree
	 */
	void exitTo_op(LzjAntlrParser.To_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LzjAntlrParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LzjAntlrParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#or_op}.
	 * @param ctx the parse tree
	 */
	void enterOr_op(LzjAntlrParser.Or_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#or_op}.
	 * @param ctx the parse tree
	 */
	void exitOr_op(LzjAntlrParser.Or_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(LzjAntlrParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(LzjAntlrParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#and_op}.
	 * @param ctx the parse tree
	 */
	void enterAnd_op(LzjAntlrParser.And_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#and_op}.
	 * @param ctx the parse tree
	 */
	void exitAnd_op(LzjAntlrParser.And_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(LzjAntlrParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(LzjAntlrParser.OtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#preState}.
	 * @param ctx the parse tree
	 */
	void enterPreState(LzjAntlrParser.PreStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#preState}.
	 * @param ctx the parse tree
	 */
	void exitPreState(LzjAntlrParser.PreStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#logicState}.
	 * @param ctx the parse tree
	 */
	void enterLogicState(LzjAntlrParser.LogicStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#logicState}.
	 * @param ctx the parse tree
	 */
	void exitLogicState(LzjAntlrParser.LogicStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(LzjAntlrParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(LzjAntlrParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LzjAntlrParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LzjAntlrParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterCompare_op(LzjAntlrParser.Compare_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitCompare_op(LzjAntlrParser.Compare_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LzjAntlrParser#not_op}.
	 * @param ctx the parse tree
	 */
	void enterNot_op(LzjAntlrParser.Not_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LzjAntlrParser#not_op}.
	 * @param ctx the parse tree
	 */
	void exitNot_op(LzjAntlrParser.Not_opContext ctx);
}