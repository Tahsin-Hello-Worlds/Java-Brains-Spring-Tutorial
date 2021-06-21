package org.tahsin;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Triangle triangle = new Triangle();
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		 
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		
		System.out.println( context.getMessage("greeting", null, "Default Greeting", null)); 

	}

}
