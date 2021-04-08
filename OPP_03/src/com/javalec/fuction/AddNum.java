package com.javalec.fuction;

public class AddNum {
	//Field
	public int num1, num2; //기본 private;
	
	
	//Constructor // constructor를 통한다! 길!느낌(ME)
	
	public AddNum() {
		// TODO Auto-generated constructor stub
	}
	
	
	public AddNum(int num1, int num2) {
		super(); //안적어도 됨.
		this.num1 = num1;//this는 내꺼다. 쓰기싫으면 변수이름 클릭하면 됨
		this.num2 = num2;
	}


	//Method
	public int addAction(int i , int j) {
		int addResult = i+j;
		return addResult;
	}
	
	public void addPrint(int i , int j) {
		System.out.println(i+j);
	}
	//매개변수 없는 매소드
	public int addAction2() {
		return num1 + num2; // 이곳에서의 num1, num2는 filed값임
	}
	
}
