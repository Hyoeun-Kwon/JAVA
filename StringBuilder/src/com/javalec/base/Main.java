package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// String의 문제점을 해결하기 위해 나온 문자열 선언자들
		
		//string보다 string builder가 퍼포먼스가 더 좋음
		
		String string = new String("abcedf");
		StringBuilder stringBuilder = new StringBuilder("abcdef");
		stringBuilder.append("hijklmn"); // 뒤에 덧붙이기
		System.out.println(stringBuilder); //string builder는 = 안해도 알아서! 바뀜
		//------추가-----
		stringBuilder.insert(3, "zzz"); //추가
		System.out.println(stringBuilder);
		//-------삭제------
		stringBuilder.delete(3, 6); //삭제
		System.out.println(stringBuilder);
		
		//------------ string buffer (string builder가 더 좋음 (퍼포)
		System.out.println("---------------------------");
		
		StringBuffer stringBuffer = new StringBuffer("abcdef");
		stringBuffer.append("hijklmn"); // 뒤에 덧붙이기
		System.out.println(stringBuffer); //string builder는 = 안해도 알아서! 바뀜
		//------추가-----
		stringBuffer.insert(3, "zzz"); //추가
		System.out.println(stringBuffer);
		//-------삭제------
		stringBuffer.delete(3, 6); //삭제
		System.out.println(stringBuffer);
		
	}

}
