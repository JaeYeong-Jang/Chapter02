package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		
		Person student01 = new Person("정우성",45);
		
		student01.showInfo();
		
		Student student02 = new Student("이효리", 40, "00고등학교");
		System.out.println(student02.toString());

		
	}

}
