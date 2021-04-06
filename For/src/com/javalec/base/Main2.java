package com.javalec.base;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) { // 작업은 (화살표 오른쪽 아래 방향으로 들어왓다가 나감)
		Scanner scanner =  new Scanner(System.in); //scanner로 사용자의 입력값 받
		int num=0; //scanner의 값을 정수로 받    
		int factorial = 1; // 곱셈이므로 0이 나오면 안되서!
		
		//factorial 값을 구하려면 4의 팩토면 1*2*3*4 므로 
		System.out.print("Input your decimal no. :");
		num = scanner.nextInt();
		
				
		for(int i=1; i<=num; i++){   // -로 할 경우 for(int i=num; i>0 i--)로 하면 
			factorial = factorial * i;
		}
		
		System.out.println(num +"'s factorial value = " + factorial);
		
	}

}
