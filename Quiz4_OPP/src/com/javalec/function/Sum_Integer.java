package com.javalec.function;

public class Sum_Integer {

//Field
int inputNum;	
	
	
	
//Constructor

public Sum_Integer(int inputNum) {
	super();
	this.inputNum = inputNum;
}
	
	
	
	
//Method (return)
public int sumAction() {
	int sum =0; int remainder= 0;
	while(inputNum !=0) {
		remainder = inputNum % 10;
		sum +=remainder;
		inputNum = inputNum/10;		
	}
	return sum;
}



	
	
	
	
}
