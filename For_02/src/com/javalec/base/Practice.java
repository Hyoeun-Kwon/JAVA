package com.javalec.base;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// for 문 한줄로 바꾸기 연습
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your number : ");
		int input = scanner.nextInt();
		int i= 1;
		//계산 
		
			for(int dan=input; dan<=(input+3); dan++) {
				System.out.print(dan + " X " + i + " = " + (dan*i)+"\t"); //print 만 쓰고 tab으로 옆으로 넘겨주기
			}
				// 한줄 아래로 내리기 X1 끝나면 , X2로 
				System.out.println();
		

		
		
		
	}

}
