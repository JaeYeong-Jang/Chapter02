package com.javaex.ex06;

public class Point {
	// 필드
	private int x;
	private int y;
	
	// 생성자 
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x) { // 자료형이 같으면 사용하지 못한다.
		this.x = x;
	}
	
	/*
	public Point(int y) { // 자료형이 같으면 사용하지 못한다.
		this.y = y;
	}
	*/
	
	// 메서드 세터게터

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
	
	// 메서드 일반
	public void draw() {
		System.out.println("점[x=" + x +", y=" + y + "]을 그렸습니다.");
	}
	
	public void draw(boolean flag) { // 메소드 오버로딩
		if(flag == true) {
			System.out.println("점[x=" + x +", y=" + y + "]을 그렸습니다.");
		}else {
			System.out.println("점[x=" + x +", y=" + y + "]을 지웠습니다.");
		}
	}
	
}
