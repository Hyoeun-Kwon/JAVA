package com.javalec.quiz;

public class Quiz_Decimal {

	public static void main(String[] args) {
		// 10^ 0 =    1
		// 10^ 1 =   10
		// 10^ 2 =  100
		// 10^ 10 까지 구하기
		long value = 1;
		
		//반복되므로 반복문 for 사용
		for(int i=1; i<=10; i++) {
			System.out.println("10^"+ String.format("%2d",i) + " = " + String.format("%12d",((value*=10)/10)));
			
		}
		
		
		
		
		
	}

}
