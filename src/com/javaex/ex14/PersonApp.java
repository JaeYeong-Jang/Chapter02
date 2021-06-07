package com.javaex.ex14;

public class PersonApp {

	public static void main(String[] args) {
		/*
		//디폴트 생성자 사용
		Student s01 = new Student();
		s01.setName("이효리");
		s01.setAge(45);
		s01.setSchoolName("서울고");
		
		s01.showInfo();
		*/
		//Student 생성자 (3) 사용
		//생성자 순서 (부모까지 포함 )
		/*
		Student s02 = new Student("정우성", 50, "제주고");
		
		s02.showInfo();
		*/
		
		//부모의 디폴트 생성자 사용 --> 확인
		//Student s03 = new Student();
		
		Student s04 = new Student("이효리", 45, "제주고");
		
		Person p01 = new Person();
		p01.name = "바보야"; //다른 패키지 였으면 접근하지 못한다.
		
	}

}
