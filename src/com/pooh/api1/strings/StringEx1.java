package com.pooh.api1.strings;

public class StringEx1 {
//230105 7교시 Library(API) 예제
	public static void main(String[] args) {
		
		//
		String phone = "010-1234-5678";
		
		//-가 몇번째 자리에 있는지 찾아달라(몇번 해야할지 모름)
		boolean check = true;
		int idx = 0;
		while(check) {
			
			idx = phone.indexOf('-', idx);
			if(idx != -1) {
				System.out.println("IDX :"+idx);
				idx++;
			}else {
				check = false;
				break;
			}
		}
		
		
		//내가 해본 방식
//		int a = phone.length(); //번호 길이를 먼저 찾음
//		System.out.println(a); //확인용
		
		int [] ar = new int[phone.length()];
		boolean check2 = true;
		
		for(int i=0; i<phone.length(); i++) {
			int num = phone.indexOf("-", i);
			
			if(num != -1) {
				System.out.println(num+"번째 자리");
			}else {
				
			}
		}
	}

}

