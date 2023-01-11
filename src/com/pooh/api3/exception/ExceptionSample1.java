package com.pooh.api3.exception;

import java.util.Random;

public class ExceptionSample1 {
//230111 5교시 예외처리 try~catch, throws, 6교시 사용자 정의 예외 클래스
	
	public void ex2() throws Exception{
		//2자리만 읽을 수 있는 거
		int num1 = 65;
		int num2 = 48;
		
		
		//예외가 발생할만한 건덕지가 하나도 없음. > 사용자 정의 예외클래스를 사용하자
		int sum = num2 - num1;
		if(sum<0) {
			throw new CustomException("음수는 읽을 수 없어요");
		}
		
		//int sum = num1 + num2;
		if(sum>99) {
			throw new CustomException("세자리수는 읽을 수 없어요");
		}
		
	}
	
	
	public void ex1() throws ArithmeticException, NullPointerException, Exception{
		//직접 처리하지 않고 예외가 발생한 객체를 호출한 곳으로 던져버리겠다는 의미, 즉 예외가 발생한 객체를 리턴하므로 호출한곳에서 try~catch 해야함
		//이런 예외는 되도록이면 throws를 사용한다.(협업 때문에), 최종 처리를 해야한다면 try ~ catch를 해준다.
		Random random = new Random();
		int num = random.nextInt(2);
		
		num = 10/num;
		
		System.out.println(num);
	}
}
