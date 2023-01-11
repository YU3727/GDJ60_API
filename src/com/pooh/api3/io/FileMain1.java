package com.pooh.api3.io;

import java.io.File;

public class FileMain1 {
//230111 6교시 java.io.File
	public static void main(String[] args) {
		
		//1. file 클래스
		//HDD에 파일과 폴더의 정보를 담으려고하는 클래스
		//*있든없든 상관없다. 있으면 있는정보, 없으면 없다는정보를 담고있음.
		File file = new File("C:\\fileTest\\ex3\\t1");
		
		System.out.println(file.isDirectory()); //폴더입니까?
		System.out.println(file.isFile());
		System.out.println(file.length());
		System.out.println(file.exists()); //위 경로의 파일이 존재합니까
		
		//폴더만들기
		file.mkdir(); //상위폴더까지는 다 존재해야함.
		
		if(!file.exists()) { //이런식으로 많이 씀	
			file.mkdirs(); //없는폴더 밑에 없는폴더를 만들려면 mkdirs()를 써야함.
		}
		
	}

}
