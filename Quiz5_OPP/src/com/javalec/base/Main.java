package com.javalec.base;

import java.util.Scanner;

import com.javalec.funtion.Four_Function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		int firstNum = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int secondNum = scan.nextInt();
		
		System.out.println(">>>>>>>>>>>결과<<<<<<<<<<<<");
		
		//기능을 Method에서 가져오기
		Four_Function function = new Four_Function(firstNum,secondNum);
		int addResult = function.add();
		int subResult = function.sub();
		double mulResult = function.mul();
		String divResult = function.div();
		
		//결과 값 출력
		System.out.println("덧셈  :" + addResult);
		System.out.println("뺄셈  :" + subResult);
		System.out.println("곱셈  :" + mulResult);
		if(divResult == "error") {
			System.out.println("0은 나눌 수 없습니다. 다른 값으로 입력해주세요");
		}
		System.out.println("나눗셈 :"+ divResult); // format 줄 수잇나.
		
		
	}

}
