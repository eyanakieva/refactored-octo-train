/*****************************************************************
 * 
 * // CLASS RightParen
 * //
 * // COURSE AND PROJECT INFO
 * // CSE 205 Object Oriented Programming and Data Structures, Fall 2019
 * // Project Number 4
 * //
 * // AUTHOR Emiliya Yanakieva (eyanakie@asu.edu)

 // *************************************************************** */


/**
 * Represents a right parenthesis in the expression.
 */
public class RightParen extends Parenthesis {

    public RightParen() {
    }

    /**
     * Right parentheses really don't have precedence since they are not pushed on the operator stack, but we
     * have to override precedence() so we assign the lowest precedence level to RightParen.
     */
    @Override
    public int precedence() {
        return 1;
    }

    /**
     * See comments in precedence().
     */
    @Override
    public int stackPrecedence() {
        return 1;
    }

}