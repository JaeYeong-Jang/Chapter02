package com.javaex.ex11;

public class MyMathApp {

	public static void main(String[] args) {
		
		/*
		MyMath myMath = new MyMath();
		
		System.out.println(myMath.plus(3, 59));
		
		System.out.println(myMath.plus(10.5,24.7));
		*/
		
		System.out.println(MyMath.plus(20,52.3));
		System.out.println(MyMath.circleArea(6));
		/*
		MyMath myMath = new MyMath();
		System.out.println(myMath.plus(30, 25)); // 이미 전역변수로 선언해 주었기 때문에 이렇게 쓸 이유가 없다. --> 메모리 낭비
		*/										 // 변수를 공유해야할 때 스태틱 구역에 올려놓고 사용하면 메모리 낭비를 막을 수 있다.
		
	}

}
