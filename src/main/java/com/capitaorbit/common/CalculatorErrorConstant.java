package com.capitaorbit.common;

/**
 * <p>
 * The calculator error constants enum
 * </p>
 * 
 * @author sachin_nikam
 *
 */
public enum CalculatorErrorConstant {

	ERROR_OCCURRED("Exception occurred: "),
	INVALID_EXPRESSION("INVALID EXPRESSION"),
	INCORRECT_BRACKETS_ERROR("INVALID EXPRESSION");

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
	 * Private constructor
	 * 
	 * @param value
	 */
	private CalculatorErrorConstant(String value) {
		this.value = value;
	}

}
