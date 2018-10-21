package com.capitaorbit.calculator;

import static com.capitaorbit.common.CalculatorTestConstant.DOT;
import static com.capitaorbit.common.CalculatorTypes.STRING_CALCULATOR;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.capitaorbit.common.CalculatorErrorConstant;
import com.capitaorbit.common.CalculatorTestConstant;

/**
 * <p>
 * The {@link Calculator} test class
 * </p>
 * 
 * @author sachin_nikam
 *
 */
public class StringCalculatorTest {

	/** The {@link Logger} instance */
	public static final Logger LOGGER = LoggerFactory.getLogger(StringCalculatorTest.class);
	/** DELTA constant for assertion */
	public static final BigDecimal DELTA = new BigDecimal(0.01);
	/** The current class name */
	public final String className = this.getClass().getName();
	/** The {@link Calculator} instance */
	private Calculator stringCalculator = null;

	/**
	 * Before test method
	 */
	@Before
	public void setUp() {
		stringCalculator = new Calculator();
	}

	@Test
	public void whenWeHaveAEmptyStringThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAEmptyStringThenWeGetAInvalidExpression");
		String equation = StringUtils.EMPTY;
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAEmptyStringThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveANullStringThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveANullStringThenWeGetAInvalidExpression");
		String equation = null;
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveANullStringThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringStartWithExponentialOperatorThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringStartWithExponentialOperatorThenWeGetAInvalidExpression");
		String equation = CalculatorTestConstant.OPERATOR_EXPONENTIONIAL.getValue();
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringStartWithExponentialOperatorThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringStartWithMultiplicationOperatorThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringStartWithMultiplicationOperatorThenWeGetAInvalidExpression");
		String equation = CalculatorTestConstant.OPERATOR_MULTIPLICATION.getValue();
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringStartWithMultiplicationOperatorThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringStartWithDivisionOperatorThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringStartWithDivisionOperatorThenWeGetAInvalidExpression");
		String equation = CalculatorTestConstant.OPERATOR_DIVISION.getValue();
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringStartWithDivisionOperatorThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringStartWithAdditionOperatorThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringStartWithAdditionOperatorThenWeGetAInvalidExpression");
		String equation = CalculatorTestConstant.OPERATOR_ADDITION.getValue();
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringStartWithAdditionOperatorThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringStartWithSubtractionOperatorThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringStartWithSubtractionOperatorThenWeGetAInvalidExpression");
		String equation = CalculatorTestConstant.OPERATOR_SUBTRACTION.getValue();
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringStartWithSubtractionOperatorThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringAsDotThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveANullStringThenWeGetAInvalidExpression");
		String equation = DOT.getValue();
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringAsDotThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringEndWithExponentialOperatorThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringEndWithExponentialOperatorThenWeGetAInvalidExpression");
		String equation = CalculatorTestConstant.OPERATOR_EXPONENTIONIAL.getValue();
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringEndWithExponentialOperatorThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringEndWithMultiplicationOperatorThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringEndWithMultiplicationOperatorThenWeGetAInvalidExpression");
		String equation = CalculatorTestConstant.OPERATOR_MULTIPLICATION.getValue();
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringEndWithMultiplicationOperatorThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringEndWithDivisionOperatorThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringEndWithDivisionOperatorThenWeGetAInvalidExpression");
		String equation = CalculatorTestConstant.OPERATOR_DIVISION.getValue();
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringEndWithDivisionOperatorThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringEndWithAdditionOperatorThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringEndWithAdditionOperatorThenWeGetAInvalidExpression");
		String equation = CalculatorTestConstant.OPERATOR_ADDITION.getValue();
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringEndWithAdditionOperatorThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringEndWithSubtractionOperatorThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringEndWithSubtractionOperatorThenWeGetAInvalidExpression");
		String equation = CalculatorTestConstant.OPERATOR_SUBTRACTION.getValue();
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringEndWithSubtractionOperatorThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringOfOneThenWeGetAStringOfOne() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringOfOneThenWeGetAStringOfOne");
		String equation = "1";
		BigDecimal expectedResult = new BigDecimal(1).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringOfOneThenWeGetAStringOfOne");
	}
	
	@Test
	public void whenWeHaveAStringWithValidParenthesesAfterAtBothEndThenWeGetAProperResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithValidParenthesesAfterAtBothEndThenWeGetAProperResult");
		String equation = "((2+1))";
		BigDecimal expectedResult = new BigDecimal(3).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithValidParenthesesAfterAtBothEndThenWeGetAProperResult");
	}
	
	@Test
	public void whenWeHaveAStringWithInValidParenthesesAfterAtBothEndThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithInValidParenthesesAfterAtBothEndThenWeGetAInvalidExpression");
		String equation = "((2+1)";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithInValidParenthesesAfterAtBothEndThenWeGetAInvalidExpression");
	}

	@Test(expected = NumberFormatException.class)
	public void whenWeHaveAEmptyThenWeGetNumberFormatException() {
		LOGGER.info("Start:" + className + ".whenWeHaveAEmptyThenWeGetNumberFormatException");
		String equation = StringUtils.EMPTY;
		BigDecimal expectedResult = null;

		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAEmptyThenWeGetNumberFormatException");
	}

	@Test
	public void whenWeHaveAStringWithExponential() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithExponential");
		String equation = "7+(6*5^2+3-4/2)";
		BigDecimal expectedResult = new BigDecimal(158).setScale(2, BigDecimal.ROUND_HALF_EVEN);

		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithExponential");
	}

	@Test
	public void whenWeHaveAStringOfTwoThenWeGetAStringOfTwo() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringOfTwoThenWeGetAStringOfTwo");
		String equation = "2";
		BigDecimal expectedResult = new BigDecimal(2).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringOfTwoThenWeGetAStringOfTwo");
	}

	@Test
	public void whenWeHaveAStringOfOnePlusTwoThenWeGetAStringOfThree() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringOfOnePlusTwoThenWeGetAStringOfThree");
		String equation = "1+2";
		BigDecimal expectedResult = new BigDecimal(3).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringOfOnePlusTwoThenWeGetAStringOfThree");
	}

	@Test
	public void whenWeHaveAStringOfOnePlusTwoPlusTwoThenWeGetAStringOfThree() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringOfOnePlusTwoPlusTwoThenWeGetAStringOfThree");
		String equation = "1+2+2";
		BigDecimal expectedResult = new BigDecimal(5).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringOfOnePlusTwoPlusTwoThenWeGetAStringOfThree");
	}

	@Test
	public void whenWeHaveAStringOfOnePlusTwoPlusTwoMinusTwoThenWeGetAStringOfThree() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringOfOnePlusTwoPlusTwoThenWeGetAStringOfThree");
		String equation = "1+2+2-2";
		BigDecimal expectedResult = new BigDecimal(3).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringOfOnePlusTwoPlusTwoThenWeGetAStringOfThree");
	}

	@Test
	public void whenWeHaveAStringWithEqualToOperatorThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithEqualToOperatorThenWeGetAInvalidExpression");
		String equation = "3=3";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithEqualToOperatorThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringWithAtTheRateOperatorThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithAtTheRateOperatorThenWeGetAInvalidExpression");
		String equation = "3@3";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithAtTheRateOperatorThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringWithHashLetterThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithHashLetterThenWeGetAInvalidExpression");
		String equation = "3#3";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithHashLetterThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringWithNumberAndSuffixAsLeftParenhesesThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithNumberAndSuffixAsLeftParenhesesThenWeGetAInvalidExpression");
		String equation = "7+(67(56*2))";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithNumberAndSuffixAsLeftParenhesesThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringWithMultiplicationFollowedByPlusThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithMultiplicationFollowedByPlusThenWeGetAInvalidExpression");
		String equation = "8*+7";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithMultiplicationFollowedByPlusThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringWithPlusMinusMultiplicationOPerationsThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithPlusMinusMultiplicationOPerationsThenWeGetAValidResult");
		String equation = "(8*5/8)-(3/1)-5";
		BigDecimal expectedResult = new BigDecimal(-3.00).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithPlusMinusMultiplicationOPerationsThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithRightParenthesesNumberLeftParenthesesThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithRightParenthesesNumberLeftParenthesesThenWeGetAInvalidExpression");
		String equation = "3+(2)5(6)";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithRightParenthesesNumberLeftParenthesesThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringWithMoreThanTwoDecimalsThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithMoreThanTwoDecimalsThenWeGetAValidResult");
		String equation = "3.23+2.4567 *6";
		BigDecimal expectedResult = new BigDecimal(17.97).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithMoreThanTwoDecimalsThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithMoreThanTwoDecimalsAndParenthesesThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithMoreThanTwoDecimalsAndParenthesesThenWeGetAValidResult");
		String equation = "3.23+2.4567 *(6)";
		BigDecimal expectedResult = new BigDecimal(17.97).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithMoreThanTwoDecimalsAndParenthesesThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithPlusPlusAtEndThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithPlusPlusAtEndThenWeGetAInvalidExpression");
		String equation = "2++";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithPlusPlusAtEndThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringWithPlusPlusAtStartThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithPlusPlusAtStartThenWeGetAInvalidExpression");
		String equation = "++2";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithPlusPlusAtStartThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringWithMinusMinusAtEndThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithMinusMinusPlusAtEndThenWeGetAInvalidExpression");
		String equation = "2--";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithMinusMinusPlusAtEndThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringWithMinusMinusAtStartThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithMinusMinusAtStartThenWeGetAInvalidExpression");
		String equation = "--2";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithMinusMinusAtStartThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringWithMinusMinusPlusAtStartThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithMinusMinusPlusAtStartThenWeGetAInvalidExpression");
		String equation = "--+2";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithMinusMinusPlusAtStartThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringWithPointZeroOneMinusDecimalThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithPointZeroOneMinusDecimalThenWeGetAValidResult");
		String equation = ".01-.0";
		BigDecimal expectedResult = new BigDecimal(0.01).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithPointZeroOneMinusDecimalThenWeGetAValidResult");
	}

	@Test
	public void whenWeHaveAStringWithPointZeroOneMinusPointZeroOneThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithPointZeroOneMinusPointZeroOneThenWeGetAValidResult");
		String equation = ".01*.01";
		BigDecimal expectedResult = new BigDecimal(0.00).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithPointZeroOneMinusPointZeroOneThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithPointZeroOneMinusPointZeroTwoThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithPointZeroOneMinusPointZeroTwoThenWeGetAValidResult");
		String equation = ".01-.02";
		BigDecimal expectedResult = new BigDecimal(-0.01).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithPointZeroOneMinusPointZeroTwoThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithMultiplePlusAndMinusThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithMultiplePlusAndMinusThenWeGetAValidResult");
		String equation = "0.01+0.03-0.08";
		BigDecimal expectedResult = new BigDecimal(-0.04).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithMultiplePlusAndMinusThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithDoubleParenthesesAtBothEndAndNumberMultiplicationThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithDoubleParenthesesAtBothEndAndNumberMultiplicationThenWeGetAValidResult");
		String equation = "((2*1))";
		BigDecimal expectedResult = new BigDecimal(2.00).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithDoubleParenthesesAtBothEndAndNumberMultiplicationThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithDoubleParenthesesAtBothEndAndNumberAdditionThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithDoubleParenthesesAtBothEndAndNumberAdditionThenWeGetAValidResult");
		String equation = "((2+1))";
		BigDecimal expectedResult = new BigDecimal(3.00).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithDoubleParenthesesAtBothEndAndNumberAdditionThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithExponentialOperatorWithDecimalNumberThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithExponentialOperatorWithDecimalNumberThenWeGetAValidResult");
		String equation = "3^0.01";
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertNotNull(actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithExponentialOperatorWithDecimalNumberThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithExponentialOperatorWithDecimalThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithExponentialOperatorWithDecimalThenWeGetAValidResult");
		String equation = "3^0.1";
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertNotNull(actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithExponentialOperatorWithDecimalThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithWholeNumberExponentialThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithWholeNumberExponentialThenWeGetAValidResult");
		String equation = "3^2";
		BigDecimal expectedResult = new BigDecimal(9).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithWholeNumberExponentialThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithWholeNumberExponentialAndOtherOperatorsThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithWholeNumberExponentialAndOtherOperatorsThenWeGetAValidResult");
		String equation = "7+(6*5^2+3-4/2) ";
		BigDecimal expectedResult = new BigDecimal(158);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithWholeNumberExponentialAndOtherOperatorsThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithWholeNumberExponentialAndSpaceAtLastThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithWholeNumberExponentialAndSpaceAtLastThenWeGetAValidResult");
		String equation = "7+(6*5^2+3-4/2) ";
		BigDecimal expectedResult = new BigDecimal(158);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithWholeNumberExponentialAndSpaceAtLastThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithWholeNumberExponentialAndSpaceAtStartThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithWholeNumberExponentialAndSpaceAtStartThenWeGetAValidResult");
		String equation = " 7+(6*5^2+3-4/2)";
		BigDecimal expectedResult = new BigDecimal(158);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithWholeNumberExponentialAndSpaceAtStartThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithWholeNumberExponentialAndSpaceAtBothEndThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithWholeNumberExponentialAndSpaceAtBothEndThenWeGetAValidResult");
		String equation = " 7+(6*5^2+3-4/2) ";
		BigDecimal expectedResult = new BigDecimal(158);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithWholeNumberExponentialAndSpaceAtBothEndThenWeGetAValidResult");
	}
	
	@Test(expected = NullPointerException.class)
	public void whenWeHaveAStringWithNoCalculatorTypeThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithWholeNumberExponentialAndSpaceAtBothEndThenWeGetAValidResult");
		String equation = " 7+(6*5^2+3-4/2) ";
		BigDecimal expectedResult = new BigDecimal(158);
		String actualResult = stringCalculator.calculate(null, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithWholeNumberExponentialAndSpaceAtBothEndThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithBigNumbersExponentionThenWeGetAInfinity() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithBigNumbersExponentionThenWeGetAInfinity");
		String equation = "34567^4325";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithBigNumbersExponentionThenWeGetAInfinity");
	}
	
	@Test
	public void whenWeHaveAStringWithBigNumbersMultiplicationThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithBigNumbersMultiplicationThenWeGetAValidResult");
		String equation = "34567*4325";
		BigDecimal expectedResult = new BigDecimal(149502275);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithBigNumbersMultiplicationThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithBigNumbersDivisionThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithBigNumbersDivisionThenWeGetAValidResult");
		String equation = "34567/4325";
		BigDecimal expectedResult = new BigDecimal(7.99).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithBigNumbersDivisionThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithSpecialCharactersOtherThanAllowedThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithSpecialCharactersOtherThanAllowedThenWeGetAValidResult");
		String equation = "1+3&&&##+2";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithSpecialCharactersOtherThanAllowedThenWeGetAInvalidExpression");
	}

	@Test
	public void whenWeHaveAStringAndNumberThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringAndNumberThenWeGetAInvalidExpression");
		String equation = "capita2";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringAndNumberThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringAndNumberOperationThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringAndNumberThenWeGetAInvalidExpression");
		String equation = "2*capita+2+1";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringAndNumberThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringThenWeGetAInvalidExpression");
		String equation = "capita";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringWithTwoParenthesesAtBothEndWithoutOperationThenWeGetAInvalidExpression() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithTwoParenthesesAtBothEndWithoutOperationThenWeGetAInvalidExpression");
		String equation = "(())";
		String expectedResult = "I";
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithTwoParenthesesAtBothEndWithoutOperationThenWeGetAInvalidExpression");
	}
	
	@Test
	public void whenWeHaveAStringWithTwoParenthesesAtBothEndWithOperationThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithTwoParenthesesAtBothEndWithOperationThenWeGetAValidResult");
		String equation = "((2*2))";
		BigDecimal expectedResult = new BigDecimal(4);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithTwoParenthesesAtBothEndWithOperationThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithComplexExponentionThenWeGetAInfinity() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithComplexExponentionThenWeGetAInfinity");
		String equation = "2^4567";
		String expectedResult = CalculatorErrorConstant.INVALID_EXPRESSION.getValue();
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithComplexExponentionThenWeGetAInfinity");
	}
	
	@Test
	public void whenWeHaveAStringWithComplexMultiplicationOperationThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithComplexMultiplicationOperationThenWeGetAValidResult");
		String equation = "2345*4567";
		BigDecimal expectedResult = new BigDecimal(10709615);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithComplexMultiplicationOperationThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithComplexDivisionOperationThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithComplexDivisionOperationThenWeGetAValidResult");
		String equation = "233453343445/3443344567";
		BigDecimal expectedResult = new BigDecimal(67.80).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithComplexDivisionOperationThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithComplexAdditionOperationThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithComplexAdditionOperationThenWeGetAValidResult");
		String equation = "233453445+34433447+234233+234233";
		BigDecimal expectedResult = new BigDecimal(268355358);
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertTrue(expectedResult.compareTo(new BigDecimal(actualResult)) == 0);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithComplexAdditionOperationThenWeGetAValidResult");
	}
	
	@Test
	public void whenWeHaveAStringWithComplexSubtractionOperationThenWeGetAValidResult() {
		LOGGER.info("Start:" + className + ".whenWeHaveAStringWithComplexAdditionOperationThenWeGetAValidResult");
		String equation = "233453445-34433447-234233+234233-3434534534534-34534534535345-231213123";
		String expectedResult = "-37969101263004";
		String actualResult = stringCalculator.calculate(STRING_CALCULATOR, equation);
		assertEquals(expectedResult, actualResult);
		LOGGER.info("End:" + className + ".whenWeHaveAStringWithComplexAdditionOperationThenWeGetAValidResult");
	}
	
	/**
	 * After test method
	 */
	@After
	public void tearDown() {
		stringCalculator = null;
	}

}
