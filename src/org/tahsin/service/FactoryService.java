package org.tahsin.service;

import org.tahsin.model.Circle;
import org.tahsin.model.Triangle;

public class FactoryService {
	
	public Object getBean(String beanType) {
		if(beanType.equals("shapeService")) return new ShapeService();
		if(beanType.equals("circle")) return new Circle();
		if(beanType.equals("triangle")) return new Triangle();
		
		return null;
	}

}
