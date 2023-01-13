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
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cilent2_T {
//230113 2교시 Network 예제 강사님풀이
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Socket socket = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		boolean check = true;
		
		try {
			socket = new Socket("localhost", 8282);
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			
			while(check) {
				System.out.println("1.점심 2.저녁 3.종료");
				int select = sc.nextInt();
				bw.write(select+"\r\n");
				bw.flush();
				if(select == 3) {
					System.out.println("프로그램 종료");
					break;
				}
				
				String menu = br.readLine();
				System.out.println("오늘 메뉴는 : "+menu);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}