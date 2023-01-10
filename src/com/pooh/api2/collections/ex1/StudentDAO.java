package com.pooh.api2.collections.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
//230110 Library(API) 예제 1교시
	//원래 여기서 쓰는 개념은 아니지만 한번 써보자
	
	private StringBuffer sb; //getter/setter를 안쓰는건 이 변수는 여기서만 쓰려고
	
	public StudentDAO () {
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-95-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
		
	}
	
	//초기화
	public void init() {
		
		String str = sb.toString(); //StringBuffer타입을 String타입으로
		System.out.println("1 : "+str); //str 확인용
		
		//1.파싱하기
		//3가지로 데이터가 구분되어 있음. - , 공백. 이를 한가지로 통일시켜주기
		str = str.replace("-", ",");
		str = str.replace(" ", "");
		System.out.println("2 : "+str); //str 확인용
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		ArrayList student = new ArrayList();
		
		
		
		
		
		//2.총점평균 계산해서 쓰기
		
	}
	
}
