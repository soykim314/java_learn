package edu.hgu.java.day2.array;

public class TestArrayCopy {

	public static void main(String[] args) {
		// 
		int[] intA1 = {1,2,3,4,5};
		int[] intA2 = {100, 200, 300, 400, 500};
		
		int[] intA3 = new int[intA1.length*2];
		//대문자이면 class. class안의 값을 생성하려면, 객체를 생성해야한다.
		//new라는 키워드가 있어야 새로 생성됨. 
		//static은 생성과 동시에 메모리로 올라간다.
		
		System.arraycopy(intA1, 0, intA3, 0, intA1.length);
		System.arraycopy(intA2, 0, intA3, 5, intA1.length);
		
		for(int i=0; i<intA3.length; i++) {
				System.out.print(intA3[i] +"  ");	
			}

	}

}
