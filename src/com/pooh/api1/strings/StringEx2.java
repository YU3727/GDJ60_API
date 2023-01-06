package com.pooh.api1.strings;

import java.util.Scanner;

public class StringEx2 {
//230106 1교시 Library(API) 에제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg", "jpeg", "gif", "png"};
		
		System.out.println("파일명을 입력하세요");
		String fileName = sc.next();  //soe.iuhfo.jpg 이런 느낌
		
		//이미지면 ok, 아니면 정상적인 파일이 아닙니다. 라고 출력하기
		
		//생각정리
		//1. 입력받은 파일명중에 names에 있는거랑 비교.
		//2. 입력받은 파일명을 뒤에서부터 검색. 조건은 .의 위치 + .뒤에서부터 문자열 땡겨오기
		//3. 있는거랑 비교, 이미지면 ok 아니면 정상적인 파일이 아니라고 출력
		
//		int n = fileName.lastIndexOf(".");
//		System.out.println(n);
		
		String modFile = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println(modFile); // 확장자 추출은 됐음
		
		//파일명 배열의 데이터니까 for문 돌리고, if로 비교
		boolean check = false;
		for(int i=0; i<names.length; i++) {
			if(fileName.substring(fileName.lastIndexOf(".")+1).equals(names[i]) && !check) {
				if(check) {
					System.out.println("OK");
					check = true;
				}else if(check) {
					System.out.println("정상적인 파일이 아닙니다");
					break;
				}
			}

		}
		
		
	
	}
}
