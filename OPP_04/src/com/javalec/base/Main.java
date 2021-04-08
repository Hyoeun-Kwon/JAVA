package com.javalec.base;

import com.javalec.function.AddCalc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {10, 20, 30, 40, 50};
		//두번째 방법
		AddCalc addCalc = new AddCalc();
		int sum = addCalc.sumCalc(num); // num을 넣엇을 때 결과 sum을 보여줘!
		System.out.println(sum);
		
			
		
//		//1번째 방법----------------------------
//		AddCalc addCalc = new AddCalc();
//		int[] otherNum = addCalc.sumCalc(num);
//		for(int i=0; i<num.length; i++){
//			System.out.println(otherNum[i]); //확인용 메세지 인듯!
//				
//		}
//		
//		// 결과 값 : 11, 21, 31, 41, 51
	
	
	
	
	
	
	}
	
	
}
