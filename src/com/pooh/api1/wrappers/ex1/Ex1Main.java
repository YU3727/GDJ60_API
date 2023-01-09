package com.pooh.api1.wrappers.ex1;

import java.util.Scanner;

public class Ex1Main {
//230109 Library(API) 예제 3교시, 4교시
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 입력(-포함 입력 필수)"); //ex.991223-1234567
		String jumin = sc.next();
		
		//3교시 예제
//		JuminCheck jc = new JuminCheck();
//		jc.check1(jumin); //check1을 호출하면서 jumin 매개변수를 넣어줌.
//		jc.check2(jumin);
		
		//4교시 예제
		Check2 c2 = new Check2();
		c2.check2(jumin);
	}

}
