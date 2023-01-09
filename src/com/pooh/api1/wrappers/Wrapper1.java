package com.pooh.api1.wrappers;

public class Wrapper1 {
//230109 2교시 wrapper
	public static void main(String[] args) {
		
		System.out.println(Integer.BYTES);
		System.out.println(Long.BYTES);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		//Integer.SIZE = 64; // 이런건 안됨. Integer가 final로 선언되어있어 상수취급을 받기 때문
		
		String n1 = "12";
		Integer int1 = new Integer(n1); //곧 나올 버전에서 없어질 메서드이니 쓰지마라는 의미
		
		//문자열을 숫자로 바꿔주는 메서드
		int num1 = Integer.parseInt(n1);
		System.out.println(num1*2);
		
		n1 = "15.323";
		double d1 = Double.parseDouble(n1);
		System.out.println(d1*1.1);
	}

}
