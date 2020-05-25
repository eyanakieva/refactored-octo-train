 

/*****************************************************************
 * 
 * // CLASS Operand
 * //
 * // COURSE AND PROJECT INFO
 * // CSE 205 Object Oriented Programming and Data Structures, Fall 2019
 * // Project Number 4
 * //
 * // AUTHOR Emiliya Yanakieva (eyanakie@asu.edu)

 // *************************************************************** */

/**
 * An operand is a numeric value represented as a Double.
 */
public class Operand extends Token {
	private Double mValue;

	public Operand(Double pValue) {
		setValue(pValue);
	}

	public Double getValue() {

		return mValue;
	}

	public void setValue(Double pValue) {

		mValue = pValue;
	}
}