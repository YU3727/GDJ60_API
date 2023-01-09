package com.pooh.api1.wrappers.ex1;

public class JuminCheck {
//230109 3교시 Library(API) 예제
	
	String jm = ""; // main으로부터 주민번호jm을 받아서 매개변수 pnum에 넣기
	//check1
	//주민등록번호를 받아서 남자인지 여자인지를 출력(리턴x)
	public void check1(String jumin) {
		this.jm = jumin;
		String check = jumin.substring(7, 8);
		int c = Integer.parseInt(check);
		
		if(c == 1 || c == 3) {
			System.out.println("남자");
		}else if(c == 2 || c == 4) {
			System.out.println("여자");
		}else {
			System.out.println("식별 불가능");
		}
	}

	
	//check2
	//주민등록번호를 받아서 나이를 계산(올해-태어난해)해서 출력
	//3~5월생 : 봄 / 6~8월생 : 여름 / 9~11 : 가을 / 12~2 : 겨울
	public void check2(String jumin) {
		this.jm = jumin;
		
		//나이 계산
		String y = jm.substring(0, 2); //연도 2자리 빼오는거
		String check = jm.substring(7, 8);
		
		//세기 설정
		int year = 1900;
		if(check.equals("3") || check.equals("4")) {
			year = 2000;
		}
		year = year + Integer.parseInt(y); //1900년대인가 2000년대인가 구분후 계산
		int age = 2023 - year + 1; //나이 계산
		System.out.println("Age : "+age);
		
		//태어난 월로 계절 계산
		String m = jm.substring(2, 4);
		int month = Integer.parseInt(m); //계절 계산을 쉽게하기 위해 문자열m을 숫자month로 바꿈
		//System.out.println(month); //생월 식별 체크
		if(month<=2 || month==12) {
			System.out.println("겨울생");
		}else if(month>=3 && month<=5) {
			System.out.println("봄생");
		}else if(month>=6 && month<=8) {
			System.out.println("여름생");
		}else if(month>=9 && month<=11) {
			System.out.println("가을생");
		}else {
			System.out.println("태어난 달 식별불가");
		}
	}
}
