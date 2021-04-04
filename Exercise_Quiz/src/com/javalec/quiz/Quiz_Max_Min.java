package com.javalec.quiz;

import java.util.Scanner;

public class Quiz_Max_Min {

	public static void main(String[] args) {
		// James의 신장을 입력하세요:
		// Cathy의 신장을 입력하세요:
		// Kenny의 신장을 입력하세요:
		// Martin의 신장을 입력하세요:
		// Crystal의 신장을 입력하세요:
		//평균 신장은: ___
		//가장 큰 학생은 ___ 이고 그 학생의 키는 ___
		//가장 작은 학생은 ____ 이고 그 학생의 키는 ____
		
		// 학생별 신장 입력받기
		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};		
		Scanner scanner= new Scanner(System.in);
		double sum=0.0; 
		double avg=0.0;
		double maxHeight=0;
		double minHeight=1000;
		double[] height = new double[name.length];
		String maxindex="";
		String minindex="";
		
		//같은 문장이 반복되므로, for문으로 입력 받기
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+"의 신장을 입력하세요: ");
			height[i] = scanner.nextDouble();
			sum+=height[i]; // 평균을 구하기 위해 합을 구하기
			//가장큰 키와, 가장작은 키 및, 사람이름 구하기
			if(maxHeight<height[i]) {
				maxHeight=height[i];
				maxindex=name[i];
			}else if(minHeight>height[i]){
				minHeight=height[i];
				minindex=name[i];
			}
		}
		avg=sum/name.length;
		System.out.println("평균 신장은 "+ avg + "입니다.");
		
		System.out.println("가장 큰 사람은"+ maxindex +"이고 그 학생의 키는"+ maxHeight+ "이다." );
		System.out.println("가장 큰 사람은"+ minindex +"이고 그 학생의 키는"+ minHeight+ "이다." );
		
	
		
		
		
		
	}
	

}
