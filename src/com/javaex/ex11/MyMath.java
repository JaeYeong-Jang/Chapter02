package com.javaex.ex11;

public class MyMath {

	// 필드
	private static double pi = 3.14;
	
	// 생성자
	// 생성자를 안만들면 default 생성자를 쓰겠다는 의미.
	
	// 메서드 게터세터
	
	// 메서드 일반
	public static int plus(int a, int b){
		
		int result = a+b; // 복잡한 계산식 이라고 가정
		return result;
	}
	
	public static double plus(double a, double b) {
		double result = a+b;
		return result;
	}
	
	public static double plus(double a, int b) {
		double result = a+b;
		return result;
	}
	
	public static double plus(int a, double b) {
		double result = a+b;
		return result;
	}
	
	public static double circleArea(int radius) {
		double result = radius * radius * pi;
		return result;
	}
	
}
