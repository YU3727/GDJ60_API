package com.pooh.api1.strings;

public class StringStudy4 {
//230106 1교시 Library(API)
	public static void main(String[] args) {
		
		String str = "StarWars";
		
		String result = str.substring(4);
		
		System.out.println(result);
		
		result = str.substring(4, 6); //4번부터 6번미만의 index 출력
		
		System.out.println(result);
		
		str = "test@naver.com";
		
		result = str.substring(5);
		
		System.out.println(result);
		
		//ID길이가 달라지는걸 감안해서 뒤에 이메일을 잘라내서 출력해보시오
		//int n = str.lastIndexOf("@"); //indexOf를 쓰면 혹시 ID에 @가 있을경우 문제가 됨.
		
		result = str.substring(str.lastIndexOf("@")+1);
		System.out.println(result);
	}

}
