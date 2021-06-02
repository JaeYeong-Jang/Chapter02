package com.javaex.ex04;

public class songApp {

	public static void main(String[] args) {
		
		song IU = new song();
		song Bigbang = new song();
		song Busker = new song();
		/*
		IU.setArtist("아이유");
		IU.setTitle("좋은날");
		IU.setAlbum("Real");
		IU.setYear(2010);
		IU.setTrack("3번 track");
		IU.setComposer("이민수");
		
		Bigbang.setArtist("BIGBANG");
		Bigbang.setTitle("거짓말");
		Bigbang.setAlbum("Always");
		Bigbang.setYear(2007);
		Bigbang.setTrack("2번 track");
		Bigbang.setComposer("G-DRAGON");
		
		Busker.setArtist("버스커버스커");
		Busker.setTitle("벚꽃엔딩");
		Busker.setAlbum("버스커버스커1집");
		Busker.setYear(2012);
		Busker.setTrack("4번 track");
		Busker.setComposer("장범준");
		*/
		
		IU.setSong("아이유", "좋은날", "Real", 2010, "3번 track", "이민수");
		Bigbang.setSong("BIGBANG", "거짓말", "Always", 2007, "2번 track", "G-DRAGON");
		Busker.setSong("버스커버스커", "벚꽃엔딩", "버스커버스커1집", 2012, "4번 track", "장범준");
		
		IU.showInfo();
		Bigbang.showInfo();
		Busker.showInfo();

	}

}
