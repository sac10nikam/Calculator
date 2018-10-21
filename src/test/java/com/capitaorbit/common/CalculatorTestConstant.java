package com.capitaorbit.common;

/**
 * <p>
 * {@link CalculatorTestConstant} constants enum
 * </p>
 * 
 * @author sachin_nikam
 *
 */
public enum CalculatorTestConstant {

	STRING_CALCULATOR_REGEX("^[0-9+\\-*\\.^\\/\\(\\)]*$"),
	STRING_SPACE_REGEX("\\s"), 
	CASE_NUMBER("Case #"), 
	ZERO("0"), 
	DOT("."), 
	MINUS("-"),
	INVALID_EXPRESSION("INVALID EXPRESSION"),
	LEFT_PARENTHESES("("), 
	RIGHT_PARENTHESES(")"),
	OPERATOR_EXPONENTIONIAL("^"),
	OPERATOR_DIVISION("/"),
	OPERATOR_MULTIPLICATION("*"),
	OPERATOR_ADDITION("+"),
	OPERATOR_SUBTRACTION("-");

	private String value;

	/**
	 * Gets the value
	 * 
	 * @return
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Gets the character
	 * 
	 * @return
	 */
	public char getCharacterValue() {
		return value.charAt(0);
	}

	/**
	 * Private constructor
	 * 
	 * @param value
	 */
	private CalculatorTestConstant(String value) {
		this.value = value;
	}

}
