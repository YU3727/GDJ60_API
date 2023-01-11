package com.pooh.api3.exception;

import java.util.Random;

public class ExceptionMain1 {
//230111 4교시 IO, 예외처리
	public static void main(String[] args) {
		
		String num = null;
		Random random = new Random();
		int n = random.nextInt(2);
		if(n==0) {
			num = "test";
		}
		//예외처리
		try {
			int a = 10;
		System.out.println(3/n);
		throw new ArithmeticException(); //명시를 했으니 무조건 발생한다.
		//System.out.println(num.charAt(n));
		//throw new NullPointerException();
		
		//다형성을 이용해서 오류들을 받아줄 수 있다(대부분은 Exception선에서 해결 가능, 가끔 Throwable까지 가야하는 경우도 있음)
		}catch(ArithmeticException e) {
			
		}catch(RuntimeException e) {
			e.printStackTrace();//예외메시지 출력을 하기위함
		}catch(Exception e) {
			System.out.println("예외 발생");
		}catch(Throwable e){
			System.out.println("NullPointerException");
		}
		//System.out.println(a);
		
		System.out.println("종료합니다");
	}
}

