package com.javalec.base;

import java.util.Scanner;

public class Quiz_14 {

	public static void main(String[] args) {
		// 입금
		// 출금
		// 현황
		// 종료
		//번호를 선택하세요! 1
		//고객번호 :1
		//금액 :100
		//입금결과 : 고객번호 : 1 잔액 : 100
		
		String[] list = {"입금","출금","현황","종료"};
		
		int cusList = 0; // 고객이 선택한 목록 번호
		int cus = 0; // 고객번호 위한 변수
		int money = 0; // 고객이 입력할 금액
		int[] change =new int[5];  // 금액이 저장될 장소 
		
		Scanner scanner = new Scanner(System.in);
		
		// --------입금 ~ 종료 까지 출력되게 하기----
		while(cusList!=4) { //전체 무한 루프 문  // break는 switch에서만 so,while에 조건을 줘야함!
			
			
		for(int i=0; i<list.length; i++) {
			System.out.println((i+1)+"."+list[i]);
		}
		
		//-----선택한 번호 입력받기-----		
		System.out.print("번호를 선택하세요 !");
		cusList=scanner.nextInt();
	//-----------시도했으나, int와 String차이 해결 못함-----	
		//선택한 번호가 입력된 list와 매칭 되기
//		for(int i=0; i<listNum.length; i++) {
//		   if(listNum[i]=cusList) {
//			   listNum[i]
//		   }
//		}
		//----------------------------------------
//		//각 번호 입력시 나올 내용
		switch(cusList) {
			case 1:
				System.out.print("고객번호 :");     //고객번호 입력 받기
				cus=scanner.nextInt();
				System.out.print("금액 :");
				money=scanner.nextInt();
				// 입력받은 내용으로 결과 출력
				change[cus-1]+=money;
				System.out.println("입금 결과 : "+"고객번호 : "+cus+" 잔액 : "+change[cus-1]);
				break;
			case 2:
				System.out.print("고객번호 :");     //고객번호 입력 받기
				cus=scanner.nextInt();
				System.out.print("금액 :");
				money=scanner.nextInt();	//금액 입력 받기
				// 입력받은 내용으로 결과 출력
				if(change[cus-1]<money) {
				System.out.println("잔액이 부족합니다!");
				}else {
					change[cus-1]-=money; //잔액이 저장되게 하기!
				System.out.println("입금 결과 : "+"고객번호 : "+cus+" 잔액 : "+change[cus-1]);
				}
				break;
			case 3:
				System.out.println("\t"+ "고객명" + "\t"+ "잔액");
				System.out.println("\t"+"------"+"\t"+"------");
				for(int i=0; i<5; i++) {
				System.out.println("\t"+(i+1)+"\t"+change[i]+"\n");
				}
				break;
			case 4:
				break;
//	
			}//switch 
		
		}//while의 끝	
				System.out.println(">>>>>> Thank you <<<<<<<");
	}	

}
