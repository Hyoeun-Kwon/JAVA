package com.javalec.quiz;

import java.util.Scanner;

public class Quiz_First_Week_Finalboss {

	public static void main(String[] args) {
		// 학생수가 4명이고 과목이 3과목일 경우의 점수 합계와 평균 구하기 기능 추가
		//Korean의 성적을 입력:
		//No1의 성적은:
		//No2의 성적은:
		//English, Mathematics 의 성적입력까지
		//      Korean   English  	Mathmatics Total 	Average
		//No1   11			11			11		33			11
		//No4 까지
		
		//과목을 배열로, 학생들을 배열로 만들기
		String[] subject = {"Korean", "English","Mathematics"};
		String[] student = {"No1","No2","No3","No4"};
		//성적을 입력받기 위한 스캐너
		Scanner scanner = new Scanner(System.in);
		// 수치를 보여주기 위한, 입력받은 점수 저장 장소가 필요
		int[] koreanScore = new int[student.length];
		int[] engScore= new int [student.length];
		int[] mathScore= new int [student.length];
		
		//합과, 평균 구하기 위한 변수
		int[] tot= new int [student.length];
		
		
		//처리
		for (int i=0; i<subject.length; i++) {
		System.out.println(subject[i]+"의 성적을 입력 :");
			for(int j=0; j<student.length; j++) {
			System.out.print(student[j]+"의 성적은 :");
			int inputValue = scanner.nextInt();
			//과목별로 값을 하나씩 저장해 주기
				switch (i%3) {
					case 0 : koreanScore[j] = inputValue;
					case 1 : engScore[j]=inputValue;
					case 2 : mathScore[j]=inputValue;
					
					tot[j]+=inputValue;
					
					}	
			}
		}
		
		System.out.println("\t"+subject[0]+"\t"+subject[1]+"\t"+subject[2]+"\t"+"total"+"\t"+"Average");
		for(int k=0; k<student.length; k++) {
			System.out.println(student[k]+"\t"+koreanScore[k]+"\t"+engScore[k]+"\t"+mathScore[k]+"\t\t"+tot[k]+"\t"+(tot[k]/subject.length));
			System.out.println("");
		}
		
		
		
		
	}

}
