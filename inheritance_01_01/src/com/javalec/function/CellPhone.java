package com.javalec.function;

public class CellPhone { //보통 핸드폰에서 할수 있는 기능

	//Field
	public String model; //안주면 null값이 들어감
	public String color;
	
	//Constructor
	
	public CellPhone() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	//Method -- 핸드폰에 대한 기능들 작성
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) { // 받는 값따라 다르므로, 변수를 준것!
		System.out.println("본인 :" + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방 :" + message); // send와 receive의 변수 message는 지역변수라 다른것!	
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
}
