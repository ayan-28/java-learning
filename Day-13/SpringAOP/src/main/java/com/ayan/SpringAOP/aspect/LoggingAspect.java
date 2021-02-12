package com.ayan.SpringAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	/**
	 * Following is the definition for a PointCut to select all the methods
	 * available. So advice will be called for all the methods.
	 */
	@Pointcut("execution(* com.ayan.*.*.*.get*(..))")
	private void selectGetters() {
	}

	/**
	 * This is the method which I would like to execute before a selected method
	 * execution.
	 */
	@Before("selectGetters()")
	public void beforeGet(JoinPoint joinPoint) {
		System.out.println("Getting data from customer profile, using : " + joinPoint.getSignature().getName());
	}
	
	 @After("execution(* com.ayan.*.*.*.set*(..))")
	    public void logAfter(JoinPoint joinPoint) {

	        System.out.println("logAfter() is running!");
	        System.out.println("The action performed successfully by method : " + joinPoint.getSignature().getName());
	        System.out.println("******");
	    }
}
