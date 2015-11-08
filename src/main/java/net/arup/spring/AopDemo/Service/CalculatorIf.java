/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.AopDemo.Service;

import org.springframework.stereotype.Service;

import net.arup.spring.AopDemo.Bo.CalculatorBo;

/**
 * The Interface CalculatorIf.
 */
public interface CalculatorIf {
	
	/**
	 * Addition.
	 *
	 * @param calcBo the calc bo
	 */
	public void addition(CalculatorBo calcBo);
	
	/**
	 * Subtraction.
	 *
	 * @param calcBo the calc bo
	 */
	public void subtraction(CalculatorBo calcBo);	
}
