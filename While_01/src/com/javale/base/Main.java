package com.javale.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 입력한 한 자릿수 정수의 합을 구하는 프로그램을 작성하라
		// Enter an integer(0~9): ex_) 123
		//	Sum of digits = 6
		
		Scanner scanner = new Scanner(System.in);
		int remainder = 0; //나머지값이 변수로 필요하구나
		int sum=0; //더한 누적값이 필요해
		System.out.print("Enter an integer :");
		int inputValue = scanner.nextInt();
		
		while(inputValue !=0) { //while 옆은 조건 즉, inputvale가 0이 아니면 계속 해~ 0이면 멈춰
			remainder = inputValue % 10;
			sum += remainder;
			inputValue = inputValue / 10;			
		}
		System.out.println(sum);

	}

}
