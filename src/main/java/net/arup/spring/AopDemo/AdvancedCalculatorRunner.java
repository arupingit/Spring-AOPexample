/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.AopDemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.arup.spring.AopDemo.Bo.CalculatorBo;
import net.arup.spring.AopDemo.Config.BeanConfig;
import net.arup.spring.AopDemo.Service.AdvancedCalculatorIf;
import net.arup.spring.AopDemo.Service.CalculatorIf;


/**
 * The Class AppRunner.
 */
public class AdvancedCalculatorRunner 
{
	
    /**
     * The main method.
     * Adding new methods to object using AOP concept known as Introduction
     *
     * @param args the arguments
     */
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(BeanConfig.class);
        CalculatorBo calcBo = (CalculatorBo) context.getBean("calculatorBo");
        calcBo.setFirstInput(3);
        calcBo.setSecondInput(1);
        AdvancedCalculatorIf advancedCalcEngine =  (AdvancedCalculatorIf) context.getBean("advancedCalculator");
        advancedCalcEngine.division(calcBo);
        System.out.println(calcBo.getResult());
        CalculatorIf calcEngine = (CalculatorIf) advancedCalcEngine;
        calcEngine.subtraction(calcBo);
        System.out.println(calcBo.getResult());
        
    }
}
