package com.javalec.function;

public class SumEvenOdd2 {

	//Field, Property
	int num=0; //전역변수
	//Constructor
	public void sumCalc(int num1, int num2){   //void는 내보내지 않고, 안에서 쓴다는 이야기
		int sum=0;
		for(int i=num1; i<=num2; i++) {
			sum += i;
		}
		num=sum;
		System.out.println(num1+ " ~ " + num2 + " 의 합은 "+ sum + "입니다.");
	}
		
	//짝수인지 홀수인지 알 수 있는 method구하기
	public void evenOdd() { 
		
		String chk ="";
		if(num%2==0) {
			chk = "짝수";
		}else {
			chk = "홀수";
		}
		System.out.println(chk + " 입니다.");
	}
	
	
	
	
	
}
