package com.pooh.api4.network.ex.T_servers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class StudentController {
//230113 7교시 network 예제풀이
	
	private ServerSocket ss;
	private Socket socket;
	private StudentDAO sdao;
	
	//서버소켓 만들고 소켓 연결하는거 만들거
	public void start() throws Exception {
		
		ss = new ServerSocket(8282);
		System.out.println("asdasd");
		
		socket = ss.accept();
		sdao = new StudentDAO();
		ArrayList<StudentDTO> ar = sdao.init();
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		boolean check =  true;
		
		while(check) {
			String select = br.readLine(); //선택번호:data의 형태로 보내기로 약속
			String [] s = select.split(":");
			
			switch(s[0]) {
			case "1": //전체정보 보내기
				//1:
				select = sdao.makeList(ar);
				break;
			case "2": //학생검색정보
				//1:iu < s[1]째 데이터
				//select = sdao.findByName(ar, s[1]); //ar데이터 뭉치에서 s[1]을 찾아와달라
				break;
			case "3": //학생추가
				//1:iu-4-50-75-80
				//s[1]도 하나의 문자열 > 파싱
				//select = sdao.addStudent(ar, s[1]); //ar에 집어넣을건데 정보는 s[1]번째에 있음
				break;
			case "4": //학생정보삭제 > 2번과 비슷
				//
				break;
			case "5": //프로그램 종료
				break;
			default:
				check = false;
				if(check) {
					bw.write(select+"\r\n");
					bw.flush();
				
				}
			}
			
		}	
		
	}
}
