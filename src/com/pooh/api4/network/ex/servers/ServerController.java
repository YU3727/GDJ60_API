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

public class ServerController {
//230113 2~6교시 예제
	
	StudentDAO sdao;
	StudentDTO sdto;
	StudentInput si;
	ArrayList<StudentDTO> ar;
	String select;
	boolean check;
	
	ServerSocket ss = null;
	Socket socket = null;
	
	InputStream is = null;
	InputStreamReader ir = null;
	BufferedReader br = null;
	
	OutputStream os = null;
	OutputStreamWriter ow = null;
	BufferedWriter bw = null;
	
	
	public ServerController() {
		this.sdao = new StudentDAO();
		this.sdto = new StudentDTO();
		this.si = new StudentInput();
		this.ar = new ArrayList<>();
		check = true;
		
		//실행시 초기화
		ar = sdao.init();
		if(ar != null) {
			System.out.println("초기화 완료");
		}
	} //생성자 끝
	
	
	//컨트롤러 메인 실행창
	public void start() {
		
		
		try {
			System.out.println("Client의 연결을 기다립니다...");
			ss = new ServerSocket(8282);
			socket = ss.accept(); //socket에 client가 접속했는지 확인
			System.out.println("Client와 연결 성공");
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			while(check) {
				select = br.readLine(); //선택번호:data의 형태로 보내기로 약속
				String [] s = select.split("@"); //원하는 명령번호@ 데이터
				
				//1번 전체데이터 출력(보내주기)
				switch (s[0]) {
				case "1": //전체학성정보 client로 보내주기
					StudentDAO sdao = new StudentDAO();
					select = sdao.studentInfo(ar);
					System.out.println(select);
					System.out.println("전체학생 정보를 보냅니다.");
					check = false;
					break;
				case "2":
					StudentDTO sdto = new StudentDTO();
					//s[1]에 들어있는 데이터 iu-1-50-60-70를 파싱해서 이름비교, 있으면 데이터 리턴, 없으면 찾는학생이 없음 리턴
					
					break;
				case "3":
					break;
				case "4":
					break;
				case "5":
					break;
				default :
					bw.write(select+"\r\n");
					bw.flush();
					
				}	
			} //while 끝
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
//				bw.close();
//				ow.close();
//				os.close();
//				br.close();
//				ir.close();
//				is.close();
//				ss.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} //try ~ catch, finally 끝
		
	} //start 메서드 끝
	
} //서버컨트롤러 클래스 끝
