 
/*****************************************************************
 * 
 * // CLASS NegOperator
 * //
 * // COURSE AND PROJECT INFO
 * // CSE 205 Object Oriented Programming and Data Structures, Fall 2019
 * // Project Number 4
 * //
 * // AUTHOR Emiliya Yanakieva (eyanakie@asu.edu)

 // *************************************************************** */

/**
 * Represents the negation operator which is a specific type of unary operator.
 */
public class NegOperator extends UnaryOperator{

	@Override
	public Operand evaluate(Operand pOperand) {
		return new Operand(-pOperand.getValue());
	}

	@Override
	public int precedence() {
		return 4;
	}

	@Override
	public int stackPrecedence() {
		return 4;
	}

	
	
}