package com.javalec.base;

public class StoreShop1 extends StoreHQ {
	// StoreHQ를 상속받자!
	
	@Override
	public void orderKim() {
		// TODO Auto-generated method stub
		System.out.println("김치찌개 : 4,500원");

	}
	
	
	// 정해진 양식 ( 즉, 상속 받았으므로  아래 메뉴를 안쓰더라도 남겨둬야함!!
	
	
	//삭제 불가: 부대찌개, 비빔밥
	@Override  // 에노테이션(엣)
	public void orderBu() {
		// TODO Auto-generated method stub

	}

	@Override
	public void orderBi() {
		// TODO Auto-generated method stub

	}
	
	//추가 적인 기능은 가능하나 삭제는 불가하다 - 공기밥 추가!
	public void orderKong() {
		
	}
	

}//end
