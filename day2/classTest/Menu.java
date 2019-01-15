package edu.hgu.java.day2.classTest;

//접근제한자, 사용제한자, class, class명{}
//접근제한자: public, private, default, protected
//사용제한자: abstract, static, final - 상속을 못하게 된다....
//사용을 제한하는 이유?
public class Menu {
	
	//멤버(속성)
	//접근제한자, 사용제한자 데이터타입, 변수
	String mId;
	String mName;
	int price;
	String source;
	
	//생성자 (초기화 작업)
	//default constructor...없어도 자동으로 생성되는 것.
	//하나라도 생성자가 있으면, default constructor는 자동생성되지 않는다.
	public Menu() {}
	
	public Menu(String mId, String name, int price, String src) {
		this.mId = mId;
		this.mName = name;
		this.price = price;
		this.source = src;
	}
	//함수(메서드) : 행위
	public void showMenuInfo() {
		System.out.println("이름: "+mName+",가격: "+price);
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
}







