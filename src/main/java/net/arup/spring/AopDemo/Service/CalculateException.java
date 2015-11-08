/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.AopDemo.Service;

/**
 * The Class CalculateException.
 *
 * @author ARUP
 */
public class CalculateException extends Exception{
	
	/**
	 * Instantiates a new calculate exception.
	 *
	 * @param s the s
	 * @param e the e
	 */
	public CalculateException(String s,Exception e) {
		super(s,e);
	}
}
