package com.javalec.base;

public class FirstSon {

	

	//Field
	
	//Constructor
	public FirstSon() {
		// TODO Auto-generated constructor stub
	}

	//Method 1 : 초코파이 먹기
	public void takeChoco() {
//--------------------------------------------		
//		MamaBag mamaBag = new MamaBag();
//		mamaBag.choco = mamaBag.choco -1;
//---------변수 공유를 위해 지움------------ (위에 꺼 처럼 하면 그냥 클라스가 각자 생성 되기 때문에, 변수를 1로 가져옴. ----
		
		
		MamaBag.choco = MamaBag.choco -1;  // MamaBag의 변수가 공유 됨!! 
		if(MamaBag.choco < 0) {     // mamaBag -> MamaBag 으로 변화 되야 해 ! ( 클래스를 불러야 하기 때문)
			System.out.println("첫째는 초코파이 먹고 싶어요!");
		}else {
			System.out.println("첫째는 맛있게 먹었어요~");
		}
			
	}// Method takeChoco
	
	
	
	
	//Method 2 : 캔디 먹기

	
	
}//end
