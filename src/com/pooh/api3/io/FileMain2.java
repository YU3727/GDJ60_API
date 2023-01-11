package com.pooh.api3.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain2 {
//230111 7교시 java.io.File 파일에 내용 작성하기
	public static void main(String[] args) {
		File file = new File("C:\\fileTest", "test.txt");
		System.out.println(file.exists());
		
		//파일에 내용을 작성
		//파일에 빨때를 꽂아야함.(byte>char>String 이게 힘들기 때문에)
		String name = "suzi";
		try { //입력할떄는 쓸 내용에 +"\r\n"과 .flush()를 세트로 생각하고 쓰자.
			FileWriter fw = new FileWriter(file, true); //boolean append : true로 해야 내용추가 가능. 없으면 덮어씌움
			fw.write(name+"\r\n"); //밀어낸 주사기(버퍼)는 다시 뒤로 당기는 작업이 필요함(\r), 줄바꿈을 위해(\n)
			fw.flush(); //강제로 버퍼 비우기 - 버퍼(주사기)는 가득차야 밀어내는데, 가득차지않으면 버퍼를 밀어내지 않아서 내용이 표시되지 않을수도있음
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
		
	}

}
