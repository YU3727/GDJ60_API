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
//230113 2~6교시 지옥의 예제시작
	public static void main(String[] args) {

		ServerController scon = new ServerController();
		scon.start();
				
		
	} //메인메서드 끝

} //메인클래스 끝
