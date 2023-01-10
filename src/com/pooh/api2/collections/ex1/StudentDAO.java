package com.pooh.api2.collections.ex1;

public class StudentDAO {
//230110 Library(API) java.util Package 1교시
	//원래 여기서 쓰는 개념은 아니지만 한번 써보자
	
	private StringBuffer sb; //getter/setter를 안쓰는건 이 변수는 여기서만 쓰려고
	
	public StudentDAO () {
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-95-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
		
	}
	
	
	
}
