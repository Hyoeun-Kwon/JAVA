package com.javalec.base;

public class PriceTable {
//Field값만 공유하기 위해 따로 저장한 것 (분류해서 보기 쉬우라고 Menu	와 합치지 않음)
public final static int Rice = 1000; // 원래 이건데! 다른 클래스 들과 공유하기 위해 : static 왜냐: 각 아이들 마다 먹는것이 다르면 값이 달라지므로
//1. 이 변수가 공개 되도 할거냐 -> public / private (공개되야 끌어 쓸 수 있음)
//2. 변수 값은 ~다. int rice = 1000;
//3. 이 변수 공유 될거냐 -> static
//4. 이 변수는 고정 되어야 한다. -> final	
public static final int Bulgogi = 1500;
public static final int Banana = 700;
public static final int Milk = 600;
public static final int Almond = 100;

//Constructor => 는 만들어 주는게 좋음!
public PriceTable() {
	// TODO Auto-generated constructor stub
}


}
