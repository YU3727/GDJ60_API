package com.pooh.api2.collections.ex1;

public class Ex1Main {
//230110 Library(API) 예제 1교시
	public static void main(String[] args) {
		
		//학생은 이름 번호 국어 영어 수학 총점 평균으로 이루어짐 >ArrayList를 쓰자
		//뭐를 만들어야 하는가는 위 문장을 보고 유추해내야함(이거부터 잘 잡아야겠다)
		//1.학생정보초기화
		//2.학생정보전체조회
		//3.학생정보검색조회(이름으로 검색)
		//4.학생정보추가
		//5.학생정보삭제(이름으로 검색)
		//6.프로그램종료
		
		System.out.println("프로그램 시작");
		
		StudentController sc = new StudentController();
		
		sc.start();
		
		System.out.println("프로그램 종료");
	}

}
