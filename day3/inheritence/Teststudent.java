package edu.hgu.java.day3.inheritence;

public class Teststudent {

	public static void main(String[] args) {
		// 
		//Student[] stuArr = new Student[4];
		/*
		stuArr[0] = new Student("21500085", "Soyeon", "ICT", 4);
		stuArr[1] = new Student("H_001","손흥민", "컴공", 3);
		stuArr[2] = new Student("H_002", "김연아", "경영", 4);
		stuArr[3] = new Student("H_003", "하정우", "미디어", 3);
		*/
		
		Student[] stuArr = {new Student("21500085", "Soyeon", "ICT", 4),
				new Student("H_001","손흥민", "컴공", 3),
				new Student("H_002", "김연아", "경영", 4),
				new Student("H_003", "하정우", "미디어", 3)};
		
		
		
		for(int i=0; i<stuArr.length; i++) {	
			stuArr[i].showStudentInfo();
		}

		for(int i=0; i<stuArr.length; i++) {
			stuArr[i].setGrade(1);
			stuArr[i].showStudentInfo();	
		}

	}

}
