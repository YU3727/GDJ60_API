package com.pooh.api2.collections.ex1;

import java.util.ArrayList;

public class StudentView {
//230110 Library(API) 예제 5교시
	
	//받은 문자열 출력
	public void view(String msg) {
		System.out.println(msg);
	}
	
	
	//학생 여러명 출력
	public void view (ArrayList<StudentDTO> ar) {
		
		for(StudentDTO studentDTO:ar) {
			this.view(studentDTO); //자기자신을 여러번출력 오버라이딩
		}
	}
	
	
	//학생 한명 출력
	public void view (StudentDTO studentDTO) {
		
		System.out.println("이름 : "+studentDTO.getName());
		System.out.println("번호 : "+studentDTO.getNum());
		System.out.println("국어점수 : "+studentDTO.getKor());
		System.out.println("영어점수 : "+studentDTO.getEng());
		System.out.println("수학점수 : "+studentDTO.getMath());
		System.out.println("총점 : "+studentDTO.getTotal());
		System.out.println("평균 : "+studentDTO.getAvg());
	}
	
}
