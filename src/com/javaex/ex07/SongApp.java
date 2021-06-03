package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		
		Song Iu = new Song();
		Iu.setName("아이유");
		Iu.setTitle("좋은날");
		Iu.setAlbum("Real");
		Iu.setYear(2010);
		Iu.setTrack("3번 track");
		Iu.setComposer("이민수");
		System.out.println(Iu.getName() + ',' + Iu.getTitle() + ',' + Iu.getAlbum() + ',' + Iu.getYear() + ',' + Iu.getTrack() + ',' + Iu.getComposer() + " 작곡)");
		Iu.showInfo();
		System.out.println("======================================================");
		
		Song IU = new Song("아이유","좋은날","Real",2010,"3번 track","이민수");
		System.out.println(IU.getName() + ',' + IU.getTitle() + ',' + IU.getAlbum() + ',' + IU.getYear() + ',' + IU.getTrack() + ',' + IU.getComposer() + " 작곡)");
		IU.showInfo();
		System.out.println("======================================================");
		
		Song Bigbang = new Song("BIGBANG","거짓말","Always");
		Bigbang.setYear(2007);
		Bigbang.setTrack("2번 track");
		Bigbang.setComposer("G-DRAGON");
		System.out.println(Bigbang.getName() + ',' + Bigbang.getTitle() + ',' + Bigbang.getAlbum() + ',' + Bigbang.getYear() + ',' + Bigbang.getTrack() + ',' + Bigbang.getComposer() + " 작곡)");
		Bigbang.showInfo();
		System.out.println("======================================================");
		
		Song Busker = new Song(2012,"4번 track","장범준");
		Busker.setName("버스커버스커");
		Busker.setTitle("벚꽃엔딩");
		Busker.setAlbum("버스커버스커1집");
		System.out.println(Busker.getName() + ',' + Busker.getTitle() + ',' + Busker.getAlbum() + ',' + Busker.getYear() + ',' + Busker.getTrack() + ',' + Busker.getComposer() + " 작곡)");
		Busker.showInfo();
		System.out.println("======================================================");
		
		
	}

}
