package com.javalec.base; // pakage는 안만들어도 되지만 만들어야 하는 이유 나중에 알려줌

import java.util.Scanner;


public class Main { // pakage 별로 class를 만들 수 있음 : 우리팀은 pakage를 어떻게 하자 해서 따로 만들어야 함

	public static void main(String[] args) {
		// 작업 순서 인식 한번에 하는거 아니고 되나 확인 후 넘어가고 넘어가고
		
		//for(int i=1; i<=9; i++) {    // i를 index라고 함 (반복되는 요인)
			//System.out.println(i);     // 어 되네? 
			//System.out.println("5 X "+ i + " = " + (5*i)); // 아 이런 모양으로 출력 가능하구나? 그럼 5단만 말고 사람들이 입력한 값들을 받아서 나오게 하자
	   //}
//			Scanner scanner = new Scanner(System.in);
//			
//			System.out.println("단을 입력하세요 :"); // 라고 써두면 사람들이 숫자를 입력하겠지, 그리고 그 입력된 숫자를 컴터가 가져오겠지
//			int dan = scanner.nextInt(); // 그 숫자를 정수로 받자, 그리구 컴터가 받은 정수를 내가 또 dan으로 받아서 쓰자
//			
//			for(int i=1; i<=9; i++) {
//				System.out.println(dan + " X " + i + " = " + String.format("%2d",(dan*i)));// 다 하고, 100의 자리 10의 자리 등을 맞추고 싶어! 할때 String 씀
//			}  // d는 10진수라는 뜻! 여기에 6X1 = 06 , 006 이렇게 나오고 싶으면 "%02d", "%03d" 이런식으로 바꾸면 됨!  
//			scanner.close();
			
			//코딩은?? 안에서부터 하고, 확장하는 거임! 1. 착한사용자 2. 악한사용자
			// 나는 시작~ 하면 2단에서 9단이 쭉 나왓으면 좋겠어
			// 어 그럼 2~ 4단 처럼 2단 입력, 4단 입력하면 그 부분만 나오게 하자
			
			Scanner scanner = new Scanner(System.in);
			int temp =0; //시작과 끝값을 바꾸려면, 일단 시작으로 입력한 값을 저장해둘 장소가 필요
			System.out.println("구구단 시작 단을 입력하세요 :" );
			int stdan = scanner.nextInt();
			System.out.println("구구단 끝 단을 입력하세요 :");
			int endan = scanner .nextInt();
			
			
			//다른 check 방법 (안부터 넓게 가고 있기 때문에 이게 순서가 늦음)
			//시작과 끝을 자동으로 변환
//			temp = stdan; //temp로 시작값을 저장해둠 :3단논법
//			stdan = endan;
//			endan = temp;
			
			if(stdan > endan) {  // 선택사항2 : 메세지 말고 아예 내가 바꿔서 값을 나오게 하기
			temp = stdan; 
			stdan = endan;
			endan = temp;
			}	
			
			for(int dan=stdan; dan<=endan; dan++) {
				System.out.println("<-- " + dan + " 단-->");
				//System.out.println(dan);
				if(dan%2==0) {
				for(int i=2; i<=9; i+=2) {
					
					System.out.println(dan + " X " + i + " = " + String.format("%2d",(dan*i)));
				    }
				}else {
				for(int i=1; i<=9; i+=2) {
					System.out.println(dan + " X " + i + " = " + String.format("%2d",(dan*i)));
					
				}
				
					
				}
				System.out.println("-------------------------"); // 다 나왔으니 나는 구분을 하고 싶어!	
			}
				
			
			
			
			scanner.close();
			
			
			//사용자의 입력 정보 Check (끝단을 크게 안하는 사용자들을 위해 (선택사항) -- 메세지 주기
//			if(stdan > endan) {
//				System.out.println("입력 정보를 확인하세요");
//			}else {
//				for(int dan=stdan; dan<=endan; dan++) {
//					System.out.println("<-- " + dan + " 단-->");
//					//System.out.println(dan);
//					for(int i=1; i<=9; i++) {
//						System.out.println(dan + " X " + i + " = " + String.format("%2d",(dan*i)));
//					}
//					System.out.println("-------------------------"); // 다 나왔으니 나는 구분을 하고 싶어!	
//				}
//				
//			}
//			
//			
//			scanner.close();
			
			
	}

}
