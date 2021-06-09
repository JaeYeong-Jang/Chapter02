package com.javaex.ex19;

public class Circle extends Shape {

	//fields
	private int radius;
	
	//constructors
	public Circle() {
		//super(); --> 부모 클래스에 Shape()생성자가 없으면 오류
		
	}
	
	public Circle(String fillColor, String lineColor, int radius) {
		//super(); --> 부모 클래스에 Shape()생성자가 없으면 오류
		//super.setFillColor(fillColor);
		//super.setLineColor(lineColor);
		super(fillColor,lineColor);
		this.radius = radius;
		
	}
	
	//method g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//method
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	public void draw() {
		System.out.println("[면 색 : " + fillColor + "선 색 : " + lineColor + ", 반지름 : " + this.radius + "] 원을 그렸습니다.");
	}
	
	public double area() {
		return radius*radius*3.14;
	}
	
}
