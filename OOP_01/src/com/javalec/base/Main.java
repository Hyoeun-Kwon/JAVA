package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 1~10까지의 합을 구하여 출력하고, 그 합이 짝수인지 홀수 인지 판...
		
		int sum=0; //누적변수는 꼭 초기값 줘야함
		
		
		//합계 구해주기 (1구문)
	
		for(int i=1; i<=10; i++) {   
			sum+=i;
		}
		
		System.out.println("1~10까지의 합은 :"+sum+"입니다.");	

		
		//짝/ 홀 판단 (2구문)
		if(sum%2==0) {                    
			System.out.println("짝수입니다.");		
		}System.out.println("홀수입니다.");
		
		
		// 사용자가 요구하는 범위가 계속 달라지므로, 각 구문을 어딘가에 저장해두고 불러 쓰면 좋겠다.
		// 해서 나온게,OOP
		
		
		
		
		
		
		
		
	}

}
