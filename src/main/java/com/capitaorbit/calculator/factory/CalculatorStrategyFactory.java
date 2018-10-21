package com.capitaorbit.calculator.factory;

import com.capitaorbit.calculator.strategy.StringCalculatorStrategy;
import com.capitaorbit.calculator.strategy.impl.StringCalculatorStrategyImpl;
import com.capitaorbit.common.CalculatorTypes;

/**
 * <p>
 * The {@link CalculatorStrategyFactory} class. It gets the reference of the
 * respective calculator strategy. In our case it is
 * {@link StringCalculatorStrategy}. We may add different types of calculator
 * strategies here as part of factory.
 * </p>
 * 
 * @author sachin_nikam
 *
 */
public class CalculatorStrategyFactory {

	/** The {@link StringCalculatorStrategy} reference */
	private final StringCalculatorStrategy stringCalculatorStrategy = new StringCalculatorStrategyImpl();

	/**
	 * <p>
	 * Gets the {@link StringCalculatorStrategy} based on given
	 * {@link CalculatorTypes}
	 * </p>
	 * 
	 * @param calculatorType
	 * @return
	 */
	public StringCalculatorStrategy getCalculatorStrategy(CalculatorTypes calculatorType) {
		switch (calculatorType) {
		case STRING_CALCULATOR:
			return stringCalculatorStrategy;
		default:
			return null;
		}
	}
}