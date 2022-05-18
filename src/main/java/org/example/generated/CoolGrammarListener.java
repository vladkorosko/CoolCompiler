// Generated from C:/Users/Vladyslav/Desktop/фото дз/3 курс/Компілятори/coolcompiler/src/main/resources\CoolGrammar.g4 by ANTLR 4.10.1
package org.example.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolGrammarParser}.
 */
public interface CoolGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CoolGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CoolGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolGrammarParser#attribute_without_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_without_semicolon(CoolGrammarParser.Attribute_without_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolGrammarParser#attribute_without_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_without_semicolon(CoolGrammarParser.Attribute_without_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolGrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(CoolGrammarParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolGrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(CoolGrammarParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolGrammarParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(CoolGrammarParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolGrammarParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(CoolGrammarParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(CoolGrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(CoolGrammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolGrammarParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(CoolGrammarParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolGrammarParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(CoolGrammarParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolGrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(CoolGrammarParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolGrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(CoolGrammarParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(CoolGrammarParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(CoolGrammarParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CoolGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CoolGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolGrammarParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(CoolGrammarParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolGrammarParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(CoolGrammarParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolGrammarParser#case_option}.
	 * @param ctx the parse tree
	 */
	void enterCase_option(CoolGrammarParser.Case_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolGrammarParser#case_option}.
	 * @param ctx the parse tree
	 */
	void exitCase_option(CoolGrammarParser.Case_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolGrammarParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(CoolGrammarParser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolGrammarParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(CoolGrammarParser.Switch_caseContext ctx);
	/**
	 * @param ctx the parse tree
	 */
	void enterNew(CoolGrammarParser.NewContext ctx);
	/**
	 * @param ctx the parse tree
	 */
	void exitNew(CoolGrammarParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolGrammarParser#isvoid}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid(CoolGrammarParser.IsvoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolGrammarParser#isvoid}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid(CoolGrammarParser.IsvoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolGrammarParser#ariphemitic_operation}.
	 * @param ctx the parse tree
	 */
	void enterAriphemitic_operation(CoolGrammarParser.Ariphemitic_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolGrammarParser#ariphemitic_operation}.
	 * @param ctx the parse tree
	 */
	void exitAriphemitic_operation(CoolGrammarParser.Ariphemitic_operationContext ctx);
	/**
	 * @param ctx the parse tree
	 */
	void enterClass(CoolGrammarParser.ClassContext ctx);
	/**
	 * @param ctx the parse tree
	 */
	void exitClass(CoolGrammarParser.ClassContext ctx);
	/**
	 * @param ctx the parse tree
	 */
	void enterExpr(CoolGrammarParser.ExprContext ctx);
	/**
	 * @param ctx the parse tree
	 */
	void exitExpr(CoolGrammarParser.ExprContext ctx);
}