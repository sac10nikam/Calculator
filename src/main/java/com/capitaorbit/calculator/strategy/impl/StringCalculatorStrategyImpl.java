package com.capitaorbit.calculator.strategy.impl;

import static com.capitaorbit.common.CalculatorConstant.DOT;
import static com.capitaorbit.common.CalculatorConstant.LEFT_PARENTHESES;
import static com.capitaorbit.common.CalculatorConstant.MINUS;
import static com.capitaorbit.common.CalculatorConstant.RIGHT_PARENTHESES;
import static com.capitaorbit.common.CalculatorConstant.ZERO;
import static com.capitaorbit.common.CalculatorErrorConstant.ERROR_OCCURRED;
import static com.capitaorbit.common.CalculatorErrorConstant.INCORRECT_BRACKETS_ERROR;
import static com.capitaorbit.common.CalculatorErrorConstant.INVALID_EXPRESSION;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

import com.capitaorbit.calculator.strategy.StringCalculatorStrategy;
import com.capitaorbit.exception.CalculatorException;
import com.capitaorbit.util.CalculatorUtils;

/**
 * <p>
 * String expression calculator strategies implementation class. It implements
 * basic operations like Addition, Subtraction, Multiplication, Division, and
 * Exponential
 * 
 * It implements the methods from {@link StringCalculatorStrategy}
 * </p>
 * 
 * @author sachin_nikam
 *
 */
public class StringCalculatorStrategyImpl implements StringCalculatorStrategy {
	/**
	 * The {@link Logger} object
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(StringCalculatorStrategyImpl.class);
	/**
	 * The current class name
	 */
	public final String className = this.getClass().getName();

	/**
	 * The {@link List} on expression results
	 */
	private List<String> expressionResults = null;
	
	/**
	 * The string
	 */
	private String item = null;
	
	/**
	 * OPerator constants
	 */
	private static final String OPERATOR_EXPONENTIONIAL = "^";
	private static final String OPERATOR_DIVISION = "/";
	private static final String OPERATOR_MULTIPLICATION = "*";
	private static final String OPERATOR_ADDITION = "+";
	private static final String OPERATOR_SUBTRACTION = "-";
	private static final int DEFAULT_SCALE = 2;

	/**
	 * Method which deal with brackets separately
	 * 
	 * @param expression
	 *            The string expression
	 * @return The result of the calculation
	 */
	@Override
	public String calculate(String expression) {
		LOGGER.info(Level.INFO.name(), "Start:" + className + ".calculate");

		String expressionValue = CalculatorUtils.removeAllWhiteSpaces(expression);
		if (CalculatorUtils.isBlank(expressionValue) || !CalculatorUtils.isValidExpression(expressionValue)) {
			return INVALID_EXPRESSION.getValue();
		}

		if (expressionValue.startsWith(DOT.getValue()) && expressionValue.length() > 1) {
			expressionValue = ZERO.getValue() + expression;
		}

		while (expressionValue.contains(LEFT_PARENTHESES.getValue())
				|| expressionValue.contains(RIGHT_PARENTHESES.getValue())) {
			for (int i = 0; i < expressionValue.length(); i++) {
				String error = validateNumberWithLeftAndRightParentheses(expressionValue, i);
				if (!CalculatorUtils.isBlank(error)) {
					return error;
				}

				if (expressionValue.charAt(i) == RIGHT_PARENTHESES.getCharacterValue()) {
					for (int j = i; j >= 0; j--) {
						if (expressionValue.charAt(j) == LEFT_PARENTHESES.getCharacterValue()) {
							String value = expressionValue.substring(j + 1, i);
							value = this.evaluateExpression(value);
							expressionValue = expressionValue.substring(0, j) + value
									+ expressionValue.substring(i + 1);
							j = i = 0;
						}
					}
				}
			}
			if (expressionValue.contains(LEFT_PARENTHESES.getValue())
					|| expressionValue.contains(RIGHT_PARENTHESES.getValue())) {
				return INCORRECT_BRACKETS_ERROR.getValue();
			}
		}
		expressionValue = this.evaluateExpression(expressionValue);
		LOGGER.info(Level.INFO.name(), "End:" + className + ".calculate");
		return expressionValue;
	}

	/**
	 * Validates the expression if number has parentheses at left and right side
	 * 
	 * @param expressionValue
	 *            The expression value
	 * @param i
	 *            The index value
	 */
	private String validateNumberWithLeftAndRightParentheses(String expressionValue, int i) {
		try {
			// For line # 81 to 83 - In case we want to consider next
			// bracket
			// as multiplication uncomment this code
			if ((expressionValue.charAt(i) == RIGHT_PARENTHESES.getCharacterValue() || Character
					.isDigit(expressionValue.charAt(i)))
					&& (i < expressionValue.length() - 1)
					&& expressionValue.charAt(i + 1) == LEFT_PARENTHESES.getCharacterValue()) {
				/*
				 * expressionValue = expressionValue.substring(0, i + 1) + "*" +
				 * (expressionValue.substring(i + 1));
				 */
				return INVALID_EXPRESSION.getValue();
			}
		} catch (CalculatorException e) {
			LOGGER.error(Level.ERROR.name(), ERROR_OCCURRED.getValue() + e.getMessage());
		}
		return null;
	}

	/**
	 * <p>
	 * Its does below given operations 1. method divide String on numbers and
	 * operators
	 * </p>
	 * 
	 * @param expression
	 * @return
	 */
	private String evaluateExpression(String expression) {
		LOGGER.info(Level.INFO.name(), "Start: " + className + ".recognize");
		ExpressionResults exprResults = new ExpressionResults();
		expressionResults = new ArrayList<>();
		item = StringUtils.EMPTY;

		for (int i = expression.length() - 1; i >= 0; i--) {
			if (CalculatorUtils.isDigit(expression.charAt(i))) {
				item = expression.charAt(i) + item;
				if (i == 0) {
					exprResults.put();
				}
			} else {
				if (expression.charAt(i) == DOT.getCharacterValue()) {
					item = CalculatorUtils.convertCharacterToString(expression.charAt(i)) + item;
				} else if (expression.charAt(i) == MINUS.getCharacterValue()
						&& (i == 0 || (!CalculatorUtils.isDigit(expression.charAt(i - 1))))) {
					item = CalculatorUtils.convertCharacterToString(expression.charAt(i)) + item;
					exprResults.put();
				} else {
					exprResults.put();
					item += CalculatorUtils.convertCharacterToString(expression.charAt(i));
					exprResults.put();
				}
			}
		}
		expressionResults = exprResults.computeResult(expressionResults, OPERATOR_EXPONENTIONIAL, StringUtils.EMPTY);
		expressionResults = exprResults.computeResult(expressionResults, OPERATOR_MULTIPLICATION, OPERATOR_DIVISION);
		expressionResults = exprResults.computeResult(expressionResults, OPERATOR_ADDITION, OPERATOR_SUBTRACTION);
		for (String content : expressionResults) {
			if (content.contains(INVALID_EXPRESSION.getValue())) {
				LOGGER.info(Level.INFO.name(), "End: " + className + ".recognize");
				return content;
			}
		}
		LOGGER.info(Level.INFO.name(), "End: " + className + ".recognize");
		if (expressionResults.isEmpty()) {
			return INVALID_EXPRESSION.getValue();
		}
		return expressionResults.get(0);
	}

	/**
	 * {@link ExpressionResults} inner class to put items into list
	 * 
	 * @author sachin_nikam
	 *
	 */
	private class ExpressionResults {
		public void put() {
			if (!CalculatorUtils.isBlank(item)) {
				expressionResults.add(0, item);
				item = StringUtils.EMPTY;
			}
		}

		/**
		 * <p>
		 * Computes the result for the given operators
		 * </p>
		 * 
		 * @param list
		 *            The expression list
		 * @param operator1
		 *            The operator 1
		 * @param operator2
		 *            The operator 2
		 * @return The {@link List} of results
		 */
		private List<String> computeResult(List<String> list, String operator1, String operator2) {
			LOGGER.info(Level.INFO.name(), "Start:" + className + ".calculate");

			BigDecimal result = new BigDecimal(0);
			for (int i = 0; i < list.size(); i++) {
				try {
					if (list.get(i).equals(operator1) || list.get(i).equals(operator2)) {
						String operator = list.get(i);
						result = compute(list, i, operator);
						try {
							if (!CalculatorUtils.isWholeNumber(result)) {
								list.set(i, CalculatorUtils.addScaleToBigDecimal(result, DEFAULT_SCALE));
							} else {
								list.set(i, CalculatorUtils.addScaleToBigDecimal(result, 0));
							}
							list.remove(i + 1);
							list.remove(i - 1);
						} catch (Exception e) {
							LOGGER.error(Level.ERROR.name(), ERROR_OCCURRED.getValue() + e.getMessage());
						}
					} else {
						continue;
					}
					i = 0;
				} catch (Exception e) {
					// LOGGER.error(Level.ERROR.name(),
					// ERROR_OCCURRED.getValue() + e.getMessage());
					list.set(i, INVALID_EXPRESSION.getValue());
				}
			}
			LOGGER.info(Level.INFO.name(), "End:" + className + ".calculate");
			return list;
		}

		/**
		 * <p>
		 * Computes the exponential, division, multiplication, addition and
		 * subtraction
		 * </p>
		 * 
		 * @param list
		 *            The expression list
		 * @param index
		 *            The list index value
		 * @param operator
		 *            The operator value
		 * @return The result in {@link BigDecimal} format
		 */
		private BigDecimal compute(List<String> list, int index, String operator) {
			BigDecimal result = new BigDecimal(0);
			switch (operator) {
			case OPERATOR_EXPONENTIONIAL:
				double value = Math.pow(new BigDecimal(list.get(index - 1)).doubleValue(),
						new BigDecimal(list.get(index + 1)).doubleValue());
				result = new BigDecimal(value);
				break;
			case OPERATOR_DIVISION:
				result = new BigDecimal(list.get(index - 1)).divide(new BigDecimal(list.get(index + 1)), DEFAULT_SCALE,
						BigDecimal.ROUND_HALF_EVEN);
				break;
			case OPERATOR_MULTIPLICATION:
				result = new BigDecimal(list.get(index - 1)).multiply(new BigDecimal(list.get(index + 1)));
				break;
			case OPERATOR_ADDITION:
				result = new BigDecimal(list.get(index - 1)).add(new BigDecimal(list.get(index + 1)));
				break;
			case OPERATOR_SUBTRACTION:
				result = new BigDecimal(list.get(index - 1)).subtract(new BigDecimal(list.get(index + 1)));
				break;
			default:
			}
			return result;
		}
	}
}