package com.pooh.api1.strings;

import java.util.Scanner;

public class StringEx2 {
//230106 2교시 Library(API) 에제
	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg", "jpeg", "gif", "png"};
		
		System.out.println("파일명을 입력하세요");
		String fileName = sc.next();  //soe.iuhfo.jpg 이런 느낌
		
		//이미지면 ok, 아니면 정상적인 파일이 아닙니다. 라고 출력하기
		
		//생각정리
		//1. 입력받은 파일명중에 names에 있는거랑 비교.
		//2. 입력받은 파일명을 뒤에서부터 검색. 조건은 .의 위치 + .뒤에서부터 문자열 땡겨오기
		//3. 있는거랑 비교, 이미지면 ok 아니면 정상적인 파일이 아니라고 출력
		
//		필요한 정보값이 나오는지 확인하기
//		int n = fileName.lastIndexOf(".");
//		System.out.println(n);		
//		System.out.println(modFile); // 확장자 추출은 됐음
		
		//파일명 배열의 데이터니까 for문 돌리고, if로 비교
		//for문의 결과값은 check가 false거나 true거나
		boolean check = false;
		String modFile = fileName.substring(fileName.lastIndexOf(".")+1);
		for(int i=0; i<names.length; i++) {
			if(modFile.equals(names[i])) {
				System.out.println("정상 파일입니다");
				check = true;
				break;
			}
		}
		//결과값 출력하기 - 결과값을 for문에서 출력하면 계속나옴
		if(!check) {
			System.out.println("비정상 파일입니다");
		}
		System.out.println("Finish");
	}
}
