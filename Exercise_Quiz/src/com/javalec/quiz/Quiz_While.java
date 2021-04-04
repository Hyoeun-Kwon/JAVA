package com.javalec.quiz;

import java.util.Scanner;

public class Quiz_While {

	public static void main(String[] args) {
		// 몇개의 숫자를 더할까요? : _2_
		//_2_ 개의 숫자를 입력하세요.
		//_5_
		//_6_
		//입력한 숫자의 합은 _11_입니다.
		
		//더할 숫자를 입력받기 -----------------------for 활용-------------------
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("몇개의 숫자를 더할까요? :");
//		int inputValue = scanner.nextInt();
//		int sum = 0; // 합계를 저장해 둘 변수
//		
//		System.out.println(inputValue+"개의 숫자를 입력하세요.");
//		for (int i=1; i<=inputValue; i++) {
//		int inputNum = scanner.nextInt();//다시 입력 받을 각각의 수
//		// 입력 받은 수를 이용하여 합 구하기 
//		sum +=inputNum;
//		}
//		
//		System.out.println("입력한 숫자의 합은 "+ sum + "입니다.");
		
		//------------while 활용-------------------
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇개의 숫자를 더할까요? :");
		int inputValue = scanner.nextInt();
		int sum = 0; // 합계를 저장해 둘 변수
		
		System.out.println(inputValue+"개의 숫자를 입력하세요.");
		int i=1;
		while(i<=inputValue) {
			int inputNum = scanner.nextInt();
			sum +=inputNum;
			i++;
		}
		System.out.println("입력한 숫자의 합은 "+ sum + "입니다.");
		scanner.close();
		
		
		
		//while 의 활용(무한반복 멈추기) ex) 키오스크
		int j = 1;		
		while(true) {
			if(j>=5) {
				break;
			}
			System.out.println(j);
			j++;
		}
		
		
		
		
		
		
		
	}

}
