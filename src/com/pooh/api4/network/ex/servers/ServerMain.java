package com.pooh.api4.network.ex.servers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
		
		//서버에서 클라이언트가 접속할 수 있게끔 준비
		ServerSocket ss = null;
		Socket socket = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		
		//테스트용 구분선
		ServerController scon = new ServerController();
		scon.start();

		
	} //메인메서드 끝

} //메인클래스 끝
