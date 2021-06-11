package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*
		Point p01 = new Point(5,5);
		p01.draw();
		
		Drawable p02 = new Point(10, 10);
		p02.draw();
	
		Drawable t01 = new Triangle("red", "black", 20, 10);
		t01.draw();
		*/
		
		//테스트
		//배열 만들기 (Drawable)
		Drawable[] dArray = new Drawable[4]; // 인터페이스의 메소드만 볼 수 있다.
		
		//사각형을 만든다.
		Drawable r01 = new Rectangle("red", "black", 10, 10); // 인터페이스의 메소드만 볼 수 있다.
		
		//원을 만든다.
		Drawable c01 = new Circle("blue", "black", 8); // 인터페이스의 메소드만 볼 수 있다.
		
		//삼각형을 만든다.
		Drawable t01 = new Triangle("green", "black", 20, 13); // 인터페이스의 메소드만 볼 수 있다.
		
		//점을 만든다.
		Drawable p01 = new Point(3, 3); // 인터페이스의 메소드만 볼 수 있다.
		
		//배열 <-- 도형을 넣는다.
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		//배열을 이용해서 전부 그린다.
		for(int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}
		
		//사각형의 면적 출력
		//System.out.println(((Rectangle)r01).area());
		//System.out.println(((Shape)r01).area());
		
		//배열을 이용해서 면적을 출력한다.
		for(int i = 0; i < dArray.length; i++) {
			// instanceof 연산자
			if(dArray[i] instanceof Shape) {
			System.out.println(((Shape)dArray[i]).area());
			}

		}
		
		for(int i = 0; i < dArray.length; i++) {
			if(!(dArray[i] instanceof Shape)) {
				System.out.println("점");
			}
		}
		
	}

}
