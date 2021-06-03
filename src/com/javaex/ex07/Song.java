package com.javaex.ex07;

public class Song {
	
	// 필드
	private String title;
	private String name;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	// 생성자
	
	public Song() {
		
	}
	
	public Song(String name, String title, String album, int year, String track, String composer) {
		this.name = name;
		this.title = title;
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}
	
	public Song(String name, String title, String album) {
		this.name = name;
		this.title = title;
		this.album = album;
	}
	
	public Song(int year, String track, String composer) {
		this.year = year;
		this.track = track;
		this.composer = composer;
	}
	
	// 메서드 게터세터
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	
	// 메서드 일반
	
	public void showInfo() {
		System.out.println(name + ',' + title + '(' + album + ',' + year + ',' + track + ',' + composer + " 작곡)");
	}
}
