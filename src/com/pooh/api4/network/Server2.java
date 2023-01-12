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
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Server2 {
//230112 7~8교시 Network
	public static void main(String[] args) {
		
		//Client 접속 대기
		//1. 점심메뉴 중에서 하나를 랜덤하게 골라주기(메뉴를 세팅해놔야함)
		//2. 저녁메뉴 중에서 하나를 랜덤하게 골라주기(메뉴를 세팅해놔야함)
		//3. 종료
		
		//생각정리
		//1, 2할때 key값 쓰는 map을 쓸 수 있으려나
		
		//소켓준비
		ServerSocket ss = null;
		Socket socket = null;
		//입력부
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		//출력부
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		//확인용
		boolean check = true;
		String msg = "";
		int a = 0;
		
		try {
			ss = new ServerSocket(8282); //8282포트의 서버소켓을 준비
			System.out.println("Client의 접속을 기다리는중");
			socket = ss.accept();           //소켓에 Client가 접속했는지 확인
			System.out.println("Client와 연결 성공");
			
			//메뉴제시 반복문돌리기
			while (check) {
				//입력부로 Client로부터 메시지 받기
				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				msg = br.readLine();
				a = Integer.parseInt(msg); //메시지 식별까지 완료(입력된 메시지를 a에 int로 담아둠)
				//Clinet로부터 대답이 null이면 종료
				if(msg == null) {
					System.out.println("Client의 요청으로 연결을 종료합니다");
					check = false;
					break;
				}
				
				//출력부로 Client로 메시지 주기
				os = socket.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				
				//랜덤용
				Calendar ca = Calendar.getInstance();
				Random random = new Random(ca.getTimeInMillis());
				int idx = random.nextInt(100)%5;
				HashMap<Integer, String> hm;
				
				switch (a) { //a를 조건으로 switch case문 돌리기
					default:
						System.out.println("1~3번중에 선택해주세요"); //확인용
						bw.write("1~3번중에 선택해주세요+\r\n");
						bw.flush();
						break;
					case 1: //1.점심추천
						hm = new HashMap<>();
						hm.put(0, "김밥");
						hm.put(1, "라면");
						hm.put(2, "정식");
						hm.put(3, "덮밥");
						hm.put(4, "비빔밥");
						System.out.println("점심메뉴 : "+hm.get(idx)); //확인용
						bw.write(hm.get(idx)+"\r\n");
						bw.flush();
						break;
					case 2: //2.저녁추천
						hm = new HashMap<>();
						hm.put(0, "스테이크");
						hm.put(1, "파스타");
						hm.put(2, "커리");
						hm.put(3, "간짜장");
						hm.put(4, "김치전");
						System.out.println("저녁메뉴 : "+hm.get(idx)); //확인용
						bw.write(hm.get(idx)+"\r\n");
						bw.flush();
						break;
					case 3: //3.프로그램종료 Client가 3번 선택지를 고르면 종료
						System.out.println("3.프로그램을 종료합니다");
						check = false;
						break;		
				}
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { //자원 연결 종료
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				ss.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
