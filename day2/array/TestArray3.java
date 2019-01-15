package edu.hgu.java.day2.array;

public class TestArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] Score= {{80, 90, 75, 60},{66, 50, 97, 75},{88, 45, 80, 68},{72,69,85,99}};
		int [][] Result = {};
		
		for (int i =0; i<Score.length; i++) {
			for (int j=0; j<Score.length; j++) {
				Result[i][j] = Score[i][j];
			}
		}

	}

}
