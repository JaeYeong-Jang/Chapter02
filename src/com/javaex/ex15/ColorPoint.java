package com.javaex.ex15;

public class ColorPoint extends Point {

	//fields
	private String color;
	
	//constructors
	public ColorPoint(String color) {
		this.color = color;
		System.out.println("Color(1)");
	}
	
	public ColorPoint(int x, int y, String color) {
		super();
		super.setX(x);
		super.setY(y);
		this.color = color;
		System.out.println("Color(3)");
	}
	
	//method g/s
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//method
	public void showInfo() {
		System.out.println("======================");
		System.out.println("color : " +this.color);
		System.out.println("point x : " + super.x);
		System.out.println("point y : " + super.y);
		System.out.println("======================");
	}
	
}
