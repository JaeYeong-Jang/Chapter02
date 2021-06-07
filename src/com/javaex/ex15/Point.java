package com.javaex.ex15;

public class Point {

	//fields
	protected int x;
	protected int y;
	
	//constructors
	public Point() {
		System.out.println("point()");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("point(2)");
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
	public void showInfo() {
		System.out.println("======================");
		System.out.println("point x : " + this.x);
		System.out.println("point y : " + this.y);
		System.out.println("======================");
	}
	
	
}
