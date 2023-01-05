package com.pooh.api1.strings;

import java.util.Scanner;

public class StringStudy {
//230105 6교시 7교시 Library(API)
	public static void main(String[] args) {
		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		//결과값 : java.lang.String$CaseInsensitiveComparator@3d012ddd
		//이게 무슨 의미인지 알필요는 없다. 그러나 사용할 줄은 알아야 한다 > Library를 해석할 줄 알아야함
		//최소 선언하고 호출하는거는 할줄 알아야함
		
		String str = new String("abc");
		String str2 = "abc"; //String타입은 많이 쓰기때문에 primitive type처럼 대입하게 해줌.
		                     //이것도 객체가 만들어진거다.
		System.out.println(str == str2); //String클래스에서 toString()을 오버라이딩했다.
		                                 //얘는 str과 str2의 주소값을 비교하는 것
		
		//문자열의 비교? - object 클래스에서 상속받은 equals메서드가 있음.
		boolean check = str.equals(str2); //문자열이 같냐틀리냐 비교할때는 equals로 하자.
		System.out.println(check);
		
		char ch = str.charAt(1);
		System.out.println("ch : "+str.charAt(2));
		
		//7교시
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0); //sc.next()의 문자열에서 첫번쨰 글자(index 0)만 가져오기
		
		//indexOf
		int num = str2.indexOf(100);
		System.out.println(num);
	}

}
