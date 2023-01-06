package com.pooh.api1.strings.ex3;

import java.util.Scanner;

public class WeatherController {
//230106 Library(API) 예제 - 5교시 6교시 만든것들 연결하기
	
	
	//start메서드
	//1.날씨정보초기화 -> init() 실행 "초기화가 완료 되었습니다"
	//2.전국날씨정보 -> 배열의 모든정보를 출력하기
	//3.지역날씨검색 -> input가서 찾음 -> 있으면 DTO값 리턴, 없으면 "도시정보가 없습니다"(null 리턴)
	//4.지역날씨추가 -> input 가서 add 메서드 만듦.
	//5.지역날씨삭제 -> 배열에서 삭제를 하고싶은것. input으로
	//6.종료 -> 끝
	
	
	public void start () {
		
		Scanner sc = new Scanner(System.in);
		boolean check = true; //while문 돌릴 조건
		int select = 0; //선택지 번호
		
		//init메서드를 사용하기 위해 WeatherData클래스의 객체 wd를 생성
		WeatherData wd = new WeatherData();
		
		//view메서드를 사용하기 위해 WeatherView클래스의 객체 wv를 생성
		WeatherView wv = new WeatherView();
		
		//WeatherInput클래스의 객체생성
		WeatherInput wi = new WeatherInput();
		
		//도시를 만들 객체 생성
		WeatherDTO wdto = new WeatherDTO();
		
		//전체 데이터의 출력을 위한 배열을 준비 ??해야하나 일단 보류
		WeatherDTO [] wdtos = new WeatherDTO[4];
		
		//선택문 메서드 실행
		while(check) {
			System.out.println("작업을 선택해주세요");
			System.out.println("1.날씨정보초기화  2.전국날씨정보  3.지역날씨검색  4.지역날씨추가  5.지역날씨삭제  6.종료");
			select = sc.nextInt();
			
			switch(select) {
				default:
					System.out.println("1~6번중에 선택해주세요");
					break;
				case 1: //날씨정보초기화
					System.out.println("날씨정보를 초기화 합니다");
					wdtos = wd.init(); //배열에 초기값 입력
					break;
				case 2: //전국날씨정보
					System.out.println("전국날씨정보를 출력합니다");
					wv.view(wdtos); //날씨배열값 wdtos를 view메서드에 집어넣은걸 보고싶다
					break;
				case 3: //지역날씨검색
					System.out.println("지역날씨를 검색합니다");
					wdto = wi.search(wdtos);
					wv.view(wdto);
					break;
					
					
					
					
					
					
					
					
					
				case 6:
					check = false;
					
				
			
			
			
			}//switch끝
			
		}//while 끝
		
	}//start 메서드 끝
	
}
