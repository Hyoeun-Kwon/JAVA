package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// MVC(model, view, controller) pattern :3등분 되어있음.
		
		int num1 =123;
		String str1 ="12345";
		String str2 = "abcde";

		String str3=Integer.toString(num1); // int를 문자열로 변경 (Class형 integer)
		System.out.println(str3+str1);//문자만 붙음 (계산 불가)
		
		
		int num2= Integer.parseInt(str1);//String을 int로
		System.out.println(num1+num2); //계산이 됨
		
		//JAVA는 객체 지향 프로그램: 객체프로그램의 정의, Method
		//JAVA=OOP: : Object Oriented Program
		
	}

}
