package com.pooh.api3.exception;

public class ExceptionMain2 {
//230111 6교시 사용자 정의 예외 클래스
	public static void main(String[] args) {
		
		ExceptionSample1 e1 = new ExceptionSample1();
		ExceptionSample2 e2 = new ExceptionSample2();
		
		try {
			e1.ex2();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
//		try {
//		e1.ex1();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
	}

}
