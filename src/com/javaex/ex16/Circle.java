package com.javaex.ex16;

public class Circle {

	//fields
	private String fillColor;
	private String lineColor;
	private int radius;

	//constructors
	public Circle() {
		
	}
	
	public Circle(String fillColor, String lineColor, int radius) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.radius = radius;
		
	}

	//method g/s
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//method
	@Override
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", radius=" + radius + "]";
	}
	
	public void draw() {
		System.out.println("[면색 : " + this.fillColor + ", 선색 : " + this.lineColor + ", 반지름 : " + this.radius + "] 원을 그렸습니다.");
	}
	
}
