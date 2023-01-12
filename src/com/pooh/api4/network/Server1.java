package com.pooh.api4.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
//230112 4교시 Network
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		Socket sc = null;
		
		try {
			ss = new ServerSocket(8282); //port num
			System.out.println("Client 접속을 기다리는중");
			//기다리고 있다가 Client가 접속하면 socket을 통해 통신한다
			//서버는 Client와 1:1 통신할 socket을 만들어야 함.
			sc = ss.accept();
			System.out.println("Client와 연결 성공");
			//서버부터 실행하고 그 후 클라이언트.
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
