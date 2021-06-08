package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*
		// 부모클래스 테스트
		Shape s01 = new Shape("yellow", "black");
		
		System.out.println(s01.toString());
		
		s01.draw();
		
		Rectangle r01 = new Rectangle("red","black",5,5);
		System.out.println(r01.toString());
		r01.draw();
		*/
		
		//사각형 관리
		//배열 만들기
		Rectangle[] rArray = new Rectangle[3];
		
		//사각형
		Rectangle r01 = new Rectangle("red","black",5,5);
		Rectangle r02 = new Rectangle("blue","black",6,6);
		Rectangle r03 = new Rectangle("green","black",7,7);
		
		//배열 <-- 사각형
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//배열을 통해서 사각형 그리기
		for(int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
		
		//원 관리 
		//배열 만들기
		Circle[] cArray = new Circle[3];
		
		//원
		Circle c01 = new Circle("purple", "black", 5);
		Circle c02 = new Circle("orange", "black", 6);
		Circle c03 = new Circle("pink", "black", 7);
		
		//배열 <-- 원
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		//배열을 통해 원 그리기
		for(int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}
		
		//삼각형 관리
		//배열 만들기
		Triangle[] tArray = new Triangle[3];
		
		//삼각형
		Triangle t01 = new Triangle("gray", "black", 5, 5);
		Triangle t02 = new Triangle("lightblue", "black", 6, 6);
		Triangle t03 = new Triangle("red", "black", 7, 7);
		
		//배열 <-- 삼각형
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		//배열을 통해 삼각형 그리기
		for(int i = 0; i < tArray.length; i++) {
			tArray[i].draw();
		}
		
	}

}
