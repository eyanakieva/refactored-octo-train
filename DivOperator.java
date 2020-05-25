 /*****************************************************************
 * 
 * // CLASS DivOperator
 * //
 * // COURSE AND PROJECT INFO
 * // CSE 205 Object Oriented Programming and Data Structures, Fall 2019
 * // Project Number 4
 * //
 * // AUTHOR Emiliya Yanakieva (eyanakie@asu.edu)

 // *************************************************************** */ 

/**
 * Represents the division operator which is a specific type of binary operator.
 */
public class DivOperator extends BinaryOperator{
	
	public DivOperator(){
		
	}

	@Override
	public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
        return new Operand(pLhsOperand.getValue() / pRhsOperand.getValue());
	}

	@Override
	public int precedence() {
		return 3;
	}

	@Override
	public int stackPrecedence() {
		return 3;
	}
	
}