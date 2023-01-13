package com.pooh.api4.network.ex.servers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.print.attribute.Size2DSyntax;

public class StudentDAO {
//230113 2교시 예제
	
	private StringBuffer sb;
	private Scanner sc; //나는 스캐너가 필요할까?
	
	public void StudentDAO() {
		this.sb = new StringBuffer();
		this.sc = new Scanner(System.in);
	}
	
	//초기화 하기 - 외부 파일에서 읽어와서 서버의 ArrayList에 학생정보를 저장해두기
	public ArrayList<StudentDTO> init() {
		long max = 0;
		File file = new File("C:\\fileTest");
		String [] files = file.list(); //file 위치의 파일list를 String 배열인 files에 넣음
		
		//files에 읽어들이기 까지 ok
		for(int i=0; i<files.length; i++) {
			System.out.println(files[i]);
		}
		
		//반복문으로 .txt 잘라내기
		for(String name : files) {
			name = name.substring(0, name.lastIndexOf("."));
			long date = Long.parseLong(name);
			
			if(date > max) {
				max = date;
			}
		}
		
		//정보를 읽어들일 파일객체를 만드는 과정까지 ok
		file = new File("C:\\fileTest", max+".txt");
		
		//파일 객체로 부터 정보를 읽어들여서 파싱하고 ar에 담고싶음
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String data = null;
			
			//파싱 - data가 계속 있을때까지 일단 해야함 > 반복문, 언제까지인지는 data가 있을때 까지이므로 while
			//data에 file > bufferedreader로 읽어들인 값을 넣음.
			while((data = br.readLine()) != null) {
				System.out.println(data); //확인용 : 데이터를 읽어들이기까지는 ok
				StringTokenizer st = new StringTokenizer(data, "-"); //파싱해서 토큰으로 만들기
				
				//정보를 담을 학생객체 생성
				StudentDTO sdto = new StudentDTO();
				sdto.setName(st.nextToken());
				sdto.setNum(Integer.parseInt(st.nextToken()));
				sdto.setKor(Integer.parseInt(st.nextToken()));
				sdto.setEng(Integer.parseInt(st.nextToken()));
				sdto.setMath(Integer.parseInt(st.nextToken()));
				sdto.setTotal(sdto.getKor()+sdto.getEng()+sdto.getMath());
				sdto.setAvg(sdto.getTotal()/3.0);
				
				ar.add(sdto);
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ar;
	} //init 메서드 끝
	
	
	//1. 전체학생정보 출력을 해달라고 할때
	//요청은 msg(String)으로, 내 정보는 sdto(StudentDTO)에서
	public String studentInfo (ArrayList<StudentDTO> sdto) {
		
		//StudentDTO [] students = new StudentDTO[sdto.size()];
		//생각정리
		//학생 배열을 하나 만들고 여기에 ar값의 데이터 하나를 넣고 얘를 string으로 만들어서 리턴해주고 이 리턴값을 컨트롤러에서 write? 어케해야하지
		//Server는 학생데이터값을 보내주기만 해도 됨
		//모든 학생을 하나의 스트링으로 모으기
		
		sb = new StringBuffer();
		String data = null;
		
		//ArrayList에 데이터가 남아있는한 계속 돌아가야함
		
		sb.append(sdto);

		System.out.println(sb.toString());
		
		String s = sb.toString();
		return s;
		
		
		
		
		
	} //1번기능메서드 종료
	
	
	
} //StudentDAO 클래스 끝
