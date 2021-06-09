package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		//배열을 만든다.
		Shape[] sArray = new Shape[3];
		
		Shape sr01 = new Rectangle("red", "black", 10, 10);
		//사각형을 도형으로 부르고 싶은 것
		Shape sc01 = new Circle("blue", "black", 5);
		//원을 도형으로 부르고 싶은 것
		Shape st01 = new Triangle("green", "black", 30, 30);
		//삼각형을 도형으로 부르고 싶은 것
		
		
		//배열 <-- 도형
		sArray[0] = sr01;
		sArray[1] = sc01;
		sArray[2] = st01;
		
		
		//배열을 이용해서 그리기
		for(int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
			
			//오버라이딩을 이용해서 구현할 수 있다.
			System.out.println(sArray[i].area());
		}
		//오버라이딩 부작용 --> 추상클래스, 추상메소드로 해결
		Shape ss01 = new Shape("black", "black");
		System.out.println("넓이 : " + ss01.area());
		
		
		System.out.println(((Rectangle)sr01).getWidth());
		
	}

}
