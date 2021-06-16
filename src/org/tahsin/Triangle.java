package org.tahsin;

import java.util.List;

public class Triangle {
	
	private List <Point> points;
	




	public List<Point> getPoints() {
		return points;
	}





	public void setPoints(List<Point> points) {
		this.points = points;
	}





	public void Draw() {
		
		for( Point point: points) {
			System.out.println("(" + point.getX() + ", " + point.getY() + ")");
		}
		
//		
//		System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
//		System.out.println("Point A = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
//		System.out.println("Point A = (" + getPointC().getX() + ", " + getPointC().getY() + ")");	
	}
	

}
