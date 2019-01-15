package edu.hgu.java.day2.array;

public class TestArray4Ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] resultArr= {{80, 90, 75, 60},{66, 50, 97, 75},{88, 45, 80, 68},{72,69,85,99}};

		
		int[][] scoreArr = new int[resultArr.length+1][resultArr[0].length+1];
		
		
		for(int i=0; i<resultArr.length; i++) {
			for(int j=0; j<resultArr[i].length; j++) {
				scoreArr[i][j] = resultArr[i][j];
				scoreArr[i][resultArr[0].length] += scoreArr[i][j];
				scoreArr[resultArr.length][j] += scoreArr[i][j];
				scoreArr[resultArr.length][resultArr[0].length] +=scoreArr[i][j];
			}
		}
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++){
				System.out.print(scoreArr[i][j] +"  ");	
			}
			System.out.println();
		}
		
	}

}
