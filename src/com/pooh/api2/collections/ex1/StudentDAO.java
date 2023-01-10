package com.pooh.api2.collections.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
//230110 Library(API) 예제 1~3교시
	//원래 여기서 쓰는 개념은 아니지만 한번 써보자
	
	private StringBuffer sb; //getter/setter를 안쓰는건 이 변수는 여기서만 쓰려고
	
	public StudentDAO () {
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-95-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
		
	}
	
	//초기화
	public void init() {
		
		String data = sb.toString(); //StringBuffer타입을 String타입으로
		//System.out.println("1 : "+str); //str 확인용
		
		//1.파싱하기
		//3가지로 데이터가 구분되어 있음. - , 공백. 이를 한가지로 통일시켜주기
		data = data.replace(" ", "-");
		data = data.replace(",", "");
		//System.out.println("2 : "+data); //data 확인
		
		StringTokenizer st = new StringTokenizer(data, "-");
		//System.out.println("토큰수 : "+st.countTokens()); //토큰 확인
		ArrayList<StudentDTO> studentList = new ArrayList();
		
		for(int i=0; i<st.countTokens(); i++) {
			StudentDTO studentDTO = new StudentDTO();
			
			String name = st.nextToken();
			studentDTO.setName(name);
			
			int num = Integer.parseInt(st.nextToken());
			studentDTO.setNum(num);
			
			int kor = Integer.parseInt(st.nextToken());
			studentDTO.setKor(kor);
			
			int eng = Integer.parseInt(st.nextToken());
			studentDTO.setEng(eng);
			
			int math = Integer.parseInt(st.nextToken());
			studentDTO.setMath(math);
			
			int total = kor + eng + math;
			studentDTO.setTotal(total);
			
			double avg = total/3.0;
			studentDTO.setAvg(avg);
			
			studentList.add(studentDTO);
		}
		
		for(int i=0; i<st.countTokens(); i++) {
			System.out.println(studentList.get(i).getName());
			System.out.println(studentList.get(i).getNum());
			System.out.println(studentList.get(i).getKor());
			System.out.println(studentList.get(i).getEng());
			System.out.println(studentList.get(i).getMath());
		}
		
		
//		ArrayList stuList = new ArrayList();
//		int i = 0;
//		while(st.hasMoreTokens()){
//			stuList.add
//			
//			
//			
//		}
//		
//		stuList.add(str); //체크용
//		System.out.println("ArrayList : "+stuList.get(0));
		
		
		
		
		//이건 아닌거같다;
//		StudentDTO [] sdtos = new StudentDTO[st.countTokens()];
//		for(int i=0; i<st.countTokens(); i++) {
//			StudentDTO sdto = new StudentDTO();
//			String t1 = st.nextToken();
//			sdto.setName(t1);
//			String t2 = st.nextToken();
//			sdto.setNum(Integer.parseInt(t2));;
//			String t3 = st.nextToken();
//			sdto.setKor(Integer.parseInt(t3));
//			String t4 = st.nextToken();
//			sdto.setEng(Integer.parseInt(t4));
//			String t5 = st.nextToken();
//			sdto.setMath(Integer.parseInt(t5));
//			sdto.setTotal(Integer.parseInt(t3)+Integer.parseInt(t4)+Integer.parseInt(t5));
//			sdto.setAvg(Integer.parseInt(t3)+Integer.parseInt(t4)+Integer.parseInt(t5)/3.0);
//			sdtos[i] = sdto;
//			System.out.println(sdtos[i]);
//		}
		
		
		
		
		
		
		
		//2.총점평균 계산해서 쓰기
		
	}
	
}
