package com.pooh.api2.collections.ex1;

import java.util.ArrayList;

public class Ex1Main {
//230110 Library(API) 예제 1~4교시
	public static void main(String[] args) {
		
		//학생은 이름 번호 국어 영어 수학 총점 평균으로 이루어짐 -> 학생은 이런 데이터로 이루어져 있다.
		//뭐를 만들어야 하는가는 위 문장을 보고 유추해내야함(이거부터 잘 잡아야겠다)
		//1.학생정보초기화
		//2.학생정보전체조회
		//3.학생정보검색조회(이름으로 검색)
		//4.학생정보추가
		//5.학생정보삭제(이름으로 검색)
		//6.프로그램종료
		
		StudentDAO dao = new StudentDAO();
		ArrayList<StudentDTO> ar = dao.init();
		
		dao.addStudent(ar);
		
		
		//
//		StudentDTO studentDTO = dao.findByName(ar);
//		System.out.println(studentDTO.getName());
//		System.out.println(studentDTO.getAvg());
		
		
//		for(int i=0; i<ar.size(); i++) {
//			System.out.println(ar.get(i).getName()); //ar.get(i)는 학생 한명의 데이터 주소를 꺼낸것
//		}
//		
//		//향상된 for문 - for(데이터타입 변수명 : 어디서 꺼낼건지)
//		//단점 : index 번호가 필요할때 쓰기가 힘듬
//		for(StudentDTO studentDTO: ar) {
//			
//		}
//		int [] nums = new int[3];
//		for(int n : nums) {
//			
//		}
		
	}

}
