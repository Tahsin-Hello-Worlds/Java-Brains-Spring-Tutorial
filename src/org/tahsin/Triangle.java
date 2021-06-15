package org.tahsin;

import java.util.List;

public class Triangle {
	
	private List<Point> points;
	

	
	public List<Point> getPoints() {
		return points;
	}



	public void setPoints(List<Point> points) {
		this.points = points;
	}



	public void Draw() {
		
		for(Point point : points ) {
			System.out.println("Point A = (" + point.getX() + ", " + point.getY() + ")");
		}
	}

}
