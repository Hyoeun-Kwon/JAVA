package com.javale.base;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// 몇개의 숫자를 더할까요? ex) 4
		// 4개의 숫자를 입력하세요
		//1
		//2
		//3
		//4
		//입력한 숫자의 합은 10 입니다.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇개의 숫자를 더할까요? :");
		int inputValue = scanner.nextInt();
		System.out.println(inputValue + "개의 숫자를 입력하세요");
		
		for(int inputnum=scanner.nextInt(); inputnum<=1; inputnum++) {
			System.out.print(inputnum+"\n");
		}
		
		
		
		
	}

}
