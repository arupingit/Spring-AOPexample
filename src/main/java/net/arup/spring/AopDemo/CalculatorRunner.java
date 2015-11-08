/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.AopDemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.arup.spring.AopDemo.Bo.CalculatorBo;
import net.arup.spring.AopDemo.Config.BeanConfig;
import net.arup.spring.AopDemo.Service.CalculatorIf;


/**
 * The Class AppRunner.
 */
public class CalculatorRunner 
{
	
    /**
     * The main method.
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
        CalculatorIf calcEngine = (CalculatorIf) context.getBean("calculator");
        calcEngine.subtraction(calcBo);
        System.out.println(calcBo.getResult());
    }
}
