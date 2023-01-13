package com.pooh.api4.network.ex.servers;

import java.util.ArrayList;

public class ServerController {
//230113 2교시 예제
	
	StudentDAO sdao;
	ArrayList<StudentDTO> ar;
	int select
	
	public ServerController() {
		this.sdao = new StudentDAO();
		this.ar = new ArrayList<>();
		this.select = 0;
	} //생성자 끝
	
	
	//컨트롤러 메인 실행창
	public void start() {
		
		//실행시 초기화
		ar = sdao.init();
		if(ar != null) {
			System.out.println("초기화 완료");
		}
		
		//1번 전체데이터 출력(보내주기)
		switch (select) {
		default :
		case 1: //전체학성정보 client로 보내주기
			StudentDAO sdao = new StudentDAO();
			ar = sdao.init();
			sdao.studentInfo(ar);
			break;
		case 2:
			break;
		case 3:
			break;
		}
		
		
		
		
	} //start 메서드 끝
	
} //서버컨트롤러 클래스 끝
