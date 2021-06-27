package org.tahsin.model;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circle's setter called");
		// throw (new RuntimeException());
	}
	
	public String setNameandReturn(String name, String returnString) {
		this.name = name;
		System.out.println("Circle Setter called");
		return name;
	}
	
	

}
