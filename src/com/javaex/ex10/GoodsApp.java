package com.javaex.ex10;

public class GoodsApp {
	// count 용도로 static 사용하지 않는다. --> (*배열) --> list
	public static void main(String[] args) {
		
		Goods[] GoodsArray = new Goods[3];
		
		Goods computer = new Goods("그램", 1000000);
		Goods camera = new Goods("니콘", 400000);
		
		/*
		computer.showInfo();
		camera.showInfo();
		*/

		GoodsArray[0] = computer;
		GoodsArray[1] = camera;
		
		int count = 0;
		
		for(int i = 0; i < GoodsArray.length; i++) {
			if(GoodsArray[i] != null) { // --> 배열에 주소가 없으면
				GoodsArray[i].showInfo();
				count = count +1;
			}
		}
		
		System.out.println("count : " + count);
		
	}

}
