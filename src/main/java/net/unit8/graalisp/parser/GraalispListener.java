// Generated from Graalisp.g4 by ANTLR 4.3

package net.unit8.graalisp.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GraalispParser}.
 */
public interface GraalispListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GraalispParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull GraalispParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraalispParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull GraalispParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GraalispParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull GraalispParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraalispParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull GraalispParser.ProgramContext ctx);
}