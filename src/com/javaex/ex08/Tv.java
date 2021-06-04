package com.javaex.ex08;

public class Tv {
	
	// 필드
	private boolean power;
	private int volume;
	private int channel;
	
	// 생성자
	public Tv() {
		
	}
	
	public Tv(int volume, int channel) {
		this(7,20,false);
	}
	
	public Tv(int volume, int channel, boolean power) {
		this.volume = volume;
		this.channel = channel;
		this.power = power;
	}

	// 메서드 게터
	public boolean getPower() {
		return power;
	}
	
	public int getvolume() {
		return volume;
	}
	
	public int getChannel() {
		return channel;
	}
	
	// 메서드 일반
	void power(boolean power) {
		if(power == true) {
			this.power = true;
		}else {
			this.power = false;
		}
	}
	
	void channel(int channel) {
		if(this.power == false) {
			
		}
		else if(channel < 0) {
			this.channel = 0;
		}else if (channel > 255) {
			this.channel = 255;
		}else {
			this.channel = channel;
		}
	}
	
	void volume(int volume) {
		if(this.power == false) {
			
		}
		else if(volume < 0) {
			this.volume = 0;
		}else if(volume > 100) {
			this.volume = 100;
		}else {
			this.volume = volume;
		}
	}
	
	void channel(boolean updown) {
		if(this.power == false) {
			
		}
		else if(updown == true) {
			this.channel = this.channel +1;
		}else {
			this.channel = this.channel -1;
		}
	}
	
	void volume(boolean updown) {
		if(this.power == false) {
			
		}
		else if(updown == true) {
			this.volume = this.volume +1;
		}else {
			this.volume = this.volume -1;
		}
	}
	
	void status() {
		System.out.println("volume : " + this.volume);
		System.out.println("channel : " + this.channel);
		System.out.println("power : " + this.power);
		System.out.println("============================");
	}
	
}
