package com.capitaorbit.calculator.strategy;

/**
 * <p>
 * This interface declares methods for Calculator strategies
 * </p>
 * 
 * @author sachin_nikam
 *
 */
public interface StringCalculatorStrategy {
	/**
	 * Calculates the result of the given expression
	 * 
	 * @param expression
	 *            The string expression
	 */
	String calculate(String expression);
}