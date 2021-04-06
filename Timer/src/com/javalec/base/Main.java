package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 시작시간 - 끝시간
		// String 과 String builder의 측정
		
		String str1 = "a";
		
		
		long startTime1 = System.currentTimeMillis(); // start time주기
		//a를 5000만번 돌리기! 
		for (int i=1; i<=50000; i++) {
			str1 = str1 + "a";
		}
		long endTime1 = System.currentTimeMillis(); // end time주기
		System.out.println("Term1 :" + (endTime1 - startTime1));
		
		System.out.println("-------------------------");
		//------------string builder의 측정
		
		StringBuilder stringBuilder = new StringBuilder("a");
		
		long startTime2 = System.currentTimeMillis(); // start time주기
		//a를 5000만번 돌리기! 
		for (int i=1; i<=50000; i++) {
			stringBuilder = stringBuilder.append("a");
		}
		long endTime2 = System.currentTimeMillis(); // end time주기
		System.out.println("Term2 :" + (endTime2 - startTime2));
		
		
		//sting은 100이 넘는 수치, 빌더는 10 내외 (속도 차이가 있음)
		
		
	}

}
