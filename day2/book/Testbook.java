package edu.hgu.java.day2.book;

public class Testbook {

	public static void main(String[] args) {
		// ISBN, title, author, publish
		//"hgu_0001", "주홍글씨", "홍길동", "한동출판사"
		//"hgu_0002", "갈대상자", "홍길순", "한동출판사"
		
		book book1 = new book("hgu_0001", "주홍글씨", "홍길동", "한동출판사");
		book1.showbookInfo();
		
		book book2 = new book("hgu_0002", "갈대상자", "홍길순", "한동출판사");
		book2.showbookInfo();

	}

}
