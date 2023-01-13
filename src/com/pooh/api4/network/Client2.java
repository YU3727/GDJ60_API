package com.pooh.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {
//230112 7~8교시 Network 예제
//230113 1교시 Network 예제 풀이
	public static void main(String[] args) {
		
		//1.서버 접속 시도
		//2.접속 성공시 client에서 출력  > 1.점심, 2.저녁, 3.종료
		//3.Client가 1~3중에서 하나 고르기 3번 고르면 서버도 종료되게끔
		//  1번을 선택하면(서버에 1이 감) 점심 메뉴중 하나를 보내줌, 출력
		//  2번을 선택하면(서버에 2가 감) 저녁 메뉴중 하나를 보내줌, 출력
		//  3번을 선택하면(서버에 3이 감) Client, Server 모두 종료
		
		//생각정리
		
		//소켓준비
		Socket socket = null;
		//출력부
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		//입력부
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		//메시지확인용
		boolean check = true;
		String msg = "";
		int a = 0;
		
		
		try {
			//소켓연결용 객체생성
			socket = new Socket("localhost", 8282); //127.0.0.1이나 "localhost"는 자신의 ip
			System.out.println("Server에 접속 성공");
			
			//메뉴선택 반복문 돌아야함
			while(check) {
				//출력부로 Server로 메시지 보내기
				os = socket.getOutputStream(); //0과1을 내보내기
				ow = new OutputStreamWriter(os); //char를 0과1로 만들기
				bw = new BufferedWriter(ow); //String을 char로
				
				//입력부로 Server로부터 메시지 받기
				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				//선택지를 고름
				System.out.println("작업을 선택해주세요");
				System.out.println("1.점심메뉴 추천  2.저녁메뉴 추천  3.프로그램종료");
				msg = sc.nextLine();
				a = Integer.parseInt(msg);
				if(a == 3) {
					System.out.println("프로그램을 종료합니다");
					break;
				}
				
				//메시지를 Server로 보냄
				bw.write(msg+"\r\n");
				bw.flush();
				
				//Server가 골라준 메뉴 받기
				msg = br.readLine();
//				if(msg == null) {
//					System.out.println("3.프로그램을 종료합니다");
//					break;
//				}
				System.out.println("추천 메뉴는 "+msg+"입니다\n");
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}

}
