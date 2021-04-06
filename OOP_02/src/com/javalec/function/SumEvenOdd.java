package com.javalec.function;


public class SumEvenOdd {
	//Class의 3가지
	
	//Property (초기값)
	
	
	
	
	//Constructor (생성자)   // 는 만들어 줘야함 (constructor)
	public SumEvenOdd() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	//Method (함수) // .method (위의 클라스-생성자가 있어야 쉽게 사용 가능)
	public int sumCalc(int num1, int num2){    //int 나를 부른 사람에게 int로  넘겨줄거야, 계산해서, public으로 //즉 return 값을 int로 주겠단
		int sum=0;
		for(int i=num1; i<=num2; i++) {
			sum += i;
		}
		return sum; //부른사람에게 준다: return
	}
		
	//짝수인지 홀수인지 알 수 있는 method구하기
	public String evenOdd(int num) { // return값이 String, num을 꼭 sum으로 안해도 됨!
		
		String chk ="";
		if(num%2==0) {
			chk = "짝수";
		}else {
			chk = "홀수";
		}
		return chk;
	}
	
	
	
	
	
	
	
	
}
