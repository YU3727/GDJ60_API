package com.pooh.api2.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain1 {
//230111 2교시 java.util.Calendar
	public static void main(String[] args) {
		//GregorianCalender 는 Calender를 상속받음. > Calender 클래스 내의 메서드들을 오버라이딩 할 수 있다.
		Calendar ca = new GregorianCalendar();
		
		//Calendar의 객체를 주로 생성하는법 - 추상클래스라 일반적인 방법으로 객체를 만들 수 없다
		//현재날짜와 시간으로 객체가 만들어짐
		ca = Calendar.getInstance();
		System.out.println(ca);
		
		//집어넣는것도 가능하다. .set(int field, int value)
		ca.set(Calendar.YEAR, 2032);
		ca.set(Calendar.MONTH, 11); //12월을 세팅하고싶으면 0~11로 세기 떄문에 11을 넣어야한다.
		
		//꺼내오기
		//year를 꺼내오기
		int year = ca.get(Calendar.YEAR); //get(int변수), Calendar에 있는 변수들은 대부분 클래스변수. 즉, 클래스명.변수명으로 사용
		
		//month 꺼내오기 -> 월은 범위가 (0~11)이다. (1~12)가 아님. > 0부터 세기 때문에 1월이 0으로 표기된다;
		int month = ca.get(Calendar.MONTH);
		
		//일 꺼내오기
		int date = ca.get(Calendar.DATE);
		
		//날짜 꺼내오기 -> (일월화수목금토) Java에서는 1이 일요일, DB에서는 0이 일요일
		int day = ca.get(Calendar.DAY_OF_WEEK);
		
		//시간 꺼내오기
		int hour = ca.get(Calendar.HOUR); //HOUR_OF_DAY는 24시간 표기법
		
		//분 꺼내오기
		int minute = ca.get(Calendar.MINUTE);
		
		//초 꺼내오기
		int second = ca.get(Calendar.SECOND);
		
		System.out.println("Year : "+year);
		System.out.println("Month : "+(month+1));
		System.out.println("Date : "+date);
		System.out.println("Day : "+day);
		System.out.println("Hour : "+hour);
		System.out.println("Minute : "+minute);
		System.out.println("Second : "+second);
	}

}
