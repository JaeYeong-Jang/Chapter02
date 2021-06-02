package com.javaex.ex03;

public class Method_point_m {

	private int x;
	private int y;
	
	public void setXpoint(int i_x) { // int x --> 매개변수의 이름을 x로 설정하여 x = x; 이렇게 헷갈리게 되면 this.x = x; 이렇게 표기해주어서 헷갈림을 방지한다.
		x = i_x;
	}
	
	public void setYpoint(int i_y) {
		y = i_y;
	}
	
	public int getXpoint() {
		return x;
	}
	
	public int getYpoint() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[x=" + x +", y=" + y + "]을 그렸습니다.");
		System.out.println("=======================================");
	}
	
}
