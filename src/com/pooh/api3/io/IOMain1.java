package com.pooh.api3.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOMain1 {
//230111 4교시 IO, 6교시 예외 처리(finally)
	public static void main(String[] args) {
		
		//1. 키보드 연결
		//표준입력기 : 키보드, 마우스, 스캐너
		//표준출력기 : 모니터
		Scanner sc = new Scanner(System.in);
		
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
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { //자원 해제 : 자원은 한정되어 있어서 쓰고나서 꼭 연결을 해제해야한다.(이 헛점을 이용한것이 DDOS공격)
			//연결된 순서의 역순으로 해제해야한다.(byte > char > String으로 연결이면 역순.) 여기서는 br > ir > is 순서
			try {
				br.close();
				ir.close();
				is.close();
				
				sc.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
