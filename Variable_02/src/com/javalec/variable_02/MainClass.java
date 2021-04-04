package com.javalec.variable_02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수와 상수
		String str = "James";   //문자열 (Class형 객체)      // 선언부분
		int num = 10;       //정수
		double numDouble = 20.2;  //실수
		char chr = 'a';  // 문자 , 문자는 '' 안에 넣기
		boolean bool = true; // false  , true나 false만 따옴표가 없다 : 글자가 아니다
		
		System.out.println(str + ":" + num);
		System.out.println(num + num);
		System.out.println((double)num + numDouble); //실수 출력 , num 앞에도 double 써줘야 좋음
		System.out.println(num + (int)numDouble); // 정수 출력 (반올림 아님)
		System.out.println(chr);
		System.out.println(bool);
		
		
		
	}

}
