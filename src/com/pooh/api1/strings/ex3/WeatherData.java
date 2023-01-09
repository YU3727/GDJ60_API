package com.pooh.api1.strings.ex3;

import java.util.StringTokenizer;

public class WeatherData {
//230106 4교시 API 예제, 5교시 풀이
//230109 java.util Package 6교시
	private String data;
	
	//날씨정보의 데이터를 저장하려고 한다
	public WeatherData() { //도시명,기온,날씨,미세먼지농도 패턴의 data
		this.data = "Seoul,12,맑음,60,Daegu,68,비,10,"
				+ "Jeju,-56,눈,12,Jeonju,32,흐림,5";
	}
	
	//메서드 명은 init(초기화의 의미)
	//메서드가 하는일은 data에 있는 문자열을 파싱하는 것 -> 기준은","
	//각 데이터를 DTO에 대입. 4개가 만들어져야 하고, 추가하면 추가하는대로 만들어져야 하는데.... 될라나
	//리턴은 1개 가능한데, 데이터타입은 4개가 있음 잘 생각해보고
	//테스트는 메인에서 init를 호출하면 DTO 데이터 받아서 출력....
	
	
	//일단 리턴타입 void로 > 나중에 수정
//	public WeatherDTO [] init() {
//		
//		//1. 파싱하기
//		String [] result = this.data.split(","); //result 배열에 파싱 완료
//		
////		//파싱 확인
////		for(int i=0; i<result.length; i++) {
////			System.out.println(result[i].trim());
////		}
//		
//		//2. 파싱 됐으니 각 데이터 를 분류에 맞게 집어넣기?
//		WeatherDTO [] wethers = new WeatherDTO[result.length/4];
//		for(int i=0; i<result.length/4; i++) {
//			WeatherDTO wdto = new WeatherDTO(); //매번마다 객체를 새로 만들어줘서 새 객체에 새 데이터가 들어가게끔. 객체는 몸통같은 느낌??인가
//			wdto.setCity(result[4*i]);
//			wdto.setTemp(Integer.parseInt(result[4*i+1])); //parseInt를 씀
//			wdto.setStatus(result[4*i+2]);
//			wdto.setDust(Integer.parseInt(result[4*i+3]));
//			wethers[i] = wdto;
//		}
//		return wethers; //wdto 한세트값이 들어있는 배열 wethers
//		
//	}
	
	
	
	//java.util Package stringTokenizer 사용해서 만들어보기
	public WeatherDTO [] init() {
		
		//1. 파싱하기
		StringTokenizer st = new StringTokenizer(this.data, ",");
		
		
		WeatherDTO [] wdtos = new WeatherDTO[st.countTokens()/4];
		int i = 0;
		while(st.hasMoreTokens()) {
			WeatherDTO wdto = new WeatherDTO();
			String t1 = st.nextToken();
			wdto.setCity(t1);
			String t2 = st.nextToken();
			wdto.setTemp(Integer.parseInt(t2));
			wdto.setStatus(st.nextToken());
			wdto.setDust(Integer.parseInt(st.nextToken()));
			wdtos[i] = wdto;
			i++;
		}
		return wdtos;	
	}
	
	
}
