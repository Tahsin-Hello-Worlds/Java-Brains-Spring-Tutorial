package org.tahsin.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
// import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
// import org.tahsin.model.Circle;


@Aspect 
public class LoggingAspect {
	
	@After("allGetters() && allCircleMethods()")
	
	// JoinPoint is the method that called this Advice 
	public void LoggingAdvice(JoinPoint joinPoint) {
		// Circle circle = (Circle) joinPoint.getTarget();
		
		// System.out.println(joinPoint.getTarget());
	}
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringArgumentMethods(String name, String returnString) {
		System.out.println("A method that takes string arguments has been called. The value is " + name + "The output value is " + returnString);
	}
	
	
	@AfterReturning("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice Executed");
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex") 
	public void exceptionAdvice(String name, RuntimeException ex){
		System.out.println("An Exception has been thrown" + ex);
	}
	
	@Around("@annotation(org.tahsin.aspect.Loggable)")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object returnValue = null;
		
		try {
			System.out.println("Before advice");
			proceedingJoinPoint.proceed();
			System.out.println("After Returning");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
		
		System.out.println("After Finally");
		
		return returnValue;
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	
	@Pointcut("within(org.tahsin.model.Circle)")
	public void allCircleMethods() {}
	
}
