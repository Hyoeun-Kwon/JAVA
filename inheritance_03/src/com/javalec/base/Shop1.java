package com.javalec.base;

public class Shop1 extends StoreHQ {

	//Field
	
	
	//Constructor
	public Shop1() {
		// TODO Auto-generated constructor stub
	}
	
	//Method
	//가격 변동하기
	@Override
	public void orderKim() {
		// TODO Auto-generated method stub
		System.out.println("김치찌개 : 4,500원");
	}
	
	@Override
	public void orderBu() {
		// TODO Auto-generated method stub
		System.out.println("부대찌개 : 5,000원");
	}
	@Override
	public void orderSoon() {
		// TODO Auto-generated method stub
		System.out.println("순대국 : 판매하지 않습니다.");
	}
	
	public void printMenu() {
		System.out.println("Shop1--------------");
		orderKim();
		orderBu();
		orderBi();
		orderSoon();
		orderKong();
			
	}
	
	
}// 맨끝
