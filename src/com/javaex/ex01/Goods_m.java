package com.javaex.ex01;

public class Goods_m {

	//필드
	
	//생성자
	
	//메소드 게터세터
	
	//메소드 일반
	public static void main(String[]args) {
	
		Goods camera = new Goods();
		
		camera.name = "니콘";
		camera.price = 400000;
		
		System.out.println(camera.name + ',' + camera.price);
		
		System.out.println("===========================");
		
		Goods laptop = new Goods();
		
		laptop.name = "LG그램";
		laptop.price = 1000000;
		
		System.out.println(laptop.name + ',' + laptop.price);
		
		System.out.println("===========================");
		
		Goods cup = new Goods();
		
		cup.name = "머그컵";
		cup.price = 2500;
		
		System.out.println(cup.name + ',' + cup.price);
	}

}
