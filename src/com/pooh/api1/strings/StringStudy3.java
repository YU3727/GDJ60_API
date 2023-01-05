package com.pooh.api1.strings;

public class StringStudy3 {
//230105 8교시 Library(API) 예제
	public static void main(String[] args) {
		
		String str1 = "hello"; 
		String str2 = "hello";
		String str3 = new String("hello"); //char sequence = 문자열(??)
		String str4 = new String("hello");
		
		//문자열을 비교연산하면 같을때도, 다를때도 있다. > 노트 8교시 참고
		System.out.println(str1==str2); //true, 
		System.out.println(str3==str4); //false, 
		System.out.println(str1==str3); //false, 
		//문자열을 비교할 때는 equals()를 써라. 그럼 값을 비교할 수 있다.
		
		
		str1 = str1+"world"+str1;
		//String 객체에 들어있는 값은 불변이다. 변경하려면 다른 객체를 만들어야함
		//그래서 하나의 문장을 표현하기 위해 최소 +만큼의 객체가 계속 생성된다. 노트 참고
		//객체를 늘리지 않고 더하는 방법은? 다음에
	}

}
