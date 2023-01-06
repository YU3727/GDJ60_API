package com.pooh.api1.strings.ex3;

public class Ex3Main {
//230106 Library(API) 에제 - 4교시 5교시
	public static void main(String[] args) {
		System.out.println("Start");
		
		//6교시 컨트롤러 만들어서 제어
		WeatherController wc = new WeatherController();
		wc.start(); //WeatherController 클래스의 start메서드 호출
		
		
		
//		WeatherData 클래스의 init메서드 실행 / 4교시 입력부
//		WeatherData wd = new WeatherData();
//		WeatherDTO [] wdto = wd.init(); //이게 무슨 의미일까??
//		//wd.init();
		
		
//		//임시 출력
//		for(int i=0; i<wdto.length; i++) {
//			System.out.println(wdto[i].getCity());
//			System.out.println(wdto[i].getTemp());
//		}
		
		
//		//5교시 출력부
//		WeatherView wv = new WeatherView();
//		wv.view(wd.init());
		
		
		System.out.println("Finish");
	}

}
