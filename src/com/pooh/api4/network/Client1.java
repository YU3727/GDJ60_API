package com.pooh.api4.network;

import java.net.Socket;

public class Client1 {
//230112 4교시 Network
	public static void main(String[] args) {
		
		//상대방의 서버로 연결하는 것 : socket
		Socket socket = null; //Exception이 발생할 여지가 있기 때문에 선언부터 함
		
		try {
			//객체 생성시 서버 접속 시도
			socket = new Socket("192.168.1.123", 60);
			//127.0.0.1이나 "localhost"를 입력하면 내 pc로 접속된다. / port는 0~65535중에 하나 고른다
			System.out.println("Server와 접속 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
