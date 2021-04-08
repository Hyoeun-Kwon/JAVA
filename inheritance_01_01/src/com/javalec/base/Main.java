package com.javalec.base;

import com.javalec.function.DmbCellphone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	//DmbCellPhone의 Instance를 생성.
		
	//DmbCellphone을 가져오기! (Dmb만 가져와도, cellphone을 상속 받은것이기 때문에 다 들어옴		
	DmbCellphone dmbcell = new DmbCellphone("자바폰", "검정", 10); // 여기에 바로 변수 값 넣어주면 되고, string이냐, int 이냐 만 생각해서 넣어주기!
	// : 클래스 이름, 객체 , new ,컨스트럭터 ( 비어있는거 쓸거냐, 데이터를 쓸거냐)
	//컨트롤 스페이스 했을때 c 있는건 : 클래스 , 아니고 초록색인건 컨스트럭
	//매개변수 넣을때 탭이용하면 편하다.
	
	
	
//	//첫번째 생성자 활용 방법 ( 사용해도 되나 복잡해짐)
//	DmbCellphone dmbCellPhone = new DmbCellphone();
//	dmbCellPhone.model = "자바폰";
//	dmbCellPhone.color = "검정";		
//	dmbCellPhone.channel = 10;
	
	
	
	
	
	//test시에는 한줄씩 !! 
	System.out.println("모델 :" + dmbcell.model );
	System.out.println("색상 :"+ dmbcell.color);	
	System.out.println("채널 : "+ dmbcell.channel); // 객체 뒤에 .에는 모든 속성을 불러 올 수 있음!
	
	dmbcell.powerOn();
	dmbcell.bell();
	dmbcell.sendVoice("여보세요");
	dmbcell.receiveVoice("안녕하세요! 저는 홍길동 인데요");
	dmbcell.sendVoice("아! 반갑습니다. 그럼 안녕히~~");
	dmbcell.turnOnDmb();
	dmbcell.changeChannelDmb(12);
	dmbcell.turnOffDmb();
	
	
	
	}

}
