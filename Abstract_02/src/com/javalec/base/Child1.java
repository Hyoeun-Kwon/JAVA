package com.javalec.base;

public class Child1 extends LunchMenu {

	//Constructor
	public Child1() {
		// TODO Auto-generated constructor stub
	}
	
	//소스로 만든 컨스트럭터
	public Child1(int rice, int bulgogi, int banana, int milk, int almond) {  // 소스에서 SuperClass복사해서 만든 컨스트럭터
		super(rice, bulgogi, banana, milk, almond); // super가 있어야 lunch메뉴에서 변수를 가져다 씀..!?
		// TODO Auto-generated constructor stub
	}





	// abstract를 상속 받으면 나오는 기본 값
	@Override
	public int calc(){
		// TODO Auto-generated method stub
		return rice + bulgogi + banana;   //상속 받았으므로 변수를 그냥 바로 사용 가능하다.   	
	}//calc
	// 맨처음은 return = int 라서 0임
	
	
	
	
	
	
	
	
}//end
