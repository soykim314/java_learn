package edu.hgu.java.day5.inter;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열에서 꺼내면서 아래와 같이 출력해보자
		//원: 둘레: 34.24, 면적: 55.38
		//사각형: 둘레: 18, 면적: 20
		//삼각형: 둘레:14, 면적:6
		Shape[] shaArr = {new Circle(5), new Rectangle(4,5), new Triangle(3,4)};
		
		/*
		for(int i=0; i<shaArr.length; i++) {
			System.out.println("둘레:"+shaArr[i].getRound()+",면적" +shaArr[i].getArea());
		}*/
		
		for(int i=0; i<shaArr.length; i++) {
			System.out.println(shaArr[i]);
		}
		
		for(Shape s:shaArr) {
			System.out.println(s);
		}
		
	}

}
