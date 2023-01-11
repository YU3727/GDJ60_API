package com.pooh.api3.io;

import java.io.File;

public class FileMain1 {
//230111 6, 7교시 java.io.File, 파일객체
	public static void main(String[] args) {
		
		//1. file 클래스
		//HDD에 파일과 폴더의 정보를 담으려고하는 클래스
		//*있든없든 상관없다. 있으면 있는정보, 없으면 없다는정보를 담고있음.
		File file = new File("C:\\"); //root directory
		
		System.out.println(file.isDirectory()); //폴더입니까?
		System.out.println(file.isFile());
		System.out.println(file.length());
		System.out.println(file.exists()); //위 경로의 파일이 존재합니까
		
		//폴더만들기
		file.mkdir(); //상위폴더까지는 다 존재해야함.
		
		if(!file.exists()) { //이런식으로 많이 씀	
			file.mkdirs(); //없는폴더 밑에 없는폴더를 만들려면 mkdirs()를 써야함.
		}
		
		String [] files = file.list();
		for(String name:files) {
			System.out.println(name);
			File f = new File("C:\\", name); //절대경로(root로 시작하는 경로), 파일객체를 잡을때는 절대경로로 해야한다.
			System.out.println(f.isDirectory());
		}
		
		//첨부파일 할때 필요한 기능
		File [] fs = file.listFiles(); // c드라이브 밑에 목록들을 file객체로 끌어와라
		
//		file.delete(); //폴더를 지울때는 폴더 내에 또다른 폴더나 파일이 없어야 한다.
	}

}
