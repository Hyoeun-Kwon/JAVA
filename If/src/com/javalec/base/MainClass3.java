package com.javalec.base;

import java.util.Scanner;

public class MainClass3 {

	public static void main(String[] args) {
		//BMI Calculation BMI지수= 몸무게(kg) ÷ (신장(m) × 신장(m))

		Scanner scanner = new Scanner(System.in);
		System.out.println("몸무게를 입력하세요: ");
		double weight = scanner.nextDouble();

		Scanner scanner2 = new Scanner(System.in); 
		System.out.println("키를 입력하세요: ");
		double height = scanner2.nextDouble();
		

		double BMI= weight / (height * height);
		System.out.println(BMI);
		
		if(BMI>= 30) {
			System.out.println("비만입니다.");
		}else if (BMI >=25) {
			System.out.println("과체중입니다.");
		}else if (BMI >=20) {
			System.out.println("정상입니다.");
		}else {
			System.out.println("저체중입니다.");
		}
		
		

			
		
	}

}
