package com.javalec.variable_03;

import java.net.MulticastSocket;

public class MainClass {

	public static void main(String[] args) {
		// 연산자 종류별 출력
		int i = 10;
		int j = 2, k = 5;
		
		
		System.out.println("<--산술 연산자 -->");
		System.out.println("덧셈:" + i + " + " + j + " = " + (i+j));
		System.out.println("뺄셈:" + i + " - " + j + " = " + (i-j));
		System.out.println("곱셈:" + i + " * " + j + " = " + (i*j));
		System.out.println("나눈 몫:" + i + " / " + j + " = " + (i/j));
		System.out.println("나눈 나머지:" + i + " % " + j + " = " + (i%j));  // 나머지값은 % -> 짝수(0), 홀수(1) 구할때(2로 나눠서) 
				
		System.out.println("<--자동 증감 연산자 -->");  //반복문때 많이 사용
//		i = i + 1;
//		i += 1;  ,  i +=3
		i++;		
		System.out.println(i);
		
//		j = j - 1;
//		j -= 1;
		j--;   // 1만 가능
		System.out.println(j);
		
		System.out.println("<-- 동등 비교 관계 연산자 -->"); // 크냐 작냐
		System.out.println("i == j : " + (i == j));
		System.out.println("i != j : " + (i != j));
		System.out.println("i > j : " + (i > j));
		System.out.println("i < j : " + (i < j));
		System.out.println("i >= j : " + (i >= j));
		System.out.println("i <= j : " + (i <= j)); // <, > 부터 쓰구 = 를 써야함 
		
		System.out.println("<-- 논리 연산자 -->");
		System.out.println((i > j ) && (j > k));
		System.out.println((i > j ) || (j > k));
		
		System.out.println("<-- 삼항 연산자 -->");
		System.out.println(k==5 ? "k==5" : "k!=5");  // k가 5면 k==5를 실행하고 아니면 k!=5를 실행하라
		System.out.println(k==5 ? "k는 5" : "k는 5아님");
		
		// Exercise : i가 홀수 인지 짝수 인지 출력하시오
		System.out.println(i%2==0 ? "짝수" : "홀수");
		
		
	}

}
