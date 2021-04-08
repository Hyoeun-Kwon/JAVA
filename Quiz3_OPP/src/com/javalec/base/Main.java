package com.javalec.base;

import java.util.Scanner;

import com.javalec.fuction.Add;
import com.javalec.fuction.Div;
import com.javalec.fuction.Mul;
import com.javalec.fuction.Sub;


public class Main {

	public static void main(String[] args) {
		// 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		int inputNum1 = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int inputNum2 = scanner.nextInt();
		
		//Method 매개변수로 Add 호출
		Add add = new Add();
		int addResult = add.addAction(inputNum1,inputNum2); // addresult 는 변수니까 이름 달라도 ㅇㅋ.(resultAdd라고 해도 됨)
		System.out.println(inputNum1+"과 "+inputNum2+"을 더한 값은 "+addResult+" 입니다");
		
		//Method 매개변수로 Sub 호출 
		Sub sub = new Sub();
		int subResult = sub.subtracion(inputNum1,inputNum2);
		System.out.println(inputNum1+"과 "+inputNum2+"을 뺀 값은 "+subResult+" 입니다");
		
		//Method 매개변수로 Mul 호출
		Mul mul = new Mul();
		double mulResult = mul.multiplication(inputNum1,inputNum2);
		System.out.println(inputNum1+"과 "+inputNum2+"을 곱 값은 "+mulResult+" 입니다");
		
		//Method 매개변수로 Div 호출
		Div div = new Div();
		String divResult= div.division(inputNum1,inputNum2);
		if (div.message=="error") {
			System.out.println("잘못 입력하셨습니다.");
		}else {
		System.out.println(inputNum1+"과 "+inputNum2+"을 나눈 값은 "+divResult+" 입니다");
		}
	}

}
