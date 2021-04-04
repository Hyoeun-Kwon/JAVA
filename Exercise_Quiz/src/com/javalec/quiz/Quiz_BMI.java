package com.javalec.quiz;

import java.util.Scanner;

public class Quiz_BMI {

	public static void main(String[] args) {
		/* ---<BMI 수치 보여주기>---
		 * 
		 * 당신의 신장을 입력하세요 : 180
		 * 당신의 체중을 입력하세요 : 80
		 * 
		 * 당신의 BMI는 *** 이며, 과체중 범위입니다.
		 * 
		 */
		 // 신체질량지수 = 체중/(신장*신장)
		 // 범위 : 저체중/20미만, 정상 20~24, 과체중25~29, 30이상 비만
		
		
		
		Scanner scanner = new Scanner(System.in); // scanner로 사용자 신장, 체중 입력받기
		double height =0.0;
		double weight =0.0;
		
		System.out.print("당신의 신장을 입력하세요 :");
			height = scanner.nextDouble(); // 키를 입력받기
		System.out.print("당신의 체중을 입력하세요 :");
			weight = scanner.nextDouble(); // 체중 입력받기
			
		double bmi = weight/(height*(0.01))*(height*(0.01)); // bmi 지수를 처리하기 위한 저장소
		
		//처리
		if(bmi<20) {
			System.out.println("당신의 bmi는"+bmi+"이며, 저체중입니다.");
		}else if (bmi<=24) {
			System.out.println("당신의 bmi는"+bmi+"이며, 정상체중입니다.");
		}else if (bmi<=29) {
			System.out.println("당신의 bmi는"+bmi+"이며, 과체중입니다.");
		}else {
			System.out.println("당신의 bmi는"+bmi+"이며, 비만입니다.");
			
		}

		
		
	}

}
