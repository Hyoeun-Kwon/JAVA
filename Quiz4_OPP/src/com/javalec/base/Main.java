package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Sum_Integer;

public class Main {

	public static void main(String[] args) {
		
		// 숫자 입력 받기
		System.out.print("Enter an integer(0~9) :");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		
		
		Sum_Integer sumInteger = new Sum_Integer(inputNum);
		int digit = sumInteger.sumAction();
		System.out.println("Sum of digits ="+digit);
	}

}
