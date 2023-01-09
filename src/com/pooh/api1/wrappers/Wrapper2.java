package com.pooh.api1.wrappers;

public class Wrapper2 {
//230109 2교시 Library(API) wrapper클래스의 의미
	public static void main(String[] args) {
		
		int num = 10;
		
		//Auto Boxing(primitive type -> reference type)
		//Integer num2 = new Integer(); //원래는 이런 형태
		Integer num2 = num;
		
		
		//Auto Unboxing(reference type -> primitive type)
		//객체를 벗겨내고 그 안에 데이터를 primitive type으로 집어넣는것
		//num = num2.intValue();
		num = num2;
	}

}
