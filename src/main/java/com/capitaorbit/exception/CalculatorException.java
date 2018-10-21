package com.capitaorbit.exception;

public class CalculatorException extends RuntimeException {
	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -330897021892744462L;

	/**
	 * Constructor with no argument
	 */
	public CalculatorException() {
		super();
	}

	/**
	 * Constructor with single argument
	 * 
	 * @param message
	 *            The error message
	 */
	public CalculatorException(String message) {
		super(message);
	}

	/**
	 * Constructor with two argument
	 * 
	 * @param message
	 *            The error message
	 * @param throwable
	 *            The {@link Throwable} object
	 */
	public CalculatorException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public CalculatorException(Throwable throwable) {
		super(throwable);
	}
}