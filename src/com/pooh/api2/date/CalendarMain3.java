package com.pooh.api2.date;

import java.util.Calendar;

public class CalendarMain3 {
//230111 3교시 java.util.Calendar
	public static void main(String[] args) {
		//현재 시간
		Calendar ca1 = Calendar.getInstance();
		
		//3일 후 세팅
		Calendar ca2 = Calendar.getInstance();
		
		//3일 후로 날짜를 세팅하고 싶다면?
		//ca2.set(Calendar.DATE, ca1.get(Calendar.DATE)+3);
		//ca2.add(Calendar.DATE, 3); //달이 넘어가지는지 확인, ok
		//ca2.roll(Calendar.DATE, 3); //달이 넘어가지 않음.
		
		long d = 1000*60*60*24*3; // 3일을 ms단위로 표시
		ca2.setTimeInMillis(ca2.getTimeInMillis()+d);
		
		
		
		System.out.println(ca1.getTime());
		System.out.println(ca2.getTime());
		
	}

}
