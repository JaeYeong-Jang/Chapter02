package com.javaex.ex17;

public class Triangle extends Shape {

	//fields
	private int width;
	private int height;
	
	//constructors
	public Triangle() {
		//super(); --> 부모 클래스에 Shape()생성자가 없으면 오류
		System.out.println("Triangle()");
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		//super(); --> 부모 클래스에 Shape()생성자가 없으면 오류
		//super.setFillColor(fillColor);
		//super.setLineColor(lineColor);
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("Triangle(4)");
	}
	//method g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//method
		@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}
	
	public void draw() {
		System.out.println("[면 색 : " + fillColor + ", 선 색 : " + lineColor + ", 너비 : " + this.width + ", 높이 : " + this.height + "] 도형을 그렸습니다.");
	}
	
}
