package com.javalec.base;

import java.util.function.DoubleUnaryOperator;

public class Variable_01 {

	public static void main(String[] args) {
		// 변수 (Variable)
		// 문자열 변수 선언
		String str = "Hello, World!"; // 변수 선언 (S-대문자tring 은 문자열,class 형태)
		
		System.out.println(str);
		System.out.println(str);
		
		str = "abc"; //string으로 변수를 다시 선언할 필요는 없고, 바꿔주면 값이 바뀜
		System.out.println(str);
		
		// 정수 변수 선언
		int num1 = 10;
		int num2 = 20;
		int plusResult;  //camel기법 (소문자시작, 중간 대문자 시작) (중간에 넣을 수 도 있지만 선언은 위에 몰아주기)
		
		plusResult = num1 + num2; // 작성시 선언, 처리, 출력 순으로 하는 것이 좋음
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println((double)num1 / num2); // double로 잠깐동안 num1을 실수로 반영하겠다
		System.out.println((double)(num1 / num2)); // 이미 정수로 계산후 바꾸면 의미 없음 즉, 변환 의미 없음
		
		System.out.println(plusResult);
		
		// ---- Ecercise
		int startNum = 30, endNum = 40;
		/*
		 30과 40의 덧셈 결과는 70입니다.
		 30과 40의 뺄셈 결과는 -10입니다.
		 30과 40의 곱셈 결과는 1200입니다.
		 30과 40의 나눗셈 중 몫은 0 입니다.
		 30과 40의 나눗셈 결과는 __ 입니다.

		 */
		int plusResult2;
		int miResult;
		int multiResult;
		int devideResult;
		double sdevideResult;
		
		plusResult2 = startNum + endNum;
		miResult = startNum - endNum;
		multiResult = startNum * endNum;
		devideResult = startNum / endNum;
		sdevideResult = (double) startNum / endNum;
		
		
		System.out.println(startNum + "과 " + endNum + "의 덧셈 결과는 " + (plusResult2) + "입니다");
		System.out.println(startNum + "과 " + endNum + "의 뺄셈 결과는 " + (miResult) + "입니다");
		System.out.println(startNum + "과 " + endNum + "의 곱셈 결과는 " + (multiResult) + "입니다");
		System.out.println(startNum + "과 " + endNum + "의 나눗셈 중 몫은 " + (devideResult) + "입니다");
		System.out.println(startNum + "과 " + endNum + "의 나눗셈 결과는 " + (sdevideResult) + "입니다");
		System.out.println(startNum + "과 " + endNum + "의 덧셈결과와 뺄셈 결과의 곱은 " + (plusResult * miResult) + "입니다");
		
		
		
		
		
	}

}
