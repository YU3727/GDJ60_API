package com.pooh.api2.collections.ex1;

import com.pooh.s4.objects1.ex1.Student;

public class StudentView {
//230110 Library(API) 예제 1~3교시
	
	public StudentView () {}
	
	public void view(StudentDTO [] students) {
		
		for(int i=0; i<students.length; i++) {
			StudentDTO student = students[i];
			this.view(students);
			
	}
	
		
		
		
//		public void view(StudentDTO [] students) {
//			
//			for(int i=0; i<students.length; i++) {
//				StudentDTO student = students[i];
//				this.view(student); //자기자신의 메서드 view에 student인자를 넣음.
//			}	
//		}
//		
//		public void view(Student student) { //이 메서드가 하는 일이 학생의 정보들을 출력.
//			
//			System.out.println("Name : "+student.name);
//			System.out.println("번호 : "+student.num);
//			System.out.println("국어점수 : "+student.kscore);
//			System.out.println("영어점수 : "+student.escore);
//			System.out.println("수학점수 : "+student.mscore);
//			System.out.println("총점 : "+student.total);
//			System.out.println("평균 : "+student.avg);
//			System.out.println("=======================");
//		}
	}
	
	
}
