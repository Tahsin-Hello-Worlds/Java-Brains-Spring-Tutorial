package org.tahsin;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	public void Draw() {
		System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
		System.out.println("Point A = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
		System.out.println("Point A = (" + getPointC().getX() + ", " + getPointC().getY() + ")");	
	}



//	@Override
//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("InitializingBean init method called for Triangle");
//		
//	}
//
//
//
//	@Override
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("Desposable Beans called for the Triangle");
//		
//	}
	
	
	public void myInit() {
		System.out.println("myInit method called for triangle");
	}
	
	public void cleanUp () {
		System.out.println("My clean Up method called for triange");
	}

}