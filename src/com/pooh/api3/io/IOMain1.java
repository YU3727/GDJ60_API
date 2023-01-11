package com.pooh.api3.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain1 {
//230111 4교시 IO
	public static void main(String[] args) {
		
		//1. 키보드 연결
		//표준입력기 : 키보드, 마우스, 스캐너
		//표준출력기 : 모니터
		
		//Scanner의 기본 원리
		//Byte,  0,1을 처리하는 빨대
		InputStream is = System.in;
		
		//char(문자 한글자)를 처리하는 빨대
		InputStreamReader ir = new InputStreamReader(is); //reader라는 추상클래스를 구현하는 구현클래스
		
		//String을 처리하는 빨대
		BufferedReader br = new BufferedReader(ir);
		
		try {
			System.out.println("입력");
			String msg = br.readLine();
			System.out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
