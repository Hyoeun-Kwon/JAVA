package com.javalec.base;

public class Child3 extends LunchMenu {

	
	//Constructor
	
	
	public Child3(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
		// TODO Auto-generated constructor stub
	}
	
	
	
	//Method
	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return rice + bulgogi;
	}
	


}
