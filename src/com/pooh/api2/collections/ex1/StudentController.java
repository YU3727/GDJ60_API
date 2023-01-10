package com.pooh.api2.collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
//230110 Library(API) 예제 1~3교시
	
	public StudentController () {
	}
	
	//학생은 이름 번호 국어 영어 수학 총점 평균으로 이루어짐 >ArrayList를 쓰자
	//뭐를 만들어야 하는가는 위 문장을 보고 유추해내야함(이거부터 잘 잡아야겠다)
	//1.학생정보초기화
	//2.학생정보전체조회
	//3.학생정보검색조회(이름으로 검색)
	//4.학생정보추가
	//5.학생정보삭제(이름으로 검색)
	//6.프로그램종료
	
	//프로그램 구동 메서드
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<StudentDTO> ar = new ArrayList<>();
		StudentController scon = new StudentController();
		StudentDTO sdto = new StudentDTO();
		StudentDAO sdao = new StudentDAO();
		StudentView sv = new StudentView();
		boolean check = true;
		int select = 0;
		
		while(check) {
			System.out.println("작업을 선택해주세요");
			System.out.println("1.학생정보초기화  2.학생전체조회  3.학생검색조회  4.학생정보추가  5.학생정보삭제  6.프로그램종료");
			select = sc.nextInt();
			
			switch(select) {
				default :
					System.out.println("1~6번중에 선택해주세요");
					break;
				case 1:
					System.out.println("학생정보를 초기화합니다");
					ar = sdao.init();
					break;
				case 2:
					System.out.println("학생정보를 전체조회합니다");
					sv.view(ar);
					break;
				case 3:
					System.out.println("학생정보를 조회합니다");
					break;
				case 4:
					System.out.println("학생정보를 추가합니다");
					break;
				case 5:
					System.out.println("학생정보를 삭제합니다");
					break;
				case 6:
					System.out.println("프로그램을 종료합니다");
					check = false;
				
			}//switch case 끝나는 곳
			
		}//while 끝나는 곳
		
	}//start 메서드 끝나는 곳
	
}//클래스 끝나는 곳
