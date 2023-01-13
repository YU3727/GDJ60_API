package com.pooh.api4.network.ex.T_servers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
//230113 network 7교시 풀이
	
	//초기화
	public ArrayList<StudentDTO> init() throws Exception{
		ArrayList<StudentDTO> ar = new ArrayList<>(); //학생들을 담을 collector
		File file = new File("C:\\fileTest", "1673485567633.txt");
				
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		boolean check = true;
		
		while(check) {
			String s = br.readLine();
			if(s == null) {
				break;
			}
			StringTokenizer st = new StringTokenizer(s, "-");
			StudentDTO sdto = new StudentDTO();
			sdto.setName(st.nextToken());
			sdto.setNum(Integer.parseInt(st.nextToken()));
			sdto.setKor(Integer.parseInt(st.nextToken()));
			sdto.setEng(Integer.parseInt(st.nextToken()));
			sdto.setMath(Integer.parseInt(st.nextToken()));
			sdto.setTotal(sdto.getKor()+sdto.getEng()+sdto.getMath());
			sdto.setAvg(sdto.getTotal()/3.0);
			
			ar.add(sdto);
		} //while 끝
		
		return ar; //학생들의 정보를 가져가
	} //init 끝
	
	
	//list의 내용물을 하나의 String으로 만들어주는 메서드
	public String makeList (ArrayList<StudentDTO> ar) {
		String result = "";
		StringBuffer sb = new StringBuffer(); //계속 문자열을 더해야 하니까 스트링버퍼 만듦
		
		for(StudentDTO sdto : ar) {
			sb.append(sdto.getName());
			sb.append("-");
			sb.append(sdto.getNum());
			sb.append("-");
			sb.append(sdto.getKor());
			sb.append("-");
			sb.append(sdto.getEng());
			sb.append("-");
			sb.append(sdto.getMath());
			sb.append("-");
			sb.append(sdto.getTotal());
			sb.append("-");
			sb.append(sdto.getAvg());
			sb.append("-");
		}
		result = sb.toString();
		result = result.substring(0, result.length());
		
		return result;
	}
	
}
