package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//
//		System.out.println("apple\nBanana\nGrape");   //> new line 
//		System.out.println("apple\tBanana\tGrape");   //> tab
//		System.out.println("apple\"Banana\"Grape");   //>" 찍기
		
		//Quiz 
//		for(int i=1; i<=9; i++) {
//			for(int dan=2; dan<=9; dan++){
//				System.out.print(dan +" X "+ i + " = " + String.format("%2d",(dan*i))+"\t");
//			}	
//				System.out.println();
//		}
		//입력한 숫자부터 4개를 증가하여 화면 가로로 구구단을 표시하기
		//선언
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Input your number : ");
//		int input = scanner.nextInt();
		//계산 
//		for(int i=1; i<=9; i++) {
//			for(int dan=input; dan<=(input+3); dan++) {
//				System.out.print(dan + " X " + i + " = " + (dan*i)+"\t"); //print 만 쓰고 tab으로 옆으로 넘겨주기
//			}
//				// 한줄 아래로 내리기 X1 끝나면 , X2로 
//				System.out.println();
//		}
		// 2x1, 2x2, 2x3
		// 2x4, 2x5, 2x6   이런식으로 되는 식 만들기
		//선언
//		Scanner scanner2 = new Scanner(System.in);
//		System.out.print("단을 입력하세요 : ");
//		int input = scanner2.nextInt();
//		
//		//처리
//		for(int j=1; j<=9; j+=3) {
//			System.out.print(input + " X " + j + " = " + (input*j)+ "\t");
//			System.out.print(input + " X " + j + " = " + (input*j+1)+ "\t");
//			System.out.print(input + " X " + j + " = " + (input*j+2)+ "\n");
//			
//		}
		//2X1=2 2X2=4 2X3=6
		//3X1=3 3X2=6 3X3=9
		//4X1=4 4X2=8 4X3=12
		
		int dan=2;
		for(int k=1; k<=3; k++) {
			if (k%3!=0) {
			System.out.print(dan + " X " + k + " = " + (dan*k)+"\t");
			}else
			System.out.print((dan+1) + " X " + k + " = " + ((dan+1)*k)+"\n");
		}

		
		
		
		
	}

}
