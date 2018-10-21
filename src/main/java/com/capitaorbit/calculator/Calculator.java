package com.capitaorbit.calculator;

import static com.capitaorbit.common.CalculatorErrorConstant.INVALID_EXPRESSION;

import com.capitaorbit.calculator.factory.CalculatorStrategyFactory;
import com.capitaorbit.calculator.strategy.StringCalculatorStrategy;
import com.capitaorbit.common.CalculatorTypes;

/**
 * <p>
 * String expression calculator class. It implements basic operations like
 * Addition, Subtraction, Multiplication, Division, and Exponential
 * 
 * It implements the methods from {@link StringCalculatorStrategy}
 * </p>
 * 
 * @author sachin_nikam
 *
 */
public class Calculator {
	/** The {@link CalculatorStrategyFactory} instance */
	private final CalculatorStrategyFactory calculatorStrategyFactory = new CalculatorStrategyFactory();

	/**
	 * <p>
	 * Gets the result of the given string arithmetic expression
	 * </p>
	 * 
	 * @param calculatorType
	 *            The {@link CalculatorTypes} property
	 * @param expression
	 *            The string expression
	 * @return The {@link String} expression result
	 */
	public String calculate(CalculatorTypes calculatorType, String expression) {
		StringCalculatorStrategy stringCalculatorStrategy = calculatorStrategyFactory.getCalculatorStrategy(calculatorType);
		if (stringCalculatorStrategy != null) {

			switch (calculatorType) {
			case STRING_CALCULATOR:
				return stringCalculatorStrategy.calculate(expression);
			default:
				throw null;
			}
		} else {
			return INVALID_EXPRESSION.getValue();
		}
	}
}