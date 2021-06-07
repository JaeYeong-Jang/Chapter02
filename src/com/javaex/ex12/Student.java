package com.javaex.ex12;

public class Student {

	//fields
	private String name;
	private int age;
	private String schoolName;
	
	//constructors
	public Student(String name, int age, String schoolName) {
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
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

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//method normal
	public String toString() {
		return "Student [" + name + ", age = " + age + "학교 이름 : " + schoolName + "]";
	}
}
