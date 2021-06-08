package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		Rectangle[] rArray = new Rectangle[3];
		
		Rectangle r01 = new Rectangle("red", "black", 5, 5);
		Rectangle r02 = new Rectangle("yellow", "black", 6, 6);
		Rectangle r03 = new Rectangle("green", "black", 7, 7);		
		
		System.out.println(r01.toString());
		System.out.println(r02.toString());
		System.out.println(r03.toString());
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for(int i = 0; i < rArray.length; i++) {
			rArray[i].setFillColor("blue"); // 배열을 이용한 전체 내부 색 변경
			rArray[i].draw(); // 배열을 이용한 전체 출력
		}
		
		/* 전체 내부 색 변경 노가다 x
		r01.setfillColor("blue");
		r02.setfillColor("blue");
		r03.setfillColor("blue");
		*/
		
		/* 전체 출력 노가다 x
		r01.draw();
		r02.draw();
		r03.draw();
		*/
		
		Circle[] cArray = new Circle[3];
		
		//변수를 만들지 않고 바로 배열에 값 대입
		cArray[0] = new Circle("red", "black", 5);
		cArray[1] = new Circle("yellow", "black", 6);
		cArray[2] = new Circle("green", "black", 7);
		
		for(int i = 0; i < cArray.length; i++) {
			cArray[i].setFillColor("red");
			cArray[i].draw();
			
		}
		
	}

}
