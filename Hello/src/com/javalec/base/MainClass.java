package com.javalec.base;

public class MainClass {

	public static void main(String[] args) {

		/* ------------------------------
		 * 아래의 기능은 화면에 출력하는 기능입니다.
		 * ------------------------------- 
		 */
		
		// 화면에 문자열 상수 출력
		System.out.println("-------------");
		System.out.println("Hello, World!");
		System.out.println("-------------");
		                                                                                                               
		
		System.out.print("-------------");
		System.out.print("Hello, World!");
		System.out.println("-------------");
		
					
		/*
		 * command + alt + 방향키 : 방향키 방향으로 바로 복사 , alt + 방향키 : 방향으로 이동 ,command + d는 지우기 (맥) 
		 */
		
		// 화면에 정수(숫자) 상수 출력
		System.out.println(10);
		System.out.println(10 + 20);  // 덧셈
		System.out.println(10 - 20);  // 뺄셈
		System.out.println(10 * 20);  // 곱셈
		System.out.println(10 / 20);  // 나눗셈 답이 0.5 이므로 실수라 안나옴
		System.out.println(10.0 / 20.0);  // 나눗셈( 실수로만들고 나눠주면 값 나옴)
		
		// 화면 출력을 예쁘게 하기
		System.out.println("a " + "b");
		System.out.println(10 + "+" + 20 + "=" + (10+20)); // 문자열과 숫자(정수) 합하여 깔끔하게 하기
		System.out.println(10 + "-" + 20 + "=" + (10-20)); // 결과값에 () 해줘야 값이 나옴, 보기도 편함
		System.out.println(10 + "*" + 20 + "=" + (10*20));
		System.out.println(10 + "/" + 20 + "=" + (10/20));
		
		
		
	}

}
