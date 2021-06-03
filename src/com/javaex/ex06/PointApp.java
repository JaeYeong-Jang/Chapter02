package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point point01 = new Point(); // default 생성자
		
		point01.setX(5);
		point01.setY(5);
		point01.draw();
		
		Point point02 = new Point(6,12); // 따로 만들어준 생성자 --> 메모리에 올리고 바로 값을 대입
		point02.draw();
		
		Point point03 = new Point(10); // 메모리에 올리고 x값에만 바로 값을 주는 생성자
		point03.setY(10);
		point03.draw();
		
		Point point04 = new Point(100);
		point04.draw();
		
		Point point05 = new Point(50,50);
		point05.draw(false);
		
	}

}
