package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 초기 값이 없는 배열 선언 및 데이터 추가하기 Array
		
//		String[] str = new String[7];  // int = i; 와 같은 것!
//		
//		str[0] ="일요일";
//		str[1] ="월요일";
//		str[2] ="화요일";
//		str[3] ="수요일";
//		str[4] ="목요일";
//		str[5] ="금요일";
//		str[6] ="토요일";
		
		// 초기 값이 있는 경우
		String[] str = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		
		//결
		
		System.out.println(str); // 암호로 나옴
		System.out.println(str[0] + " , " + str[3] + " , "+ str[5]);   // 갯수가 많아지면 이렇게 하나하나 다 못 뽑음 -> 그래서for 반복문 필
		
		// 반복문을 할용해 배열알기
		for(int i=0; i<str.length; i++) {  // i<=str.length 하면 오류 걸림 왜? 갯수는 7개나 , 찍힌건 0~6 즉 6이므로
			System.out.println(str[i]);
		}
		
		

	}

}
