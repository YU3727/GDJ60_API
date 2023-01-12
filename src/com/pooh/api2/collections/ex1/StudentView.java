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
		
		System.out.println("Name : "+studentDTO.getName());
		System.out.println("Num : "+studentDTO.getNum());
		System.out.println("Kor : "+studentDTO.getKor());
		System.out.println("Eng : "+studentDTO.getEng());
		System.out.println("Math : "+studentDTO.getMath());
		System.out.println("Total : "+studentDTO.getTotal());
		System.out.println("Avg : "+studentDTO.getAvg());
	}
	
}
