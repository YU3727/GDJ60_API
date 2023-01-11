package com.pooh.api2.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class RandomMain {
//230110 8교시 java.util. List, Map, Set을 활용할 수 있는 예제
//230111 1교시
	public static void main(String[] args) {
		
		//로또 구매 1~45
		//중복을 해결하면서 1~45 뽑기 6회 수행하기
		
		//0.Set
		Random random = new Random();
		HashSet<Integer> set = new HashSet<>();
		int num;
		int idx = 0;
		
		//반복문으로 1~45숫자를 집어넣음, set은 중복허용이 안되므로 넣고, set.size()를 6으로 세팅
		while(set.size() < 6) {
			num = random.nextInt(45)+1;
			set.add(num);
		}
		System.out.println(set);
		
		//반복문으로 set의 값을 꺼내는 방법
		Iterator<Integer> is = set.iterator();
		while(is.hasNext()) { //다음값이 있는가?
			idx = idx + 1;
			num = is.next(); //다음거 주세요
			System.out.println(idx+"번째 숫자 : "+num);

		}
		
		
		//1. 배열
		int [] nums = new int[6];
		
		for(int i=0; i<nums.length; i++) {
			
			nums[i] = random.nextInt(44)+1;
			//반복문을 돌려서 중복검사
			for(int j=0; j<i; j++) {
				if(nums[i] == nums[j]) {
					i--;  //nums[i]와 nums[j]가 같으면 i의 인덱스를 다시 줄여줌으로써 중복된 자리에 새로운 수를 뽑게끔 함.
					break;
				}
			}
		}
		
		System.out.println("배열==================");
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
		//2. ArrayList
		ArrayList<Integer> ar = new ArrayList<>();
		
		while(ar.size()<6) {
			
			int n = random.nextInt(44)+1;
			boolean check = true;
			//중복확인을 위해 반복문 필요
			for(int i=0; i<ar.size(); i++) {
				if(n == ar.get(i)) {
					check = false; //있는것들이랑 뽑은값이랑 같으면 check1을 false로
					break;
				}
			}
			
			if(check) { //check1이 true일때만 값을 집어넣자.
				ar.add(n);
			}
		}
		
		System.out.println("ArrayList==============");
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
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
