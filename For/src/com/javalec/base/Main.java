package com.javalec.base;

public class Main {

	public static void main(String[] args) {
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);

		
//		for( int i=1; i<=10; i++) {
//			System.out.println(i);			위의 긴 구문을 반복문 하나로 정리 할 수 있다.
//		}
		
		//1부터 10까지 합계 구하기       -->부터가 들어가면 반복문
//		tot= tot+1
//		tot=tot+2                : 반복문 안 쓰려면
		
		//반복문 사용시 1부터 10 합계 구하
//		int tot = 0; //누적 변수   1+2하여 둔값에 + 3 하고, 1+2+3 한 값에 4 더하고 , 하다보니 1+2 한값, 1+2+3 한값... 이 계속 필요 : 이를 누적 변수하고 함
//		for (int i=1; i<=10; i++) {
//			tot= tot + i;
//		}
//		System.out.println("1부터 10까지의 합은 " + tot + "입니다.");
		
		//Exercise, 1부터 100까지의 수 중 짝수의 합을 구하시오 (단, if문 사용)
		
		int num = 0;  //초기 값을 꼭 0 줘야함 
		for (int i=1; i<=100; i++) {
			if (i % 2 == 0) {
				num = num + i;
			}
		}
		System.out.println(num);
		
		
		// 짝수의 합과 홀수의 합을 구하여라
		int even =0;  //짝수 누적 변수
		int odd =0; //홀수 누적 변수       ----> int totEven=0, totOdd=0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				even += i;
			}else
				odd +=i;
		}
		System.out.println("짝수의 합은 " + even + "이고 홀수의 합은 " + odd + "이다." );
		
		
		//1	부터 100까지의  수 중 짝수의 합 구하기 (단, if문 사용하지 말기)
		int totEven = 0;
		for(int i=2; i<=100; i+=2) {
			totEven = totEven +i; 
		}
		System.out.println(totEven);
		
		
	}

}
