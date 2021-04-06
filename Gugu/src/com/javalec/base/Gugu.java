package com.javalec.base;

import java.util.Scanner;

public class Gugu {

	public static void main(String[] args) {
		// 곱하기 
		
		
//		int  dan;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("원하시는 단을 입력하세요 :");
//		dan = scanner.nextInt();
//		
//		
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(dan+ " X " + i + " = " + (dan*1));
//			
//		}
//		
		//원하시는 단을 입력하세요 : 7
		// 7 X 2 = 14
		// 7 X 4 = 28
		// 7 X 6 = 42
		// 7 X 8 = 56
		
		
//		int putDan = 0; //(초기값 주는게 좋은 습관) 그냥 int putDan; 으로 해도 되지만. 나중에 누적시(+1등하면) 오류 발생
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("원하시는 단을 입렵하세요 : ");
//		putDan = scanner.nextInt();
//		
//		for(int i=2; i<=9; i+=2) {
//			System.out.println(putdDan + " X " + i + " = " + (putDan*i));
//		}
		
		//Exercise 2
		//원하시는 단을 입력하세요 : 7
		// 7 X _ = 7
		// 7 X 2 = 14
		// 7 X _ = 21
		// 7 X 4 = 28
		
//		int dan = 0;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("원하시는 단을 입력하세요: ");
//		dan = scanner.nextInt();
//		
//		for(int i=1; i<=9; i++) {
//			if(i % 2 == 0) {
//				System.out.println(dan +" X " + i +" = " + (dan*i));
//			}else
//				System.out.println(dan +" X _ = " + (dan*i));
//		}
//		
//		
//		//이렇게도 가능! 한줄로 (삼항)
//	   for(int i=1;i<=9;i++)System.out.println(dan+" X "+(i%2==00?i:"_")+" = "+(dan*i));	
//		
//		
	 //------------------
	 //Exercise 3
	 // 입력한 한 자릿수 정수의 합을 구하는 프로그램을 작성하라
	 // Enter an integer(0~9) : 12345678
	 // Sun of digits = 36
	
		System.out.print("Enter an integer( 0 ~ 9 ) : ");
		
		Scanner scanner = new Scanner(System.in);
	    int remain = 0;
	  
	   
	    for (int putNum=scanner.nextInt(); putNum!=0; putNum/=10) {  //혹은 i가 0초과! 여튼 0만 아니면 됨!
		   remain += putNum%10;	// 	remain = remain + (putNum % 10);   		   
	    } // 즉 10으로 나눠준 나머지 값을 계속 더하는 것!
	   
	    System.out.println("Sum of digits = " + remain);
	   
	   
	    scanner.close();
	   

	}

}
