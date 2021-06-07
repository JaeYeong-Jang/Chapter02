package com.javaex.ex14;

public class Person {
	
	//fields
	protected String name;
	protected int age;
	
	//constructors
	public Person() {
		System.out.println("Person()");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}

	//method g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//method normal
	public void showInfo() {
		System.out.println("이름 : " + this.name + ",  " + "나이 : " + this.age);
	}
	
}
