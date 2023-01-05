package com.pooh.api1.strings;

public class StringStudy {
//230105 6교시 Library(API)
	public static void main(String[] args) {
		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		//결과값 : java.lang.String$CaseInsensitiveComparator@3d012ddd
		//이게 무슨 의미인지 알필요는 없다. 그러나 사용할 줄은 알아야 한다 > Library를 해석할 줄 알아야함
		//최소 선언하고 호출하는거는 할줄 알아야함
		
		String str = new String("abc");
		String str2 = "abc"; //String타입은 많이 쓰기때문에 primitive type처럼 대입하게 해줌.
		                     //이것도 객체가 만들어진거다.
		System.out.println(str2); //String클래스에서 toString()을 오버라이딩했다.
	}

}
