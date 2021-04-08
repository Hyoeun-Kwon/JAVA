package com.javalec.fuction;

public class Div {
	//Field
	public String message;
	
	//나누기 constructor
	public Div() {
		// TODO Auto-generated constructor stub
	}
	
	//나누기 Method
	public String division(int num1, int num2) {
		double divResult = 0.0;
		
		if (num1==0||num2==0) {
			message = "error";
		}else {
			divResult = (double) num1 / num2;	
		}
		return Double.toString(divResult);		
		
	}
	
	//12(숫자)나누기 0 은 0, 0나누기 0은 잘못된 숫자
	//0나누기 12는 0
	
}
