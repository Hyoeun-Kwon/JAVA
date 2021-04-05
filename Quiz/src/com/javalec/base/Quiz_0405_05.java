package com.javalec.base;

import java.util.Scanner;

public class Quiz_0405_05 {

	public static void main(String[] args) {
		//입력할 숫자의 갯수? :
		// __ 개의 숫자를 입력하세요!:
		//1의 숫자 ~ __ 개의 숫자:
		//몇번째의 숫자를 삭제 하시겠습니까? _3_
		//----------결과---------
		// 11
		// 22
		// 44
		// 55
		
		Scanner scanner = new Scanner(System.in);
		int[] Num = new int[100]; // 사용자가 몇개 입력할지 모름! 아니면, [input]으로 할 수도 있음: 
		int delete=0;
		//입력할 갯수 받기
		System.out.print("입력할 숫자의 갯수 ? :");
		int input = scanner.nextInt();
		// 입력받은 숫자갯수만큼 수를 입력 받기
		System.out.println(input +"개의 숫자를 입력하세요!:");
		for(int i=1; i<=input; i++) {
			System.out.print(i+"의 숫자 :");
			Num[i-1] =scanner.nextInt(); // 이렇게 하면, Num[0] 은!? 그래서 -1 해주기	
		}
		//삭제할 숫자 받기
		System.out.println("몇번째의 숫자를 삭제 하시겠습니까? ");
			delete = scanner.nextInt();
		//삭제하기 전 배열 이동시키기 및 삭제하기
			
			
	}

}
