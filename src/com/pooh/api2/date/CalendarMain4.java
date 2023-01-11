package com.pooh.api2.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {
//230111 3교시 java.util.Calendar
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		//2023년 1월 11일(이런식으로 표현하고싶다) => format
		//2023, 1, 11 얘네들은 계속 변하는 변수
		
		//java.text의 SimpleDateFormat을 사용하기 위해
		SimpleDateFormat sd = new SimpleDateFormat();
		//이 simpledatepattern은 ("~") 이런식으로 꾸며줄 것
		sd.applyPattern("yyyy년 MM월 dd일 E");
		String p = sd.format(ca.getTime()); //getTime : Calendar type을 Date type으로 바꿔줌
		                                    //format을 자동완성 해보면 :(콜론)뒤에 String이 있는데 이게 리턴타입
		
		System.out.println(p);
		
	}

}
