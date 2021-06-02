package com.javaex.ex04;

public class song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	/*
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setTrack(String track) {
		this.track = track;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getTrack() {
		return track;
	}
	*/
	
	public void setSong(String artist, String title, String album, int year, String track, String composer) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}
	
	public void showInfo() {
		System.out.println(artist + ',' + title + '(' + album + ',' + year + ',' + track + ',' + composer + " 작곡)");
	}
	
}
