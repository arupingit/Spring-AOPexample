/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.AopDemo.Config;

import net.arup.spring.AopDemo.Service.CalculateException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * The Class AspectConfig.
 * 
 * Common AspectJ annotations :
 *
 *  @Before – Run before the method execution
 *  @After – Run after the method returned a result
 *  @AfterReturning – Run after the method returned a result, intercept the returned result as well.
 *  @AfterThrowing – Run after the method throws an exception
 *  @Around – Run around the method execution, combine all three advices above.
 *
 */
@Aspect
public class AspectConfig {

	/**
	 * Calculate.
	 */
	@Pointcut("execution(* net.arup.spring.AopDemo.Service..*(..))")
	public void calculate(){}
	
	/**
	 * Log before.
	 *
	 * @param joinpoint the joinpoint
	 */
	@Before("calculate()")
	public void logBefore(JoinPoint joinpoint){
		System.out.println("log before " + joinpoint.getSignature().getName());
	}
	
	/**
	 * Log after.
	 *
	 * @param joinpoint the joinpoint
	 */
	@After("calculate()")
	public void logAfter(JoinPoint joinpoint){
		System.out.println("log after " + joinpoint.getSignature().getName());
	}
	
	/**
	 * Log around.
	 *
	 * @param joinpoint the joinpoint
	 * @return the object
	 * @throws Throwable the throwable
	 */
	@Around("calculate()")
	public Object logAround(ProceedingJoinPoint joinpoint) throws Throwable{
		Object obj = null;
		long startTime = System.currentTimeMillis();
		obj = joinpoint.proceed();		
		long stopTime = System.currentTimeMillis();
		System.out.println("time taken to execute method :" + joinpoint.getSignature().getName() 
				+ " is :" + (stopTime - startTime) + "ms");
		return obj;
	}
	
	/**
	 * Calculate exception intercept.
	 *
	 * @param joinpoint the joinpoint
	 * @param ex the ex
	 * @throws CalculateException the calculate exception
	 */
	@AfterThrowing(pointcut="calculate()",throwing="ex")
	public void calculateExceptionIntercept(JoinPoint joinpoint,Exception ex) throws CalculateException{
		throw new CalculateException("CalculateException is thrown from : " +
						joinpoint.getSignature().getName()+ " reason :" +ex.getMessage(),ex);
	}
}
