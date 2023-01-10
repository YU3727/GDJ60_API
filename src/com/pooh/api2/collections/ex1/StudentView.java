package com.pooh.api2.collections.ex1;

import java.util.ArrayList;

public class StudentView {
//230110 Library(API) 예제 1~3교시
	
	public StudentView () {}
	
	public void view(ArrayList<StudentDTO> ar) {
		
		for(StudentDTO studentDTO : ar) {
			this.view(studentDTO);		
		}
	}//view 메서드 끝
	
		
	public void view (StudentDTO studentDTO) {
		System.out.println("이름 : "+studentDTO.getName());
		System.out.println("번호 : "+studentDTO.getNum());
		System.out.println("국어점수 : "+studentDTO.getKor());
		System.out.println("영어점수 : "+studentDTO.getEng());
		System.out.println("수학점수 : "+studentDTO.getMath());
		System.out.println("총점 : "+studentDTO.getTotal());
		System.out.println("평균 : "+studentDTO.getAvg());	
	}//view 메서드 끝
	
}//StudentView 클래스 끝
