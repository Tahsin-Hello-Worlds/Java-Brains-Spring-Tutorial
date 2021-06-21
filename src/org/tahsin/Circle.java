package org.tahsin;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;


@Service
public class Circle implements Shape {
	
	private Point center;
	
	

	public Point getCenter() {
		return center;
	}

	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}



	public void draw() {
		System.out.println("Drawing Triangle");
		System.out.println("Circle Point is : (" + center.getX() + ", " + center.getY() + ")");
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Circle Destroyed");
	}
	
}
