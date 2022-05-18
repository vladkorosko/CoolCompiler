// Generated from C:/Users/Vladyslav/Desktop/фото дз/3 курс/Компілятори/coolcompiler/src/main/resources\CoolGrammar.g4 by ANTLR 4.10.1
package org.example.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoolGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface CoolGrammarVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link CoolGrammarParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(CoolGrammarParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolGrammarParser#value}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValue(CoolGrammarParser.ValueContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolGrammarParser#attribute_without_semicolon}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAttribute_without_semicolon(CoolGrammarParser.Attribute_without_semicolonContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolGrammarParser#attribute}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAttribute(CoolGrammarParser.AttributeContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolGrammarParser#assigment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssigment(CoolGrammarParser.AssigmentContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolGrammarParser#parameters}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParameters(CoolGrammarParser.ParametersContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolGrammarParser#method}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMethod(CoolGrammarParser.MethodContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolGrammarParser#conditional}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConditional(CoolGrammarParser.ConditionalContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolGrammarParser#loop}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLoop(CoolGrammarParser.LoopContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolGrammarParser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlock(CoolGrammarParser.BlockContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolGrammarParser#let}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLet(CoolGrammarParser.LetContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolGrammarParser#case_option}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCase_option(CoolGrammarParser.Case_optionContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolGrammarParser#switch_case}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSwitch_case(CoolGrammarParser.Switch_caseContext ctx);

    /**
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNew(CoolGrammarParser.NewContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolGrammarParser#isvoid}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsvoid(CoolGrammarParser.IsvoidContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolGrammarParser#ariphemitic_operation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAriphemitic_operation(CoolGrammarParser.Ariphemitic_operationContext ctx);

    /**
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClass(CoolGrammarParser.ClassContext ctx);

    /**
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpr(CoolGrammarParser.ExprContext ctx);
}