package com.pooh.api2.date;

import java.util.Calendar;

public class CalendarMain2 {
//230111 2교시 java.util.Calendar
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		Calendar birth = Calendar.getInstance();
		
		Calendar sample = Calendar.getInstance();
		
		//내 생년월일 넣기
		birth.set(1991, 11, 16);		
		
		sample.set(Calendar.MINUTE, sample.get(Calendar.MINUTE)+1);
			
		
		//날짜 계산을 할때는 숫자형태로 바꿔서 써야한다.
		//현재 시간을 밀리세컨즈(1/1000초) 단위로 변환
		long n = now.getTimeInMillis();
		long s = sample.getTimeInMillis();
		
		n = s-n;	
		n = n/(1000*60*60*24); //환산을 원할때 곱하는 인자 : 초*분*시*날짜 
		
		//내 태어난날부터 몇시간이 지났을까?
		long b = birth.getTimeInMillis();
		n = n-b;
		n = n/(1000*60*60);


		System.out.println("n : "+n);
		System.out.println("s : "+s);
		System.out.println(now.getTime());
		
		System.out.println(birth.getTime());
	}

}
