package com.javalec.base;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
//		int i = 10; // ~를 위한 변수다 라고 옆에 적어두는 게 좋음
//		int j = 20;
//		int k = 10;
		
		
		// 비교문 #1
//		if( i> j ) {    //{: (scope) 범위 중요! true 일때만 들어감
//			
//			System.out.println("i가 j보다 큽니다");
//		}	
//		
//		System.out.println(">>> End <<<");
		
		// 비교문 #2 : 비교문으로 입력한 숫자 크기의 차이 구하기
		
//		if(i > j) {
//			System.out.println("i는 j보다 " + (i-j) + "만큼 큽니다.");
//		}else {
//			System.out.println("j는 i보다 " + (j-i) + "만큼 큽니다.");
//		}
//		
//		System.out.println(">>> End <<<");
//	}
			
//		if(i > j) {
//		System.out.println("i가 j보다 큽니다.");
//		}else if (i == j ) {
//			System.out.println("i와 j가 같습니다.");
//		} else {	
//			System.out.println("i가 j보다 작습니다.");

		
//		int price =5000;
//		
//		if(price > 8000) {
//			System.out.println("너무 비쌉니다.");
//		}else if (price > 5000 ) {
//			System.out.println("조금 비쌉니다.");
//		}else if (price > 3000) {
//			System.out.println("적당한 금액 입니다.");
//		}else {
//			System.out.println("싼편 입니다.");
//		}
//		
//		System.out.println("구매 하실래요?");		
			
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("성적을 입력하세요: ");             
		int score = scanner.nextInt();
		String grade = "";
		
		if(score > 100) {
			grade = "error";
		}else if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >=60){
			grade = "D";
		}else if(score >= 0) {
			grade = "80";		
		}else {
			grade = "error";
		}
		
		if(grade == "error") {
			System.out.println("점수가 잘못 입력 되었습니다.");
		}else {
			System.out.println("귀하의 학점은 " + grade + "입니다.");
		}
		
		scanner.close();
		
		//이렇게도 할 수 있음 
		// if 구문에 {} 안에 1줄이면 {} 안해도 됨.
	

		
	}
}


/*
 *  Exercise
 *  성적을 입력하세요 : __   <<< scanner를 써야 사용자가 입력한 데이터를 가져온다
 *  귀하의 학점은 A학점 입니다.
 *  90:A, 80:B, 70:C, 60:D 나머지 F
 */

		
		




