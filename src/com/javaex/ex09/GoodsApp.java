package com.javaex.ex09;

public class GoodsApp {

	public static void main(String[] args) {
		
		
		
		Goods computer = new Goods("그램",1000000);
		computer.showInfo();
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		
	}

}
