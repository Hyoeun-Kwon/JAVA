package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =10;
		int j =0;
		
		System.out.println("Add :"+ (i+j));
		System.err.println("Sub :"+ (i-j));
		System.out.println("Mul :"+ (i*j));
		
		try {	
			System.out.println("Div :"+ (i/j));   //애매한애 얘가 나오면
		}catch(Exception e) { //int i 랑 같은거임 Exception 도 대문자 즉, 클래스임
//			System.out.println(e.getMessage()); // 에러코드 나옴
			System.out.println("숫자를 확인하세요~!"); //이런 메세지를 주세요
		}
		//Data base 는 무조건 try, catch 사용
		
		
		
		
		
		
	}

}
