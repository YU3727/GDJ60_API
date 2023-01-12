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
import java.util.Scanner;

public class Server1 {
//230112 4~7교시 Network
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		Socket sc = null;
		//메시지 받는 부분
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		//메시지 보내는 부분
		Scanner sca = new Scanner(System.in);
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		//Stream은 출력전용, 입력전용 두개가 필요하다
		//연결반복을 위한 확인
		String msg = "";
		
		
		try {
			ss = new ServerSocket(8282); //port number
			System.out.println("Client 접속을 기다리는중");
			//기다리고 있다가 Client가 접속하면 socket을 통해 통신한다
			//서버는 Client와 1:1 통신할 socket을 만들어야 함.
			sc = ss.accept();
			System.out.println("Client와 연결 성공");
			System.out.println("채팅을 종료하시려면 q를 눌러주세요");
			//서버부터 실행하고 그 후 클라이언트.
			
			//채팅반복을 위한 반복
			while(true) {
			
				//Client에서 메시지를 보내는걸 Server는 받을 준비
				//0과 1을 처리하는 빨대
				is = sc.getInputStream();
				//char를 처리하는 빨대
				ir = new InputStreamReader(is);
				//String을 처리하는 빨대
				br = new BufferedReader(ir);
				
				msg = br.readLine();
				//Client측에서 연결을 종료한 경우(읽어들일 msg값이 없는경우)
				if(msg == null) {
					System.out.println("Client의 요청으로 연결을 종료합니다");
					break;
				}
				System.out.println("Client : "+msg);
				
				
				//다시 Server가 Client에 메시지 보내기
				os = sc.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				
				System.out.println("Client에게 보낼 메시지를 입력하세요");
				msg = sca.nextLine(); //.nextLine()은 \n을 만날때 까지 버퍼에서 읽어옴
				//Server측에서 연결을 종료한 경우
				if(msg.toUpperCase().equals("Q")){
					System.out.println("Server의 요청으로 연결을 종료합니다");
					break;
				}
				
				bw.write(msg+"\r\n");
				bw.flush();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try { //마지막에 소켓의 연결도 끊어주기
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
