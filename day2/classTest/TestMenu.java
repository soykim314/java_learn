package edu.hgu.java.day2.classTest;

public class TestMenu {

	public static void main(String[] args) {
		// 객체생성,소고기덮밥, 짜장면
		//객체선언, 생성...
		/*
		Menu menu1 = new Menu();
		menu1.mId ="F_001";
		menu1.mName ="소고기덮밥";
		menu1.price =6000;
		menu1.source = "소고기";
		menu1.showMenuInfo();
		
		Menu menu2 = new Menu();
		menu2.mName ="짜장면";
		menu2.price =4500;
		menu2.showMenuInfo();
		*/
		
		Menu menu1 = new Menu("F_001", "짜장면", 6500, "밀가루");
		menu1.showMenuInfo();
	}

}
