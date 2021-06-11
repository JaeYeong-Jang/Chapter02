package com.javaex.ex21;

public class Ex01 {

	// NullPointerException
	
	public static void main(String[]args) {
	
	Rectangle r01 = new Rectangle("red", "black", 5, 5);
	
	r01 = null;
	
	try {
		r01.draw();
	}catch(NullPointerException e) {
		r01 = new Rectangle("black", "black", 100, 100);
		r01.draw();
	}
	
	}
}
