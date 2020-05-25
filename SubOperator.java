 
/*****************************************************************
 * 
 * // CLASS SubOperator
 * //
 * // COURSE AND PROJECT INFO
 * // CSE 205 Object Oriented Programming and Data Structures, Fall 2019
 * // Project Number 4
 * //
 * // AUTHOR Emiliya Yanakieva (eyanakie@asu.edu)

 // *************************************************************** */

/**
 * Represents the subtraction operator which is a specific type of binary
 * operator.
 */
public class SubOperator extends BinaryOperator {

	public SubOperator() {

	}

	@Override
	public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
		return new Operand(pLhsOperand.getValue() - pRhsOperand.getValue());
	}

	@Override
	public int precedence() {
		return 2;
	}

	@Override
	public int stackPrecedence() {
		return 2;
	}

}