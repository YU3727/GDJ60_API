package com.pooh.api1.strings;

import java.util.Scanner;

public class StringEx2 {
//230106 1교시 2교시 Library(API) 에제
	public static void main(String[] args) {
		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg", "jpeg", "gif", "png"};
		
		System.out.println("파일명을 입력하세요");
		String fileName = sc.next();  //soe.iuhfo.jpg 이런 느낌
		
		//이미지면 ok, 아니면 정상적인 파일이 아닙니다. 라고 출력하기
		
		//강사님 내용
		//확장자 분리 작업
		int idx = fileName.lastIndexOf(".");
		String result = fileName.substring(idx+1);
//		System.out.println(idx);
//		System.out.println(result);
		
		
		//확장자 검증 작업 - for문이 끝났을 때는 두가지중 하나이다. 정상이 아니거나 정상이거나
		boolean flag = false;
		for(int i=0; i<names.length; i++) {
			if(result.equals(names[i])) {
				System.out.println("정상 파일입니다");
				flag = true;
				i = names.length;
				break;
			}
		}
		
		//결과값 출력 - for문 안에 넣으면 돌때까지 계속 출력이라 따로 빼주자
		if(!flag) {
			System.out.println("비정상파일");
		}
		System.out.println("Finish");
	}
	
}
