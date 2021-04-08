package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Dan;

public class Main {

	public static void main(String[] args) {
		
		//  몇 단으로 할지 입력 받기
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("구구단을 출력할 숫자를 입력하세요 : ");
//		int inputDan = scanner.nextInt();
//		
//		Dan guguDan = new Dan(inputDan); // 단이라는 클래스에서 불러올거야!
//		guguDan.danAction(); // guguDan에 danAction이라는 method를 불러 올거야
		
		
		//------------Quiz 2 -------------------응용 (짝수 부분은 곱하는 값이 *로 나오게 하기)
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단을 출력할 숫자를 입력하세요 : ");
		int inputDan = scanner.nextInt();
		
		Dan guguDan = new Dan(inputDan); // 단이라는 클래스에서 불러올거야!
		guguDan.oddDan(); // guguDan에 danAction이라는 method를 불러 올거야
		
		
		
		
		
	}

}
