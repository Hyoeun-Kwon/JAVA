package com.javalec.base;

import java.util.Scanner;

public class Quiz_0405_03 {

	public static void main(String[] args) {
		//Quiz11
		// 입력할 숫자의 갯수? : _4_ 
		// 4개의 숫자를 입력하세요! :
		// 1의 숫자:
		// 4의 숫자: 까지
		// 검색할 숫자는? : __33_
		// _33_의 위치는 _3_번째 입니다.
		
		//처음에 사용자가 몇개 배열 줄지 모르니 100개 잡고 하자 대략
		
		//숫자 입력 받기
		System.out.print("입력할 숫자의 갯수? :");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		System.out.println(input+"개의 숫자를 입력하세요!:");
		int[] value = new int[input];  // 입력받은 숫자들 저장해둘 배열
		
		//1~ 입력받은 숫자까지의 ex) 4까지의, 숫자들 저장해두기 [배열]----------
		for(int i=1; i<=input; i++) {
			System.out.print(i+"의 숫자:");
			value[i-1]= scanner.nextInt(); // 입력받은 숫자가 배열의 0번부터 들어가게 해줌
//			System.out.println(value[i]); // value가 저장되는지 확인
		}
		
		//검색할 숫자 입력시키기-------------------------------
		System.out.print("검색할 숫자는? :");
		int search =scanner.nextInt();// 검색할 숫자 받기
		
		//배열값과 검색한 숫자를 맞춰보기------------
		for(int j=0; j<value.length; j++) {
			if(search==value[j]) {
			System.out.println(search+"의 위치는 " + value[j]+ "번째 입니다.");
			}
		}
			
			System.out.println(search+"는 존재하지 않습니다.");	
			scanner.close();
	}

}
