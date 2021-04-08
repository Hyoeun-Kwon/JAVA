package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 체인점 사업
		
//		System.out.println("HQ-----------------");
//		StoreHQ storeHq = new StoreHQ();
//		storeHq.orderkim();
//		storeHq.orderBu();
//		storeHq.orderBi();
//		storeHq.orderSoon();
//		storeHq.orderKong();
//		System.out.println();
//		
//		System.out.println("Shop1--------------");
//		Shop1 shop1 = new Shop1();
//		shop1.orderKim();
//		shop1.orderBu();
//		shop1.orderBi();
//		shop1.orderSoon();
//		shop1.orderKong();
//		System.out.println();
//		
//		System.out.println("Shop2--------------");
//		Shop2 shop2 = new Shop2();
//		shop2.orderKim();
//		shop2.orderBu();
//		shop2.orderBi();
//		shop2.orderSoon();
//		shop2.orderKong();
//		System.out.println();
//		
//		System.out.println("Shop3--------------");
//		Shop3 shop3 = new Shop3();
//		shop3.orderKim();
//		shop3.orderBu();
//		shop3.orderBi();
//		shop3.orderSoon();
//		shop3.orderKong();
		
		//------------------------------------------------2번째 방법
		// 아니면 main을 깔끔하게 하기 위해 결과값을 출력하는 Method를 각 class에 만들어서 main에서 보이게 해도 됨
		//각 Class에서 불러와 저장하기
//		StoreHQ storeHq = new StoreHQ();
//		Shop1 shop1 = new Shop1();
//		Shop2 shop2 = new Shop2();
//		Shop3 shop3 = new Shop3();
//		
//		//프린트 메소드를 이용해서 보여주기
//		storeHq.printMenu();
//		shop1.printMenu();
//		shop2.printMenu();
//		shop3.printMenu();
		//-----------------------------------------------3번째 방법
		//클래스를 for문으로 돌려보기 (시도)
		System.out.println("=========================");
		StoreHQ[] store = {new StoreHQ(), new Shop1() , new Shop2(), new Shop3()};  // new constructor는 데이터다!
		//먼저 선언해뒀으면 배열안에 new로 안하고 객체만 넣어도 됨 ex) shop1.
		for( int i=0; i<store.length; i++) {
			store[i].orderKim();
			store[i].orderBu();
			store[i].orderBi();
			store[i].orderSoon();
			store[i].orderKong();
			System.out.println("-----------------------");
		}
			
		
		
		
		
		
		
	}//Main

}//맨끝

