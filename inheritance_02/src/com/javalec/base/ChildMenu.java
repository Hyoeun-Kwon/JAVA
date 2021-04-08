package com.javalec.base;

public class ChildMenu extends ParentsMenu {

	
	
	//Field
	

	//Constructor
	public ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	

	
	//Method
	//신메뉴 추가하기 1
	public void makeBeefChung() {
		System.out.println("소고기 청국장");
	}
	//신메뉴 추가하기 2
	public void makehotDoen() {
		System.out.println("얼큰 된장");
	}
	
	
	//개발 메뉴 1
	//makechung에서 컨+스페이스 override
	@Override //에노테이션  overload와 다름 그리고 이 표시는 안지우는게 좋음
	
	public void makeChung() {
		// TODO Auto-generated method stub
		System.out.println("냄새 없는 청국장");  //원래 있던 super지우고 만들기 (=기능을 바꾸기)
	}
	
	
	
//	@Override
//	public void makeChung() {
//		// TODO Auto-generated method stub
//		super.makeChung();
//		System.out.println("냄새 없는 청국장");  // 이렇게 하게되면 super의 값도 나오고, 바꾼다는 이름도 따로 출력됨
//	}
	
	
	
}
