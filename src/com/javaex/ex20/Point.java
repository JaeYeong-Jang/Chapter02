package com.javaex.ex20;

public class Point implements Drawable {

	//fields
	private int x;
	private int y;
	
	//constructors
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
				
	}
	//method g/s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//method
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw() {
		System.out.println("[x = " + this.x + ",y = " + this.y + "] 점을 그렸습니다.");
	}
	
}
