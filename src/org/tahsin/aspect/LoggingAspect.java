package org.tahsin.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.tahsin.model.Circle;


@Aspect 
public class LoggingAspect {
	
	@Before("allGetters() && allCircleMethods()")
	
	// JoinPoint is the method that called this Advice 
	public void LoggingAdvice(JoinPoint joinPoint) {
		// Circle circle = (Circle) joinPoint.getTarget();
		
		// System.out.println(joinPoint.getTarget());
	}
	
	@Before("args(name)")
	public void stringArgumentMethods(String name) {
		System.out.println("A method that takes string arguments has been called. The value is " + name);
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
