package com.javalec.function;

public class AddCalc {

	
	
//Field	
	
	
	
	
//Constructor	
	public AddCalc() {
		// 배열로 덧셈을 구할때. (이를 응용해서 곱셈, 나눗셈 등 가능)
	}
	
	
//Method	
	//두번째 방법 -------------
	public int sumCalc(int[] arr){ //arr 배열 매개변수
		int tot=0; //합산되서 결과가 나올 장소
		for(int i=0; i<arr.length; i++) {
			tot+=arr[i];
		}
		return tot;
	}
	

	
//첫번째 방법----------------------------	
//	public int[] sumCalc(int[] arr) { // 여기에 배열을 저장하는것 같음!
//		int[] incNum = new int[arr.length];
//		for(int i=0; i<arr.length; i++) {
//			incNum[i] = arr[i] +1;
//		}	
//		return incNum;
//	}






}
