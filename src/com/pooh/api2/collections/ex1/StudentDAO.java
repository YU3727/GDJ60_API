package com.pooh.api2.collections.ex1;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
//230110 Library(API) 예제 1~5교시
	//원래 여기서 쓰는 개념은 아니지만 한번 써보자
	
	private StringBuffer sb; //getter/setter를 안쓰는건 이 변수는 여기서만 쓰려고
	private Scanner sc; //멤버변수로 선언
	
	
	public StudentDAO () {
		this.sc = new Scanner(System.in); //scanner를 생서앚에서 선언하면, 이 클래스 내부에서 모두 사용가능 / this 생략가능
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-95-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
		
	}
	
	
	//학생정보백업
	public void backup (ArrayList<StudentDTO> ar) {
		File file = new File("C:\\fileTest", "student.txt");
		
		try {
			FileWriter fw = new FileWriter(file);
//			fw.append(ar.toString()+"\r\n"); //확인용. 일단 이건 됨	
			fw.append("이름-번호-국어-영어-수학\r\n");
			for(StudentDTO studentDTO : ar) {
				fw.append(studentDTO.getName()+"-"+studentDTO.getNum()+"-"+studentDTO.getKor()+"-"+
			studentDTO.getEng()+"-"+studentDTO.getMath()+"\r\n");
			}
			fw.flush();	
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	//학생정보삭제 - 학생들이 있어야 검색해서 지울 수 있다. 학생의 정보는 여기에 없으므로 매개변수를 쓰자
	public int removeStudent (ArrayList<StudentDTO> ar) {
		//삭제 확인용 변수 : 0이면 삭제 실패, 1이면 삭제 성공(내 임의대로 해도 됨)
		int result = 0;
		
		System.out.println("삭제할 이름 입력");
		String name = sc.next();
		
		//같은지 안같은지 비교해야하기 때문에 검색... - findByName 메서드와 유사 1. 2. 선택해서 하기
		//1. index 번호를 쓰는경우 : ar.remove(index n)
//		for(int i=0; i<ar.size(); i++) {
//			if(name.equals(ar.get(i).getName())) {
//				ar.remove(i); //찾은 i번쨰 index를 지우자
//				result = 1;
//				break;
//			}
//		}
		
		//2. object를 지우겠다 : ar.remove(object)
		for(StudentDTO studentDTO:ar) {
			if(name.equals(studentDTO.getName())) {
				ar.remove(studentDTO); //꺼낸 DTO(주솔)를 지워주겠다
				result = 1;
				break;
			}
		}
		return result; //0이면 못지움, 1이면 지웠다고 판단
	}
	
	
	//학생정보주기 - 어디서 정보를 받아와야한다. >> 매개변수로 정보를 받아와야한다.
	public void addStudent(ArrayList<StudentDTO> ar) {
		//학생 한명 만들기
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("이름을 입력하세요");
		studentDTO.setName(sc.next());
		System.out.println("번호를 입력하세요");
		studentDTO.setNum(Integer.parseInt(sc.next()));
		System.out.println("국어 점수를 입력하세요");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어 점수를 입력하세요");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학 점수를 입력하세요");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3.0);
		
		ar.add(studentDTO); //arrayList에 만든 DTO를 넣어놓자
		//return은 해줘도 되고 안해줘도 된다. - ArrayList는 새 객체를 만들지 않기 때문에 주소값이 변하지 않는다.
		//주소값이 변하지 않은 상태에서 heap영역의 ar에 학생데이터가 하나 추가되기만 하기때문에 리턴하지 않아도 된다.
	}
	
	
	//학생정보검색 - 어디서 정보를 받아와야한다. >> 매개변수로 정보를 받아와야한다.
	public StudentDTO findByName (ArrayList<StudentDTO> ar) {
		System.out.println("검색할 이름을 입력하세요");
		String name = sc.next();
		
		StudentDTO st = null; //찾으면 데이터 보내주고, 못찾으면 null을 보내주기 위함
		
		//이름찾기 반복 - ar은 size()를 통해 반복횟수 유추가 가능함
		for(StudentDTO studentDTO : ar) {
			if(name.equals(studentDTO.getName())) { //이름은 중복이 안된다는 가정하에. 같은 이름을 찾으면?
				//이름을 찾는다는건 누군가가 필요하기때문에. > 보내줘야한다
				st = studentDTO;
				break; //향상된 for문은 조건식이 없기때문에 조건식을 false로 만드는 방법으로는 반복문을 종료할 수 없다.
			}
		}
		return st; //st에는 학생 한명의 정보가 담긴 주소값이 들어있다.
	}
	
	
	//학생정보초기화
	public ArrayList<StudentDTO> init() {
		//학생의 데이터를 분리했을 때 모여야 학생이 되므로 Tokenizer를 쓰는게 낫다.
		String data = this.sb.toString();
		data = data.replace(" ", "-");
		data = data.replace(",", "");
		
		//System.out.println(data);
		StringTokenizer st = new StringTokenizer(data, "-");
		ArrayList<StudentDTO> ar = new ArrayList<>(); //ar은 호출되었을 때 값을 돌려주어야 하기 때문에 리턴타입이 되야함.

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
