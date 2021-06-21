package org.tahsin;

import javax.annotation.Resource;

public class Circle implements Shape {
	
	private Point center;
	
	

	public Point getCenter() {
		return center;
	}

	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}



	public void draw() {
		System.out.println("Drawing Triangle");
		System.out.println("Circle Point is : (" + center.getX() + ", " + center.getY() + ")");
	}
	
}
