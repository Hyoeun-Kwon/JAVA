package com.javalec.funtion;

public class Four_Function {

int firstNum =0;
int secondNum=0;
String result= "";
//constructor	

public Four_Function(int firstNum, int secondNum) {
	super();
	this.firstNum = firstNum;
	this.secondNum = secondNum;
}
	
//Method 1 : 덧셈
	public int add() {
		int addResult = firstNum + secondNum;
		return addResult;
	}
	
//Method 2 : 뺄셈
	public int sub() {
		int subResult = firstNum - secondNum;
		return subResult;
	}
//Method 3 : 곱셈
	public double mul() {
		double mulResult = (double)firstNum * (double)secondNum;
		return mulResult;
	}
	
//Method 4 : 나눗셈
	public String div() {
		if(firstNum==0||secondNum==0) {
		result = "error";
		}else {
//		result = Double.toString((double)firstNum * (double)secondNum);  // 이 방법도 가능!
		result = Double.toString((1.0*firstNum)/secondNum);
		}
		return result;
	}




	
	
	
	
}
