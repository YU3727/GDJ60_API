package com.pooh.api4.network.ex.servers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerMain {
//230113 2교시 지옥의 예제시작
	public static void main(String[] args) {
		
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
			socket = ss.accept(); //socket에 client가 접속했는지 확인
			
			//
			ServerController scon = new ServerController();
			scon.start();
			
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
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

		
	} //메인메서드 끝

} //메인클래스 끝
