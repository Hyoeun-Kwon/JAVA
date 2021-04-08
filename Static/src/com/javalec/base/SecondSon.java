package com.javalec.base;

public class SecondSon {

	
	//Field
	
	//Constructor
	public SecondSon() {
		// TODO Auto-generated constructor stub
	}
	//Method
	public void takeChoco() {
		
//		MamaBag mamaBag = new MamaBag();
//		mamaBag.choco = mamaBag.choco -1;
//--------------------------------------------위에 것으로 하면 초코파이는 하나인데, 첫째가 먹고도 둘째가 먹을 수 있게 됨
		
		MamaBag.choco = MamaBag.choco -1;  //MamaBag에서 생긴 변수를 불러와서 ( 그 변수 이름이 choco임)  //Main에서 순서대로 뽑았기 때문에, second son에는 0값으로 들어오고, 0-1 은 -1 임.
											// 즉, -1이 되면 첫째가 먹은거고, 0이면 첫째가 안먹은 것 -> 그래서 0이면 둘째는 맛있게 먹을 수 있고, -1이면 먹을 수 없음!
		if(MamaBag.choco < 0) {
			System.out.println("둘째는 초코파이 먹고 싶어요!");  
		}else {
			System.out.println("둘째는 맛있게 먹었어요~");
		}
			
	} // method : takeChoco
	
	
	
	
}//end
