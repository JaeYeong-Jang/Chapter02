package com.javaex.ex14;

public class Student extends Person {

	//fields
	
	private String schoolName;
	
	//constructors
	
	public Student() {
		System.out.println("Stusent()");
	}
	/*
	//부모의 Person(2)생성자 사용
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	*/
	//부모의 Person()생성자 사용
	public Student(String name, int age, String schoolName) {
		super();
		super.setName(name);
		super.setAge(age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	
	//method g/s

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//method normal

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + " age = " + getAge() +"]";
	}
	
	public void showInfo() {
		System.out.println("=======================");
		System.out.println("이름 : " + super.name);
		System.out.println("나이 : " + age);
		System.out.println("학교 : " + schoolName);
		System.out.println("=======================");
		
	}
	
	
}
