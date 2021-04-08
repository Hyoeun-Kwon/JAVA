package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		// Child1
		LunchMenu child1 = new Child1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		// static 이므로 new 안하고 바로 priceTable클래스의  rice라는 필드 이름을 받는다.
		System.out.println("Child1의 식대 : "+ child1.calc());
		
		// Child2
		LunchMenu child2 = new Child2(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		System.out.println("Child2의 식대 : "+ child2.calc());
		
		// Child3
		LunchMenu child3 = new Child1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		System.out.println("Child3의 식대 : " + child3.calc());
		
		
		
		
		
		
	}//main


}//end
