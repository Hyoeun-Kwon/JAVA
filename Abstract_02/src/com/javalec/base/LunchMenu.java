package com.javalec.base;

public abstract class LunchMenu {

	//Field      ------- child 마다 이 field를 상속 받아 쓸거임
	public int rice;
	public int bulgogi;
	public int banana;
	public int milk;
	public int almond;
	
	
	
	//Constructor
	public LunchMenu() {
		// TODO Auto-generated constructor stub
	}



	public LunchMenu(int rice, int bulgogi, int banana, int milk, int almond) {
		super();
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.banana = banana;
		this.milk = milk;
		this.almond = almond;
	}
	

	//Method
	public abstract int calc();
	
	
}
