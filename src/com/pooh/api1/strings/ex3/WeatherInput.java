package com.pooh.api1.strings.ex3;

import java.util.Scanner;

public class WeatherInput {
//230106 Library(API) 예제 - 5교시, 6교시
	
	//search
	//weather 배열을 받고, 키보드로 부터 검색할 도시명을 입력받기.
	//도시명이 같은지 비교해야하는데, 검색할 때 대소문자 상관없이 일치하게 만들기.(upper~)
	//찾은 DTO 리턴, 없으면 null 리턴
	public WeatherDTO search (WeatherDTO [] wdtos) {
		//도시 객체를 만들고(비교대상) > 도시의 설계는 WeatherDTO임.
		WeatherDTO wd = new WeatherDTO(); //설계도로 객체 만듦, 도시의 정보가 들어있는게 wd
		wd = null; //일치하는 자료가 없을땐 wd에 null값을 리턴해주기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으시는 도시명을 입력해주세요");
		String cityName = sc.next().toUpperCase(); //도시명은 대문자로 치환됨
		
		//일치하는 도시 찾고 리턴해주기, 없으면 null
		for(int i=0; i<wdtos.length; i++) {
			//문자열 비교는 ==로 할 수 없음 equals메서드를 쓸 것)
			if(cityName.equals(wdtos[i].getCity().toUpperCase())) {
				wd = wdtos[i];
			}
		}
		return wd; //WeatherDTO 데이터 리턴
	}
	
	
	//add메서드
	//배열을 받고, 키보드로 정보를 입력받아서(도시명 기온 상태 미세먼지농도) 배열에 추가하고 배열을 리턴 확인 > 2번누르기
	public WeatherDTO [] add (WeatherDTO [] wdtos) {

		Scanner sc = new Scanner(System.in);
		//정보들을 넣어줄 wd 객체 하나 만들고
		WeatherDTO wd = new WeatherDTO();
		
		//배열객체 만들고, 배열 한칸 늘리기(매개변수 배열보다 한칸 더 긴 배열을 만들어야한다)
		WeatherDTO [] mod = new WeatherDTO[wdtos.length+1];
		
		//정보 입력받기
		System.out.println("도시 이름을 입력해주세요");
		wd.setCity(sc.next());
		System.out.println("기온을 입력해주세요");
		wd.setTemp(sc.next());
		System.out.println("날씨상태를 입력해주세요");
		wd.setStatus(sc.next());
		
		
		
		
		
		return wdtos;
	}
	
	
	
	//remove
	//기존 배열에서 배열을 받고, 키보드로 삭제할 도시명을 입력 받음
	//배열에서 삭제하고 배열을 리턴.(추가로 삭제할때 검색이 안되도 상관없다 하시는데 무슨말씀이시지)
	
}
