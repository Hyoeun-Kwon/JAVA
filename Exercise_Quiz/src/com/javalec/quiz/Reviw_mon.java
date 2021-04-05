package com.javalec.quiz;

import java.util.Scanner;

public class Reviw_mon {

	public static void main(String[] args) {
		// 10개의 점수 입력 받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input score :");
		String[] Num = {"1","2","3","4","5","6","7","8","9","10"};
		int[] inputScore = new int [Num.length]; // 입력받은 점수 저장값
		int[] sco= {90,80,70,60,50,40,30,20,10}; //histogram의 점수 배열판
		int[] hisTo=new int[inputScore.length];	//비교시 점수 저장값
		
		// 10개의 값을 입력 받아야 하므로 for
		for (int i=1; i<=10; i++) {
			System.out.print(Num[i-1]+"의 score :");
		int	score=scanner.nextInt();
		}
		//Histogram 만들기
		System.out.println("-----------Hisrogram-------------");
//		------------------------틀린 답--------------------
//		for (int j=0; j<9; j++) {
//			System.out.print(sco[j]+ " : ");
//			for(int k=0; k<sco.length; k++) {
//				if(inputScore[k]>sco[k]) {
//					System.out.print("#");
//				}
//					System.out.print("");
//		}
		//-------------------------------------------------
		
		
	}

}
