package com.javalec.base;


public class Main {

	public static void main(String[] args) {
		//나중에 객체 언어를 팀별로 따로 만들어야 함

//		String str = "Hello";
//		String str1 = new String("Hello");  // 원래 이렇게 적는건데(객체 선언 방식), 쉽게 쓰려고 위에 것으로 씀 (API)
//		
//		Scanner scanner = new Scanner(System.in);// new 뒤는 생성자 :constructor// scanner는object, instant 라고 함
//		//. 뒤에 쓰는것 : method 또는 api라고 함 (scanner.nextInt)
		
		//------------------
		String str1 ="abcdefg";
		String str2 ="HIJKLMN";
		String str3 ="oppqrstu";
		String str4 =" abc def ghi "; //이것의 문제: ex) User ID등 입력시 주의! (띄어쓰기)
		
		
		//---------자주 사용하는 method--------	가능한 이유: String이 객체형이라 가능! 기본형인 int는 불가!
		System.out.println(str1.concat(str2)); // concat ( 컨케네이트) : 문자 연결
		System.out.println(str1.substring(3)); // (0	번부터 시작 )substring :	부분문자열 -> 3번째 부터 빼옴
		System.out.println(str1.substring(3, 5)); // 3~ 5전, 즉 3, 4 나옴
		System.out.println(str1.length()); //글자수 확인
		System.out.println(str1.toUpperCase()); // 대문자로 변경
		System.out.println(str1.toLowerCase()); // 소문자로
		System.out.println(str1.charAt(3)); // index값을 넣으라네, 3번째 글자 하나만 나옴
		
		System.out.println("-------------------"); //구분선 Quiz
		//str1	을 알파벳 하나씩 출력하기
		for(int i=0; i<str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		//------String안에 자주 쓰는 method! ------------
		System.out.println(str1.indexOf('c')); // c의 index값. (int를 string 으로 로 선택! ctrl+space한 다음
		System.out.println(str1.equals(str3)); //t/ f 로 나오겠구나! (동일한지 t/f)
		System.out.println(str4.trim()); // 앞,뒤의 스페이스!(띄어쓰기) 없애줌
		System.out.println(str1.replace('a', 'z')); //글자 틀렷어! : a를 z로 바꾸겠다.
		System.out.println(str1); // 위에서 찍은것 뿐! 위에꺼가= str1	이다 해야 바뀜 
		System.out.println(str1.replaceAll("abc", "ZZZZZZ")); // replace는 charter 단위, all은 string단위
		
		
		
	}

}
