package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 1부터 100까지의 합을 구하기
//		int tot = 0;
//		for(int i=1; i<=100; i++) {
//			tot+=1;
//		}
//		System.out.println(tot);
		
		// 1부터 100까지의 합을 구하기 while(범위 없음)
//		int tot=0;
//		int i =1;
//		while(i<=100) {    //물어보는것: i가 100보다 작냐
//			tot+=i;
//			i++;  // 이게 없으면 i가 1이므로 하나더하는걸 무한 반복할거임 , 그래서 1씩 더해줘야 100까지 가고 멈출거임!
//		}
		
		
		//break 문
//		int tot =0;
//		int i =1;
//		
//		while(true) {
//			tot+=i;
//			i++;
//			if(i>100) {
//				break;
//			}
//		}
//		System.out.println(tot);
		
		int i =1;
		while (true) { //while에 조건을 줄 수 있으나 보통은 이런식으로 많이 씀
			if (i%2==1) {
				System.out.println(i);
			}else {
				continue;  //continue는 아래 있는걸 안함!! 그러니 1(i)가 증가 하지 않음
			}
			i++;
			if(i>10 ) {
				break;
			}
		}
		
		
	}

}
