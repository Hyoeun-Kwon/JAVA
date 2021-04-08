package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child = new Child(); // Child 할 때 ! 컨+ 스페이스 해서 연결 시켜야함!
		System.out.print("아버님 성명 :");
		child.getFather(); // 상속 받았으므로, child에 method 없는데도 가져올 수 있음
		System.out.print("어머님 성명 :"); 
		child.gerMother();
		
		//자바에서 상속은 하나뿐이 안된다
		
		
		
		

	}

}
