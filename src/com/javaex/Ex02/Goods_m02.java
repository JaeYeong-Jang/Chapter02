package com.javaex.Ex02;

public class Goods_m02 {

	public static void main(String[] args) {
		
		Goods02 camera = new Goods02();
		Goods02 laptop = new Goods02();
		Goods02 cup = new Goods02();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		laptop.setName("LG그램");
		laptop.setPrice(1000000);
		
		cup.setName("머그컵");
		cup.setPrice(2500);
		
		/*
		String cameraName = camera.getName();	// getName을 사용해서 다른 변수에 값을 입력받아 사용하기도 함
		
		System.out.println("상품명 : " + cameraName + ", 가격 : " + camera.getPrice());
		System.out.println("상품명 : " + laptop.getName() + ", 가격 : " + laptop.getPrice());
		System.out.println("상품명 : " + cup.getName() + ", 가격 : " + cup.getPrice());
		*/
		
		camera.showInfo();
		laptop.showInfo();
		cup.showInfo();
		
		
		

	}

}
