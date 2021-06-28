package org.tahsin.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
// import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
// import org.aspectj.lang.annotation.Before;
// import org.aspectj.lang.annotation.Pointcut;
// import org.tahsin.model.Circle;


public class LoggingAspect {
	
	
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
	
	public void loggingAdvice() {
		System.out.println("Logging from the advice");
	}
	
	
}
