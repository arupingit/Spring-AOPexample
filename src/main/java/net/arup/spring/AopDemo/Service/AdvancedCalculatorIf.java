/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.AopDemo.Service;

import org.springframework.stereotype.Service;

import net.arup.spring.AopDemo.Bo.CalculatorBo;

/**
 * The Interface AdvancedCalculatorIf.
 *
 * @author ARUP
 */

public interface AdvancedCalculatorIf {
	
	/**
	 * Multiplication.
	 *
	 * @param calcBo the calc bo
	 */
	public void multiplication(CalculatorBo calcBo);
	
	/**
	 * Division.
	 *
	 * @param calcBo the calc bo
	 */
	public void division(CalculatorBo calcBo);	
}
