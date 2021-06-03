package com.javaex.ex05;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘",400000); // 생성자 호출 --> 생성자public Goods()를 호출하고 있던것 --> 호출과 동시에 값을 대입
		Goods laptop = new Goods("LG그램",1000000);
		Goods cup = new Goods("머그컵",2500);
		
		camera.showInfo();
		laptop.showInfo();
		cup.showInfo();

	}

}
