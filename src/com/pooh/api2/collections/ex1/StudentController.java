package com.pooh.api2.collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
//230110 Library(API) 예제 5교시
	
	//controller는 DAO와 view에 대해 의존적이다.(없으면 완성할수 없으니)
	//클래스를 사용하려면 멤버변수로 선언하거나 상속이 필요하다.
	//의존적이므로 클래스내에 멤버변수를 선언. 이 두가지를 구분하는것은 is has로
	private Scanner sc;
	//여기까지가 의존성(Dependency)
	private StudentDAO studentDAO;
	private StudentView studentView;
	private ArrayList<StudentDTO> ar;
	
	public StudentController() {
		this.sc = new Scanner(System.in);
		//여기가 주입(Injection)
		studentDAO = new StudentDAO();
		studentView = new StudentView();
	} //의존성과 주입 두가지를 합쳐서 의존성 주입, DI(Dependency Injetion)이라고 한다.
	
	
	//DAO와 View의 연결
	public void start() {
		boolean check = true;
		
		while(check) {
			//1.학생정보초기화
			//2.학생정보전체조회
			//3.학생정보검색조회(이름으로 검색)
			//4.학생정보추가
			//5.학생정보삭제(이름으로 검색)
			//6.학생정보백업(java.io.File을 이용)
			//7.프로그램종료
			System.out.println("작업을 선택해주세요");
			System.out.println("1.학생정보초기화  2.학생전체조회  3.학생검색조회  4.학생정보추가  5.학생정보삭제  6.학생정보백업  7.프로그램종료");
			int select = sc.nextInt();
			
			switch(select) {
			default:
				System.out.println("1~6번중 선택해주세요");
				break;
			case 1: 
				System.out.println("1.학생정보를 초기화합니다");
				ar = studentDAO.init(); //리턴으로 학생정보들의 모음인 arraylist가 나오므로 어딘가에 저장해야함.
				break;
			case 2:
				System.out.println("2.학생정보를 전체조회합니다");
				studentView.view(ar);
				break;
			case 3:
				System.out.println("3.학생정보를 검색조회합니다");
				StudentDTO studentDTO = studentDAO.findByName(ar);
				if(studentDTO != null) {
					studentView.view(studentDTO);
				}else {
					studentView.view("찾는 학생이 없습니다");
				}
				break;
			case 4:
				System.out.println("4.학생정보를 추가합니다");
				studentDAO.addStudent(ar);
				break;
			case 5:
				System.out.println("5.학생정보를 삭제합니다");
				select = studentDAO.removeStudent(ar);
				if(select == 1) {
					studentView.view("삭제 성공");
				}else {
					studentView.view("삭제 실패");
				}
				break;
			case 6:
				System.out.println("6.학생정보를 백업합니다");
				studentDAO.backup(ar);
				break;
			case 7:
				System.out.println("7.프로그램을 종료합니다");
				check = false;
			}
		}
		
	}
	
}
