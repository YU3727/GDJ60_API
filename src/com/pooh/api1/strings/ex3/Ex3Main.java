package com.pooh.api1.strings.ex3;

public class Ex3Main {
//230106 Library(API) 에제 - 4교시 5교시
	public static void main(String[] args) {
		System.out.println("Start");
		
		//6교시 컨트롤러 만들어서 제어
		//WeatherController클래스 변수 wc를 만듦. 객체주소가 또 필요한 경우 변수선언을 통해 객체를 만들어야한다.
		WeatherController wc = new WeatherController(); //프로그램 실행때마다 객체를 생성
		
		//한번만 쓰고 더 작동할 필요가 없을때 - 위와 아래는 결과값은 같지만, 객체주소를 저장할수 있는가없는가의 차이
		new WeatherController().start(); //객체하나로 계속 start메서드를 호출하는것
		
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
