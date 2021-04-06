package com.javalec.base;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Random
		
		//가위바위보 6번 돌리기	
//		for(int i=1; i<=6; i++) {
//		double d = Math.random();
//		int a = (int)(d*3) +1; //가위바위보
//		System.out.println(a);
//		}
//		
		//최근에 많이 쓰는 방법
		Random random = new Random();
		int i = random.nextInt(3); // 0,1,2 (3가지 수)
		System.out.println(i+1);
		
		
		
		
	}

}
