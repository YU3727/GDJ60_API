package com.pooh.api1.strings.ex3;

public class WeatherView {
//230106 Library(API) 예제 - 5교시 출력부 만들기
	
	//2개의 메서드 생성
	
	//기본생성자
	public WeatherView () {
	}
	
	//1.모든 날씨의 정보를 출력 -> WeatherDTO [] 일단 void로 리턴
	void view (WeatherDTO [] weathers) { //매개변수에는 들어올값이 있는 클래스를 참조변수로
		
		//배열 출력을 해야하니까 for문을 돌려야 할거...
		for(int i=0; i<weathers.length; i++) {
			WeatherDTO wdto = weathers[i];
			this.view(wdto);
		}
		
	}
	
	//2.DTO 하나의 정보를 출력 -> WeatherDTO
	public void view(WeatherDTO weatherDTO) {
		System.out.println("===============");
		System.out.println("City : "+weatherDTO.getCity());
		System.out.println("Temp : "+weatherDTO.getTemp());
		System.out.println("Status : "+weatherDTO.getStatus());
		System.out.println("Dust : "+weatherDTO.getDust());
	
	}
	
	
	
	
	
	
	
}
