package com.javalec.base;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random {

	public static void main(String[] args) {
		// (가위 :1 , 바위:2, 보:3) ? 3
		// - You win !
		// - You lose!
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int value = 0, randomValue=0; // 사용자에게 입력받은 값, random값.
		String result = ""; // 결과 산출위한 변수
		
			System.out.println("가위,바위,보 중 고르세요(숫자 1~3) :");
			 value = scanner.nextInt(); //가위바위보
			 randomValue=random.nextInt(3)+1;//랜덤값
			 System.out.println("User : "+value);
			 System.out.println("Computer :"+ randomValue);
			 
			 //----------입력받은 가위바위보 따라 결과 나오기
		
			 switch(value) {
			 case 1: 
				 if(randomValue==1) {
					 result= "draw";
				 }else if (randomValue==2) { //컴터가 바위, 내가 1인 가위 : 내가 짐
					 result = "you lose";
				 }else 
					 result = "you win";
			 case 2:
				 if(randomValue==1) {
					 result= "you win";
				 }else if (randomValue==2) {
					 result = "draw";
				 }else 
					 result = "you lose";
			 case 3:
				 if(randomValue==1) {
					 result= "you lose";
				 }else if (randomValue==2) {
					 result = "you win";
				 }else 
					 result = "draw";
				 break;
			 
			 } // switch 
			System.out.println(result);
			 
			 
	}

}
