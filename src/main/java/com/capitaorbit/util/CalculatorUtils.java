package com.capitaorbit.util;

import static com.capitaorbit.common.CalculatorConstant.*;
import static com.capitaorbit.common.CalculatorConstant.STRING_SPACE_REGEX;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;

/**
 * <p>
 * {@link StringCalculator} utility class
 * </p>
 * 
 * @author sachin_nikam
 *
 */
public class CalculatorUtils {

	private CalculatorUtils() {
		// No implementation
	}

	/**
	 * Validates if the given expression is valid or not
	 * 
	 * @param expression
	 * @return The flag whether expression is valid or not
	 */
	public static boolean isBlank(String expression) {
		if (StringUtils.isBlank(expression)) {
			return true;
		}
		return false;
	}

	/**
	 * Validates if the given expression is valid or not
	 * 
	 * @param expression
	 * @return The flag whether expression is valid or not
	 */
	public static boolean isValidExpression(String expression) {
		if (!expression.matches(STRING_CALCULATOR_REGEX.getValue())) {
			return false;
		} else if (expression.startsWith(OPERATOR_EXPONENTIONIAL.getValue())
				|| expression.startsWith(OPERATOR_DIVISION.getValue())
				|| expression.startsWith(OPERATOR_MULTIPLICATION.getValue())
				|| expression.startsWith(OPERATOR_ADDITION.getValue())
				|| expression.startsWith(OPERATOR_SUBTRACTION.getValue())) {
			return false;
		} else if (expression.endsWith(OPERATOR_EXPONENTIONIAL.getValue())
				|| expression.endsWith(OPERATOR_DIVISION.getValue())
				|| expression.endsWith(OPERATOR_MULTIPLICATION.getValue())
				|| expression.endsWith(OPERATOR_ADDITION.getValue())
				|| expression.endsWith(OPERATOR_SUBTRACTION.getValue())) {
			return false;
		}
		return true;
	}

	/**
	 * Validates if the given character is a digit or not
	 * 
	 * @param character
	 *            The given character
	 * @return The flag
	 */
	public static boolean isDigit(char character) {
		return Character.isDigit(character);
	}

	/**
	 * Gets the string representation of the given character
	 * 
	 * @param character
	 *            The given character
	 * @return The boolean flag
	 */
	public static String convertCharacterToString(char character) {
		return Character.toString(character);
	}

	/**
	 * Sets the given scale value to {@link BigDecimal} number
	 * 
	 * @param value
	 *            The {@link BigDecimal} value
	 * @param scale
	 *            The scale number
	 * @return The string value after setting scale
	 */
	public static String addScaleToBigDecimal(BigDecimal value, int scale) {
		return String.valueOf(value.setScale(scale, BigDecimal.ROUND_HALF_EVEN));
	}

	/**
	 * Validates if the given expression is a whole number or not
	 * 
	 * @param value
	 *            The expression
	 * @return The boolean flag
	 */
	public static boolean isWholeNumber(BigDecimal value) {
		if (Math.round(value.doubleValue()) == value.doubleValue()) {
			return true;
		}
		return false;
	}

	/**
	 * Removes all white spaces from given string
	 * 
	 * @param expression
	 *            The given string
	 * @return The String after removing all white spaces
	 */
	public static String removeAllWhiteSpaces(String expression) {
		return !isBlank(expression) ? expression.replaceAll(STRING_SPACE_REGEX.getValue(), StringUtils.EMPTY)
				: StringUtils.EMPTY;
	}

}
