package com.javalec.base;

import com.javalec.function.SumEvenOdd2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1, j=10;
//		
//		SumEvenOdd sumEvenOdd = new SumEvenOdd(); //왜 new : 복제본을 만드는 것!sumEvenOdd 는 Object임 new	뒤는 생성자임.
//		int sum = sumEvenOdd.sumCalc(i, j); // function쪽에 있는 거 불러와서! sum으로 받는 것!
//		
//		String chk = sumEvenOdd.evenOdd(sum); //String으로, evenOdd해서 짝,홀 구하는거 만들어와!
//		
//		System.out.println(i+ " ~ " + j + " 의 합은 "+ sum + "입니다.");
//		System.out.println(chk + " 입니다.");
		
		
		SumEvenOdd2 sumEvenOdd2 = new SumEvenOdd2();
		sumEvenOdd2.sumCalc(i,j); // object를 통해 method를 부르기.
		sumEvenOdd2.evenOdd();
		
		
		
		
	}

}

