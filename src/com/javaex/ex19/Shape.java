package com.javaex.ex19;

public abstract class Shape {

	//fields
	protected String fillColor;
	protected String lineColor;
	
	//constructors
	public Shape() {
		// 이 생성자가 없으면 자식클래스들의 생성자 호출에서 오류발생
		// 인스턴스 생성에 있어서 부모클래스의 생성자 호출이 한번은 필요
		
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		
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
	
	//method
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	public void draw() {
		System.out.println("[면색 : " + this.fillColor +
				", 선색 : " + this.lineColor + "] 도형을 그렸습니다.");
	}
	
	public abstract double area();
	
}
