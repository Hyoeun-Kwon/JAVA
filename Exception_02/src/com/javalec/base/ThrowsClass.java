package com.javalec.base;

public class ThrowsClass {

	
	
	
	
	//Constructor
	public ThrowsClass() {
		doC();    // doC라는 메로드를 호출 할 거임
		// constructor	를 잘 쓰면 간단해짐.
	}
	
	
	private void doA() {
		System.out.println("doA");
		int[] arr = {1,2,3,4};
		System.out.println(arr[4]); // 지금은 당연히 에러 걸림 왜? arr	배열에는 0~3까지만 있는데, 4찍으라고 해서 
		System.out.println("endA");
	}
	
	
	private void doB() {
		System.out.println("doB");
		try {
			doA();
			
		}catch(Exception e) {
			System.out.println("Excaption은 여기서");
			System.out.println(e.getMessage());
		}
		System.out.println("endB");
	}
	
	
	
	private void doC() {
		System.out.println("doC");
		doB(); // 호출할거야 ->두비를 만들어 줘야겟다.
		System.out.println("endC");
	}
	
	// constructor 에 doC를 호출했는데! 그 안에 doB를 호출하래! 그럼 B를 만둠.->b로 갔더니 a를 호출하래! -> a를 만들어. 근데 a 실행도중에 에러 걸리면 메세지가 나오게 하자
	// a로 갔더니 배열이 있는데 배열 수가 안맞아서 에러나! -> b로가서 메세지 나옴. 메세지 나오고 나면? end B 	나오래. 그다음 마지막에 남은 enC나옴
	
	
}//끝
