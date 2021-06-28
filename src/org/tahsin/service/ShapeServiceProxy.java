package org.tahsin.service;

import org.tahsin.aspect.LoggingAspect;
import org.tahsin.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	
	public Circle getCircle() {
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}

}
