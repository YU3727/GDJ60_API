package com.pooh.api2.date;

import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

public class UUIDMain {
//230111 4교시 UUID
	public static void main(String[] args) {
		
		String name = UUID.randomUUID().toString();
		System.out.println(name);
		
		//패턴이 없는 완전한 난수를 만드는 법
		//1. UUID를 만들거나
		//2. 랜덤을 만들때 매개변수 long seed를 시간으로 준다(매개변수도 계속 바뀌게끔)
		Calendar calendar = Calendar.getInstance();
		name = calendar.getTimeInMillis()+"abc";
		Random random = new Random(calendar.getTimeInMillis());
	}
}
