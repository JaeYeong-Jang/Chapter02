package com.javaex.ex05;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	//default 생성자는 따로 생성하지 않아도 존재한다.
	public Goods() {// 개발자가 따로 생성자를 만들면 default 생성자를 삭제하므로  default 생성자를 사용 할 계획이 있다면 직접 선언해서 사용해도 된다.
		
	}
	
	public Goods(String name, int price) { // 메모리 (힙) 에 올리는것
		this.name = name;
		this.price = price;
	}
	
	//메서드 게터 세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	/*
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	*/
	
	//메서드 일반
	public void showInfo() {
		System.out.println("상품이름 : " + this.name);
		System.out.println("가격 : " + this.getPrice());
		System.out.println("====================");
	}
	
	
}
