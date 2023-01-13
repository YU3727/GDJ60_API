package com.pooh.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Random;

public class Server2_T {
//230113 1교시 Network 예제 강사님 풀이
	public static void main(String[] args) {
		
		String [] lunch = {"점심1", "점심2", "점심3", "점심4", "점심5"};
		String [] dinner = {"저녁1", "저녁2", "저녁3", "저녁4", "저녁5"};
		boolean check = true;
		
		//서버에서 클라이언트가 접속할 수 있게끔 준비
		ServerSocket ss = null;
		Socket socket = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		
		try {
			ss = new ServerSocket(8282);
			socket = ss.accept(); //.accept() : 접속한 클라이언트의 정보로 new Socket()해서 리턴해줌.
			//패킷 구조를 보면 Server는 new Socket을 할 필요가 없음
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			while(check) {			
				String data = br.readLine();
				int select = Integer.parseInt(data);
				
				Calendar ca = Calendar.getInstance();
				Random random = new Random(ca.getTimeInMillis());
				
//				int select = 1; //확인용
				String menu = null;
				
				switch (select) {
				case 1:
					select = random.nextInt(100)%5;
					menu = lunch[select];
					break;
				case 2:
					select = random.nextInt(100)%5;
					menu = dinner[select];
					break;
				default: //
					System.out.println("서버프로그램을 종료합니다");
					check = false;
					
				}
				System.out.println(menu);
				
				if(check) { //bufferedwrite에 메뉴이름 보내기
					bw.write(menu+"\r\n");
					bw.flush();
				}
				
			} //while문
			
			
			
		} catch (Exception e) { //catch에 exception을 편하게 쓰고싶으면 Exception으로 바꾸자.
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	} //메인메서드

} //클래스
