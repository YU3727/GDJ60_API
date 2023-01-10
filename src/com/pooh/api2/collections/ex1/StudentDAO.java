package com.pooh.api2.collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
//230110 Library(API) 예제 1~3교시
	//원래 여기서 쓰는 개념은 아니지만 한번 써보자
	
	private StringBuffer sb; //getter/setter를 안쓰는건 이 변수는 여기서만 쓰려고
	private Scanner sc;
	
	public StudentDAO () {
		this.sc = new Scanner(System.in);
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-95-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
		
	}
	
	
	//학생정보검색
	public StudentDTO find(ArrayList<StudentDTO> ar) {
		System.out.println("찾을 학생 이름을 입력하세요");
		String name = sc.next();
		
		StudentDTO sdto = null;
		
				

		return sdto;
	}
	
	
	//초기화
	public ArrayList<StudentDTO> init() {
		
		String data = sb.toString(); //StringBuffer타입을 String타입으로
		//System.out.println("1 : "+str); //str 확인용
		
		//1.파싱하기
		//3가지로 데이터가 구분되어 있음. - , 공백. 이를 한가지로 통일시켜주기
		data = data.replace(" ", "-");
		data = data.replace(",", "");
		//System.out.println("2 : "+data); //data 확인
		
		StringTokenizer st = new StringTokenizer(data, "-");
		//System.out.println("토큰수 : "+st.countTokens()); //토큰 확인
		ArrayList<StudentDTO> studentList = new ArrayList();
		
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();

			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			studentList.add(studentDTO);
		}
		return studentList;
	}//init 메서드 끝
	
}//StudentDAO 클래스 끝
