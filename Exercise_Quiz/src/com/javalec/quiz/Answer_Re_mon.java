package com.javalec.quiz;

import java.util.Scanner;

public class Answer_Re_mon {

	public static void main(String[] args) {
//Quiz10//Input score :
		//1의 score : __
		//2의 score : ___
		//10의 score 까지
		//-----Histogram-----
		//90: ##
		//80: 
		// 0: #
		
		
		// 선언자
		Scanner scanner = new Scanner(System.in);
		int[] score = new int[10];// 입력 받은 점수 배열 저장
		int[] histo = new int[10]; 
		
//		//histo에 대한 초기 작업
//		for(int i=0; i<histo.length; i++) {
//			histo[i]=0;
//		}
		
		System.out.println("Input score :");
		
		//점수 입력받으면서 배열의 갯수를 정한다.
//		for(int i=1; i<=10; i++) {
//			System.out.print(i+"의 Score :");
//			score[i-1]=scanner.nextInt();   // 혹은 범위는 i=0; i<score.length로 해도 됨 그러면 i+의 score 부분을 조정
//			histo[score[i]/10 ]++; // 예를 들어 93점이면 9만 (90점대다, 80점대다 점수대만 알면 되므로)
//		}
		
		//즉
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+"의 Score :");
			score[i] = scanner.nextInt();
//			histo[score[i]/10]++; //아래와 같은 말 
			histo[score[i]/10] +=1;// ex) 90점대면 histo 9번째에 1명! (누적이므로)
		}
		
		scanner.close(); //.은 method
		
		
		
		//확인하기 위한 임시 Source------ // 배열에 데이터가 잘 들어갔구나 // histo배열 보려면 score를 histo로 변경
//		for(int i=0; i<score.length; i++) {
//			System.out.println(score[i]);
//		}
		//확인하기 위한 임시 Source2
//		for(int i=0; i<histo.length; i++) {
//			System.out.println(histo[i]);
		//-----------------------------------
		
		//출력
		System.out.println("------------------Histogram----------------");
		for(int i=(score.length-1); i>=0; i--) {
			System.out.print(String.format("%3d : ", i*10));
			
			for(int j=1; j<=histo[i]; j++) {
				System.out.print("#");
			}
				System.out.println();
	
		}
		
	}

}
