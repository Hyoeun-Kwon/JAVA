package com.javalec.base;

import java.util.Scanner;

public class Quiz_0405_04 {

	public static void main(String[] args) {
		// 입력할 숫자의 개수? :
		// __개의 숫자를 입력하세요!:
		//1의 숫자~ 4의 숫자
		// 숫자를 삽입하고자 하는 위치는? :_
		// 삽입하고자 하는 수는?:
		//---결과----
		// 11
		// 22
		// 33
		// 44
		// 55
		//숫자 입력 받기
//		Scanner scanner = new Scanner(System.in);
//		int input = scanner.nextInt(); 
//		int[] numbers = new int[input+1];
//		
//		System.out.print("입력할 숫자의 갯수? :");
//		input=scanner.nextInt();
//		
//		System.out.println(input+"개의 숫자를 입력하세요!");
//		
//		for (int i=0; i<input; i++) {
//			System.out.print((i+1)+ "의 숫자 :");
//			int number=scanner.nextInt();
//			numbers[i]=number;
//		}
//		//삽입하고자 하는 위치 번호 지정
//		System.out.print("숫자를 삽입하고자 하는 위치는 ?");
//		int index = scanner.nextInt();
//		
//		//삽입하고자 하는 수 받기
//		System.out.print("삽입하고자 하는 수는?");
//		int inputNum = scanner.nextInt();
//		
//		//배열 이사하기
//		for(int j=(numbers.length-1); j>=index; j--) {
//			numbers[j]= numbers[j-1];
//		}
//		//배열 값에 숫자 삽입
//		inputNum=numbers[index-1];
//		//결과
//		System.out.println("---------- 결과--------");
//		for(int k=0; k<numbers.length; k+=1) {
//			System.out.println(numbers[k]);
//		}
//		
//		scanner.close();
		//-----------------------------작동이 되지 않는다...------------------------
		
		//--------2021.04.05. 수업후 다시 
		Scanner scanner=new Scanner(System.in);
		int value=0, index=0, addNum=0;
		int[] Num= new int[100];
		
		System.out.print("입력할 숫자의 갯수? : ");
		value=scanner.nextInt();
		System.out.println(value+"개의 숫자를 입력하세요! :");
		for(int i=0; i<value; i++) {
			System.out.print((i+1)+"의 숫자 :");
			Num[i]= scanner.nextInt();
		}
		//삽입하고자 하는 위치 알기
		System.out.print("숫자를 삽입하고자 하는 위치는? :");
		index=scanner.nextInt();
		//삽입하고자 하는 수
		System.out.print("삽입하고자 하는 수는? :");
		addNum=scanner.nextInt();
		//숫자 배열값과 위치 값
		for(int i=value; i>=index-1; i--) {   
			Num[i+1] = Num[i];//배열의 위치가 바껴야함 (이사)
		} 
		 	
		Num[index-1]=addNum;
		

		//결과
		System.out.println("----------결과 -----------");
		for(int j=0; j<=value; j++) {
			System.out.println(Num[j]);
		}
		
	}		

}
