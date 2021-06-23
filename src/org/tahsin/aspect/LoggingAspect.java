package org.tahsin.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect 
public class LoggingAspect {
	
	@Before("allGetters() && allCircleMethods()")
	
	// JoinPoint is the method that called this Advice 
	public void LoggingAdvice(JoinPoint joinPoint) {
		
		
		System.out.println(joinPoint.toString());
	}
	
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice Executed");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	@Pointcut("within(org.tahsin.model.Circle)")
	public void allCircleMethods() {}
	
	

}
