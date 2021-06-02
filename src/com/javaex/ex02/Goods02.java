package com.javaex.ex02;

public class Goods02 {

	//필드
	private String name;
	private int price;
	
	//생성자
	
	//메서드 - 겟터세터
	
	//메서드 - 일반
	public void setName(String i_name) {
		name = i_name;
	}
	public void setPrice(int i_price) {
		price = i_price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("상품이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("=======================");
	}
	
}
