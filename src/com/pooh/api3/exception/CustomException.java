package com.pooh.api3.exception;

public class CustomException extends Exception {
//230111 6교시 사용자 정의 예외 클래스
	//Exception 클래스를 상속받으면 된다. extends Exception
	
	public CustomException() {
		
	}
	
	
	public CustomException(String message) {
		super(message);
	}
}
