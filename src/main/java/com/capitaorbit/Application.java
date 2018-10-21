package com.capitaorbit;

import static com.capitaorbit.common.CalculatorConstant.CASE_NUMBER;
import static com.capitaorbit.common.CalculatorConstant.STRING_SPACE_REGEX;

import java.util.Scanner;
import java.util.stream.IntStream;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

import com.capitaorbit.calculator.Calculator;
import com.capitaorbit.common.CalculatorTypes;

/**
 * <p>
 * Main class
 * </p>
 * 
 * @author sachin_nikam
 *
 */
public class Application {

	/**
	 * The {@link Logger} object
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	/**
	 * The current class name
	 */
	public final String className = this.getClass().getName();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.info(Level.INFO.name(), "Start: StringCalculator.main");
		Scanner input = new Scanner(System.in);
		try {
			Calculator calculator = new Calculator();
			System.out.println("Please enter the number of expressions and then enter expressions:");
			int expressionsCount = input.nextInt();
			String[] expressions = new String[expressionsCount];
			input.nextLine();

			for (int i = 0; i < expressionsCount; i++) {
				expressions[i] = input.nextLine().replaceAll(STRING_SPACE_REGEX.getValue(), StringUtils.EMPTY);
			}

			IntStream.range(0, expressions.length).forEach(
					index -> System.out.println(CASE_NUMBER.getValue() + (index + 1) + ": "
							+ calculator.calculate(CalculatorTypes.STRING_CALCULATOR, expressions[index])));
		} finally {
			input.close();
		}
		LOGGER.info(Level.INFO.name(), "End: StringCalculator.main");
	}
}
