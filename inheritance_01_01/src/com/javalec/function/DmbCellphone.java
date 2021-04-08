package com.javalec.function;


public class DmbCellphone extends CellPhone {
	
	//Field
	
	public int channel; // 안주면 0값이 들어감.
	
	
	
	//Constructor
	public DmbCellphone() {       // 쓸 수도 있기 때문에 기본 컨스트럭터는 만들어 주는게 좋다.
		// TODO Auto-generated constructor stub
	}

	// 기러 만드는 이유는? 편하려고! (고정값을 주는 것임)
	public DmbCellphone(String model, String color, int channel) { // parents에 있는 field값을 가져오는거쥬!	
		this.model = model;
		this.color = color;
		this.channel = channel;  //미리 해놔야 method에서 변수를 계속 받을 필요가 없음!
	}
	
	
	//Method
	//채널 송신 시작
	public void turnOnDmb() {  
		System.out.println("채널 "+ channel + "번 DMB방송 수신을 시작 합니다.");
	}
	//채널 바꾸기
	public void changeChannelDmb(int channel) {  // 바로 위에서 받은 체널을 받아서 바꿔주자!
//		channel = channel; // 원래 같음.
		this.channel=channel;//this 는 나의 필드값들에게 정보를 주는것
		System.out.println("채널 " + channel + "번으로 바꿉니다.");		
	}
	//방송 수신 종료
	public void turnOffDmb() {
		System.out.println("DM방송을  수신을 멈춥니다.");
	}
	
	
	
}
