/*****************************************************************
 * 
 * // CLASS Operator
 * //
 * // COURSE AND PROJECT INFO
 * // CSE 205 Object Oriented Programming and Data Structures, Fall 2019
 * // Project Number 4
 * //
 * // AUTHOR Emiliya Yanakieva (eyanakie@asu.edu)

 // *************************************************************** */

/**
 * Operator is the superclass of all binary and unary operators.
 */

public abstract class Operator extends Token {
	public Operator() {
	}

	public abstract boolean isBinaryOperator();

	public abstract int precedence();

	public abstract int stackPrecedence();

}