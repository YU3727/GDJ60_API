package com.pooh.api4.network.ex.servers;

import java.util.ArrayList;

public class ServerController {
//230113 2교시 예제
	
	StudentDAO sdao;
	ArrayList<StudentDTO> ar;
	
	public ServerController() {
		this.sdao = new StudentDAO();
		this.ar = new ArrayList<>();
	} //생성자 끝
	
	
	//컨트롤러 메인 실행창
	public void start() {
		
		//1번 초기화
		ar = sdao.init();
		
		for(StudentDTO sdto : ar) {
		System.out.println(sdto.getName());
		System.out.println(sdto.getNum());
		System.out.println(sdto.getKor());
		System.out.println(sdto.getEng());
		System.out.println(sdto.getMath());
		System.out.println(sdto.getTotal());
		System.out.println(sdto.getAvg());
		}
		
		
		
	} //start 메서드 끝
	
} //서버컨트롤러 클래스 끝
