package com.javaex.ex13;

public class Student extends Person {

	//fields
	
	private String schoolName;
	
	//constructors
	
	public Student() {
		
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
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
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("학교 : " + schoolName);
		System.out.println("=======================");
		
	}
	
	
}
