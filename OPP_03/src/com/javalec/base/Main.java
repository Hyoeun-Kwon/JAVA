package com.javalec.base;

import com.javalec.fuction.AddNum;

public class Main {

	public static void main(String[] args) {
	
	int num1 =10, num2=20;
	//Method 매개변수(파라미터)로 호출 ---- 이게 더 좋음
	AddNum addNum = new AddNum();
	int resultNum =addNum.addAction(num1,num2);
	System.out.println(resultNum);
	
	//결과값과 Sub Class에서 실행
	addNum.addPrint(num1,num2);
	
	//Constructor로 호출
	
	AddNum addNum2 = new AddNum(num1, num2);// constructor 2번째.
	int resultNum2 = addNum2.addAction2();
	System.out.println(resultNum2);
	
	//이름이 똑같아도 쓸수잇다: 오버로딩
	
	//Field 값으로 호출
	addNum.num1 = num1;
	addNum.num2 = num2;
	int resultNum3 = addNum.addAction2();
	System.out.println(resultNum3);
	}

}
