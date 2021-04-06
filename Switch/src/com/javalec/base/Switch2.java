package com.javalec.base;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		//선
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		String grade = "";
		
		System.out.println("성적을 입력하세요:");
		score = scanner.nextInt();

		//처리  if문으로 점수 오류 처리
		if(score>100 || score<0) {
			grade = "잘못된 ";
		}else {
			switch (score / 10) {
			case 10: // 100점과 90점 둘다 A이므로 break걸지 않고 둬도 
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade ="F";
				break;		
			}
		}
		
		//결과
		System.out.println("귀하의 성적은 " + grade + "학점 입니다.");
		
		
		
//		//switch
//		System.out.println("성적을 입력하세요:");
//		score = scanner.nextInt();
//		
//		switch (score % 10) {
//		
//		case 10:
//			grade ="error";
//			break;
//		case 9:
//			grade = "A";
//			break;
//		case 8:
//			grade = "B";
//			break;
//		case 7:
//			grade = "C";
//			break;
//		case 6:
//			grade = "D";
//			break;
//		case 0:
//			grade= "F";
//			break;
//		default:
//			grade= "error";
//			break;
//			
//		}
//		
//		//	처리
//		
//		if (grade == "error") {
//			System.out.println("잘못 입력하셨습니다.");
//		}else {
//			System.out.println("귀하의 성적은 " + grade + "학점 입니다.");
//		}
		
		// 위에 한건 내가 한 부분인데 안됨! (마이너스 값등이)
		

		
		
//		if(score>100 || score<0) {     이 부분도 if(score>100 || score<0) grade = "잘못된";	으로만 해도 
//			grade = "잘못된 ";
//		}else
		
		
		
		//저번 수업때 한 내용 중
//		if(score > 100)  {
//			grade = "error";
//			
//		}else if (score >=90) {
//			grade = "A";
//		}	
			
			
			
			
		
		
	}

}
