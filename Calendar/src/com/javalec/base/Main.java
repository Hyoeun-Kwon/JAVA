package com.javalec.base;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// Calendar
		
		Calendar calendar = Calendar.getInstance(); // 카렌더는 생성자? new가 필요 없음
		
		int year = calendar.get(Calendar.YEAR); // YEAR는 static 변수 // 다 정수!
		int month = calendar.get(Calendar.MONTH)+1; // month만 특이함! (0부터 시작해서)
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute= calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		System.out.println(year + " : "+ month); // month는 출발이 0! 
		System.out.println("");

	}
}