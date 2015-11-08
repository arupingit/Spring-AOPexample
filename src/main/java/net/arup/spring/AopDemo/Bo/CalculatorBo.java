/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.AopDemo.Bo;

import org.springframework.stereotype.Component;

/**
 * The Class CalculatorBo.
 *
 * @author ARUP
 */
@Component("calculatorBo")
public class CalculatorBo {

	/** The first input. */
	private int firstInput;
	
	/** The second input. */
	private int secondInput;
	
	/** The result. */
	private int result;
	
	/**
	 * Gets the first input.
	 *
	 * @return the first input
	 */
	public int getFirstInput() {
		return firstInput;
	}
	
	/**
	 * Sets the first input.
	 *
	 * @param firstInput the new first input
	 */
	public void setFirstInput(int firstInput) {
		this.firstInput = firstInput;
	}
	
	/**
	 * Gets the second input.
	 *
	 * @return the second input
	 */
	public int getSecondInput() {
		return secondInput;
	}
	
	/**
	 * Sets the second input.
	 *
	 * @param secondInput the new second input
	 */
	public void setSecondInput(int secondInput) {
		this.secondInput = secondInput;
	}
	
	/**
	 * Gets the result.
	 *
	 * @return the result
	 */
	public int getResult() {
		return result;
	}
	
	/**
	 * Sets the result.
	 *
	 * @param result the new result
	 */
	public void setResult(int result) {
		this.result = result;
	}
	
	
}
