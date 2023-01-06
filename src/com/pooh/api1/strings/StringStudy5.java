package com.pooh.api1.strings;

public class StringStudy5 {
//230106 3교시 java.lang.String split메서드
	public static void main(String[] args) {
		
		String str = "apple# Apple, aPPle# appLe";
		str = str.replace(",", "#");
		//str3 = str3.replace(" ", "");
		String [] result = str.split("#");
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i].trim().toUpperCase());
		}

		//1 - 기준으로 문자열 분리
		String str1 = "991214-1234567";
		String [] result1 = str1.split("-"); //-를 기준으로 문자열을 분리
		
		//확인용 출력
		for(int i=0; i<result1.length; i++) {
			System.out.println(result1[i]);
		}
		
		//2 공백기준으로 문자열 분리
		String str2 = "1.2 3.4 5.6 60";
		String [] result2 = str2.split(" ");
		
		for(int i=0; i<result2.length; i++) {
			System.out.println(result2[i]);
		}
		
		//3 #과 ,를 기준으로 나누고 싶다.... > #이나 ,를 통일해준다. replace로
		//분리 작업 하기 전에 데이터를 이쁘게 만들어 놔야함(전처리 작업)
		String str3 = "1.2# 3.4, 5.2# 60";
		str3 = str3.replace(",", "#");
		//str3 = str3.replace(" ", "");
		String [] result3 = str3.split("#");
		
		for(int i=0; i<result3.length; i++) {
			System.out.println(result3[i].trim()); //trim()은 문자열 앞뒤의 공백을 제거해줌
		}
		
		
	}
}
