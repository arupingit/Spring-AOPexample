/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.AopDemo.Service;

import net.arup.spring.AopDemo.Bo.CalculatorBo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * The Class Calculator.
 *
 * @author ARUP
 */
@Service("calculator")
public class CalculatorImpl implements CalculatorIf{

	/**
	 * Addition.
	 *
	 * @param calcBo the calc bo
	 */
	public void addition(CalculatorBo calcBo){
		calcBo.setResult(calcBo.getFirstInput() + calcBo.getSecondInput());
	}
	
	/**
	 * Subtraction.
	 *
	 * @param calcBo the calc bo
	 */
	public void subtraction(CalculatorBo calcBo){
		int result = calcBo.getFirstInput() - calcBo.getSecondInput();
		if(result<0){
			throw new IllegalArgumentException("Illegal Arguments :"+calcBo.getFirstInput() +" , "+calcBo.getSecondInput());
		}
		calcBo.setResult(result);
	}
}
