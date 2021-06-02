package com.javaex.ex03;

public class Method_point {

	public static void main(String[] args) {
		
		Method_point_m point01 = new Method_point_m();
		Method_point_m point02 = new Method_point_m();
		
		point01.setXpoint(5);
		point01.setYpoint(5);
		
		point02.setXpoint(10);
		point02.setYpoint(23);
		
		point01.draw();
		point02.draw();
		
		System.out.println("점[x=" + point01.getXpoint() + ", y=" + point01.getYpoint() + "]을 그렸습니다.");
		System.out.println("점[x=" + point02.getXpoint() + ", y=" + point02.getYpoint() + "]을 그렸습니다.");
		
	}

}
