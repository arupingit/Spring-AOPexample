/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.AopDemo.Service;

import org.springframework.stereotype.Service;

import net.arup.spring.AopDemo.Bo.CalculatorBo;

/**
 * The Class AdvancedCalculatorImpl.
 *
 * @author ARUP
 */
@Service("advancedCalculator")
public class AdvancedCalculatorImpl implements AdvancedCalculatorIf {

	/* (non-Javadoc)
	 * @see net.arup.spring.AopDemo.Service.AdvancedCalculatorIf#multiplication(net.arup.spring.AopDemo.Bo.CalculatorBo)
	 */
	public void multiplication(CalculatorBo calcBo) {
		calcBo.setResult(calcBo.getFirstInput() * calcBo.getSecondInput());
		}

	/* (non-Javadoc)
	 * @see net.arup.spring.AopDemo.Service.AdvancedCalculatorIf#division(net.arup.spring.AopDemo.Bo.CalculatorBo)
	 */
	public void division(CalculatorBo calcBo) {
		calcBo.setResult(calcBo.getFirstInput() / calcBo.getSecondInput());
		}

}
