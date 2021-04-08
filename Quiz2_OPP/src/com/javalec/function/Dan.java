package com.javalec.function;



public class Dan {
//Field
int inputDan;//전체가 입력 받아서! 값을 줄 수 있음.
	
//constructor
public Dan(int inputDan) {
	super();
	this.inputDan = inputDan; // 색상 잘 보기!
}
	
	
	
//method
//public void danAction() { //매개변수가: 사용자가 입력한 값으로 받아 져야 함.
//	
//	for(int i=1; i<=9; i++) { // for문으로 구구단 형탱 만들기 입력받은단 X 수는 = 얼마!
//			System.out.println(inputDan+ " X "+ i +" = " + (inputDan*i));
//		}
//	}

//method 2 (홀수 부분의 수만 구구단이 보이게 하라: 9 X 1 = 9, 9 X 3 = 18,
public void oddDan() {
	for (int i=1; i<=9; i++) {
		if(i%2==0) {
			System.out.println(inputDan+" X * = " + (inputDan*i));
		}else
			System.out.println(inputDan + " X " + i + " = "+ (inputDan*i));
	}
	
	
	
	
}
	
}

	
	
	
	



