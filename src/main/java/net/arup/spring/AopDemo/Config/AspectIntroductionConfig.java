/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.AopDemo.Config;

import net.arup.spring.AopDemo.Service.CalculatorIf;
import net.arup.spring.AopDemo.Service.CalculatorImpl;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * The Class AspectIntroductionConfig.
 *
 * @author ARUP
 */
@Aspect
public class AspectIntroductionConfig {

	/** The calculator. */
	@DeclareParents(value="net.arup.spring.AopDemo.Service.AdvancedCalculatorIf+",
			defaultImpl=CalculatorImpl.class)
	public static CalculatorIf calculator;
}
