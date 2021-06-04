package com.javaex.ex08;

public class TvApp {

	public static void main(String[] args) {

		Tv tv01 = new Tv();
		
		Tv tv = new Tv(7, 20, false);

		tv01.status();
		
		tv.status();
		
		tv.volume(true);
		tv.volume(99);
		tv.status();
		
		tv.channel(false);
		tv.status();
		
		tv.power(true);
		tv.channel(140);
		tv.channel(false);
		tv.status();
		
		tv.power(false);
		tv.channel(false);
		tv.status();
	}

}
