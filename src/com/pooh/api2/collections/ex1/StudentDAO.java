package com.pooh.api2.collections.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

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
	
	//학생정보초기화
	public ArrayList<StudentDTO> init() {
		//학생의 데이터를 분리했을 때 모여야 학생이 되므로 Tokenizer를 쓰는게 낫다.
		String data = this.sb.toString();
		data = data.replace(" ", "-");
		data = data.replace(",", "");
		
		System.out.println(data);
		StringTokenizer st = new StringTokenizer(data, "-");
		ArrayList<StudentDTO> ar = new ArrayList(); //ar은 호출되었을 때 값을 돌려주어야 하기 때문에 리턴타입이 되야함.

		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO(); //여러개의 데이터를 한 studentDTO 객체에 모음
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			
			ar.add(studentDTO);
			//studentDTO 변수는 중괄호가 사라지면 없어지니까.... 이 정보를 저장해둘 무언가가 필요하다
			//이전까진 배열이였지만, 이젠 ArrayList를 쓰면 된다.
			
//			//확인용
//			System.out.println(st.nextToken());
//			System.out.println(st.nextToken());
//			System.out.println(st.nextToken());
//			System.out.println(st.nextToken());
//			System.out.println(st.nextToken());
//			System.out.println("================");
			
		}
			
		return ar;
	}
	
}
