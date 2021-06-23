package org.tahsin.service;

import org.tahsin.model.Circle;
import org.tahsin.model.Triangle;

public class ShapeService {
	
	private Circle circle;
	
	public Circle getCircle() {
		return circle;
	}
	
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	public Triangle getTriangle() {
		return triangle;
	}
	
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	private Triangle triangle;
	
	

}
