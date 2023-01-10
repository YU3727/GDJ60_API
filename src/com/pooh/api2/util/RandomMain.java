package com.pooh.api2.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class RandomMain {
//230110 java.util. List, Map, Set을 활용할 수 있는 예제 8교시
	public static void main(String[] args) {
		
		//로또 구매 1~45
		//중복을 해결하면서 1~45 뽑기 6회 수행하기
		//1번째 숫자 비교횟수 0, 2번째 : 1번, 3번째 : 2번, 4번째 : 3번, 5번째 : 4번, 6번째 : 5번(다른방법도 ok)
		Random random = new Random();
		HashSet<Integer> set = new HashSet<>();
		boolean check = true;
		int num;
		int idx = 0;
		
		//반복문으로 1~45숫자를 집어넣음, set은 중복허용이 안되므로 넣고, set.size()를 6으로 세팅
		while(check) {
			num = random.nextInt(45)+1;
			set.add(num);
			if(set.size() == 6) {
				check = false;
			}
		}
		
		//반복문으로 set의 값을 꺼내는 방법
		Iterator<Integer> is = set.iterator();
		while(is.hasNext()) { //다음값이 있는가?
			idx = idx + 1;
			num = is.next(); //다음거 주세요
			System.out.println(idx+"번째 숫자 : "+num);

		}
		
//		//랜덤숫자넣기 - map 시도 흔적
//		HashMap<Integer, Integer> map = new HashMap<>();
//		Integer key;
//		Integer value;
//		for(int i=0; i<6; i++) {
//			int num = random.nextInt(45)+1; //0~44까지 나오는데 1~45까지 나오게
//			set.add(num);
//			map.put(i, num);
//			if(map.get(i) == set.) {
//				i--;		
//			}
//		}
//		
//		//반복문으로 map의 값을 꺼내는 방법
//		Iterator<Integer> it = map.keySet().iterator(); // Key -> Set + .iterator();
//		//이제 반복문을 돌릴 수 있음
//		while(it.hasNext()) { //it가 다음값을 가지고 있는가? t/f
//			key = it.next();
//			value = map.get(key);
//			System.out.println(key+"번째 숫자 : "+value);
//		}
		
	} //메인메서드 끝

}
