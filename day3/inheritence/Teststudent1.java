package edu.hgu.java.day3.inheritence;
import java.util.Scanner;

public class Teststudent1 {
	
	public static void main(String[] args) {
		
		//숫자가1이면.
		System.out.println("====학생정보 관리프로그램====");
		Student[] stuArr = new Student[5];
		Scanner sc = new Scanner(System.in); 
		int round =0;
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1.학생정보추가, 2:학생전체정보조회");
			System.out.println("3.특정학생정보조회, 4:프로그램종료");
			int menu = sc.nextInt();
			
			if(menu ==1) {
				System.out.println("학생정보추가");
				System.out.println("학번,이름,전공,학년을 입력하세요");
				
				String id = sc.next();
				String name = sc.next();
				String major = sc.next();
				int grade = sc.nextInt();
				
				stuArr[round] = new Student(id, name, major, grade);
				
				round += 1;
				
				System.out.println(id+","+name+","+major+","+grade);
				
				
				
			}else if(menu==2) {
				System.out.println("학생전체정보조회");
				
				for(int i=0; i<stuArr.length; i++) {	
					stuArr[i].showStudentInfo();
				}
				
			}else if(menu==3) {
				System.out.println("특정학생정보조회");
				int num = sc.nextInt();
				System.out.println(stuArr[num]);
				
			}else if(menu==4) {
				System.exit(0);
			}else {
				System.out.println("입력된 숫자가 "+menu+"입니다 "+ "\n 다른번호를 선택하세요");
			}
			
		}
			
		
		
		
		
	}
}
