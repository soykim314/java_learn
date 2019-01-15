package edu.hgu.java.day2.array;

public class TestArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 80, 90, 75, 60
		 * 66, 50, 97, 75
		 * 
		 * 
		 */
		//배열의 단점은 처음 만든 것에서 resize를 할 수 없다.
		//resize를 하려면, 배열 하나를 새로 만들어야 한다.
		int [][] Score= {{80, 90, 75, 60},{66, 50, 97, 75},{88, 45, 80, 68},{72,69,85,99}};
		int [][] Result = new int [5][5];

		
		for (int i =0; i<4; i++) {
			for (int j=0; j<4; j++) {
				Result[i][j] = Score[i][j];
				Result[4][4] += Score[i][j];
				Result[i][4] += Score[i][j];
				Result[4][i] += Score[j][i];
			}
		}
	
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++){
				System.out.print(Result[i][j] +"  ");	
			}
			System.out.println();
		}
		
	
	}
}
