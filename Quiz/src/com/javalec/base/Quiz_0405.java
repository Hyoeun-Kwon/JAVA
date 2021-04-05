package com.javalec.base;

import java.util.Scanner;

public class Quiz_0405 {

	public static void main(String[] args) {
		//Quiz12
		// 몇 단계의 피라미드로 구성할까? : _4_
		// 1
		// 2 3
		// 4 5 6
		// 7 8 9 10
		
		System.out.print("몇 단계의 피라미드로 구성할까? :");
		Scanner scanner = new Scanner(System.in);		
		int inputNum = scanner.nextInt(); // 숫자 입력 받기 (저장소)
		int Num=0;
		for(int i=1; i<=inputNum; i++) {
         //입력받은 수만큼만 줄 보여주기
			for(int j=1; j<=Num; j++) { //숫자가 하나씩 더해져서 나와야함
			Num+=1;
			System.out.println(Num);
			}
			
		}
		
		

	}

}
