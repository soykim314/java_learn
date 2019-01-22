package edu.hgu.java.day5.classes;

import edu.hgu.java.day5.inter.Circle;

public class TestCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a = 4;
	int b = 4;
	String str = "hello";
	String str1 = new String("hello");
	String str2 ="hello";
	Circle c = new Circle(5);
	Circle c1 = new Circle(5);
	
	System.out.println(a==b);
	System.out.println(str==str1);
	System.out.println(str==str2);
	System.out.println(str.equals(str1));
	System.out.println(c.equals(c1));
	
	}

}
