package com.pooh.api1.strings;

public class StringStudy2 {
//230105 8교시 Library(API) 예제
	public static void main(String[] args) {
		
		//email 앞의 계정 찾기
		String email = "a@bc@123@gmail.com";
		int idx = email.lastIndexOf('@');
		System.out.println(idx);
		
		System.out.println(email.length());
		
		//한글자씩 출력하기
		for(int i=0; i<email.length(); i++) {
			char ch = email.charAt(i);
			System.out.println(ch);
		}
		
		String str = ""; 
		System.out.println(str.length()); //결과값 : 0
		
		String str2 = null; //얘는 객체를 만들지 않았기 때문에 NullPointerException이 뜬다
//		System.out.println(str2.length()); //결과값 : error
		
		System.out.println("Before Email : "+email);
		email = email.replace("@", "_"); //이전문자 > 새로운문자로 바꿔주는 메서드. 변환된 결과를 return 해주기 때문에, 새로운 변수에 대입해야함.
		System.out.println("After Email : "+email);
	}

}
