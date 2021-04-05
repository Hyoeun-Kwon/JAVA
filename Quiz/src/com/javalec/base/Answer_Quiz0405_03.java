package com.javalec.base;

import java.util.Scanner;

public class Answer_Quiz0405_03 {

	public static void main(String[] args) {
		// 쌤의 풀이
		
//		Scanner scanner = new Scanner(System.in);
//		int count = 0,search =0, data=0;
//		int[] number = new int[100]; //100개 인건 중요하지 않음, 나중에 arraylist 배우면 상관없음
//		
//		System.out.print("입력할 숫자의 갯수? : ");
//		count = scanner.nextInt();
//		
//		System.out.println(count+"개의 숫자를 입력하세요!");
//		
//		for (int i=0; i<count; i++) {
//			System.out.print((i+1)+ "의 숫자 :");
//			number[i]=scanner.nextInt();
//		}
//		
//		System.out.print("검색할 숫자는? :");
//		search = scanner.nextInt();
//		
//		for(data= 0; data<count; data++) {  //i가 지역변수 for문 안에서만 돌음. 근데 다른게 필요 그래서 변수 하나 더 설정-> data
//			if(number[data] == search) {
//				System.out.println(search + "의 위치는 " + (data+1)+ "번째 입니다.");
//				break;
//			}//4번째까지면 0~ 4까지 돌음.
//		}
//		if(data==count) {
//		System.out.println(search + "의 위치는 "+ (data+1)+ "번째 입니다."); // 4만 for문에서 나올거임
//		}
		//다른 풀이
		Scanner scanner = new Scanner(System.in);
		int count = 0,search =0;
		int[] number = new int[100]; //100개 인건 중요하지 않음, 나중에 arraylist 배우면 상관없음
		String message = "는 존재하지 않습니다.";
		
		System.out.print("입력할 숫자의 갯수? : ");
		count = scanner.nextInt();
		
		System.out.println(count+"개의 숫자를 입력하세요!");
		
		for (int i=0; i<count; i++) {
			System.out.print((i+1)+ "의 숫자 :");
			number[i]=scanner.nextInt();
		}
		
		System.out.print("검색할 숫자는? :");
		search = scanner.nextInt();
		
		message = search + message; //시작부터 없다고 줌
		
		for(int i= 0; i<count; i++) {  //i가 지역변수 for문 안에서만 돌음. 근데 다른게 필요 그래서 변수 하나 더 설정-> data
			if(number[i] == search) {
				message=(search + "의 위치는 " + (i+1)+ "번째 입니다.");
				break;// 주는게 좋음 : 고객이 100개 입력했는데, 찾는게 2번째에 잇음. 근데 break가 없으면 무조건 100 돌음 2에서 멈추면 되는데
			}
		}
		
		System.out.println(message);
		
		scanner.close();	
		
	}
}
