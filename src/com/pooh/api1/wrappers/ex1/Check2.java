package com.pooh.api1.wrappers.ex1;

public class Check2 {
//230109 4교시 Library(API) 예제 - 주민번호 검증
	
	//check
	//주민번호를 받아서(980724-1234567)
	//맨 끝자리는 체크용으로 뺌
	//9  8  0  7  2  4 - 1  2  3  4  5  6
	//2  3  4  5  6  7   8  9  2  3  4  5(를 곱해줌)
	//18 24 0 35 12 28   8  18 6  12 20 30(를 모두 더해줌)
	//합이 대충 122, 합을 11로 나누어서 나머지를 구함
	// 122/11 = 몫=11, 나머지=1
	//이 나머지를 11에서 뺀 결과값하고, 체크용번호(맨 마지막자리)와 같은지 확인(ex. 11-1 = 10)
	//만약 11에서 뺀 결과값이 두자리(10, 11)면 다시 10으로 나눈 나머지를 체크용 번호와 같은지 확인.(ex. 10/10, 몫=1, 나머지=0)
	//최종 출력은 정상주민번호입니다. 비정상주민번호입니다. 라고 메시지 표시
	
	String jm = "";
	
	public void check2(String pnum) {
		this.jm = pnum;
		
//		String [] result = jm.split("-");
//		for(int i=0; i<result.length; i++) {
//			System.out.println(result[i].trim());
//		}
//		
//		
		
		String [] arr = new String[14];
		String [] mod = new String[arr.length-1];
		int idx = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = jm.substring(i, i+1);
			System.out.println(arr[i]);
			if(arr[i].equals("-")) {
				continue;
			}
			mod[idx] = arr[i];
			idx++;
			System.out.println(mod[idx]);	
		}
		
		
//		int c = Integer.parseInt(jm.substring(0, 1));
//		System.out.println(c);
		
		
		
		
	} //check2 메서드 끝
}
