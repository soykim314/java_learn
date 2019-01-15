package edu.hgu.java.day2.book;

public class book {
	
	//변수 선언: ISBN, title, author, publish, 
	String ISBN;
	String title;
	String author;
	String publish;
	
	//생성자: 4개 값을 초기화...	
	public book(String ISBN, String title, String author, String publish) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
		this.publish = publish;
	}
	
	//함수
	//showBookInfo() -> 책의 전체정보 표출
	public void showbookInfo() {
		System.out.println("고유번호"+ISBN+", 제목:"+title+", 저자:"+author+", 출판사:"+publish);
	}
	
}
