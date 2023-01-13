package com.pooh.api4.network.ex.testclient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) {
		
		
		//상대방의 서버로 연결하는 것 : socket
		Socket socket = null; //Exception이 발생할 여지가 있기 때문에 선언부터 함
		//메시지 보내는 부분
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		//메시지 받는 부분
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		//연결반복을 위한 확인
		String msg = "";
		
		
		try {
			//객체 생성시 서버 접속 시도
			socket = new Socket("localhost", 8282);
			//127.0.0.1이나 "localhost"를 입력하면 내 pc로 접속된다. / port는 0~65535중에 하나 고른다
			System.out.println("Server에 접속 성공");
			System.out.println("채팅을 종료하시려면 q를 눌러주세요");
			
			//채팅반복을 위한 반복문
			while(true) {
				//연결 작업 - 메시지 보내기
				//0과1을 처리하는 빨대
				os = socket.getOutputStream(); //소켓에서부터 0과1을 처리하는 빨대를 얻어오는 것.
				//char를 처리하는 빨대
				ow = new OutputStreamWriter(os);
				//String을 처리하는 빨대, hello라는 메시지를 보내고싶음
				bw = new BufferedWriter(ow);
				System.out.println("서버로 보낼 메시지를 입력하세요");
				msg = sc.nextLine();
				//Client측에서 연결을 종료한 경우
				if(msg.toUpperCase().equals("Q")){
					System.out.println("Client의 요청으로 연결을 종료합니다");
					break;
				}
				
				//\r\n과 .flush는 한세트로 생각
				bw.write(msg+"\r\n"); //String을 0과1로 바꿔서 socket으로 보냄.
				bw.flush();
				
				
				//연결 작업 - 메시지 받기
				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				msg = br.readLine();
				//Server측에서 연결을 종료한 경우
				if(msg == null){
					System.out.println("Server의 요청으로 연결을 종료합니다");
					break;
				}
				System.out.println("Server : "+msg);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try { // 끊을때는 연결된 역순으로(bw랑 br의 순서는 상관없다)
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
