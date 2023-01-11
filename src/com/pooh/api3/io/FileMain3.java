package com.pooh.api3.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileMain3 {
//230111 7교시 java.io.File 파일의 내용 읽어오기(프로그램 입장에서는 정보를 받아들이기)
	public static void main(String[] args) {
		
		File file = new File("C:\\fileTest", "Test.txt");
		
		
		//파일의 내용 읽어오기
		try {
			//파일 읽는데 필요한 클래스, 보조스트림
			FileReader fr = new FileReader(file);
			//보조스트림
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String name = br.readLine(); //한줄(\n을 만날때 까지) 읽고 리턴
				if(name==null) {
					break;
				}
				System.out.println(name);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
