package com.javalec.base;

public class Child1 extends Menu {

	
	
	//Constructor
	public Child1() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Child1(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
		// TODO Auto-generated constructor stub
	}





	//calc 이용하여 알아서 계산하게 두
	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return rice + bulgogi + banana;
	}

}
