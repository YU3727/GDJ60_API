package com.pooh.api2.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain {
//230110 java.util.Map 6교시 7교시
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		//데이터 추가
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3",  "v3");
		map.put("k2", "veRe");
		
		
		//데이터 조회
		String v = map.get("k3");
		
		//데이터 삭제
		v = map.remove("k2"); //자동완성을 읽어보면 삭제될때 해당타입을 반환해줌
		
		boolean check = map.containsKey("k1"); //contains 포함하는가?
		boolean check2 = map.containsValue("v7");
		System.out.println(check);
		System.out.println(check2);
		
		
		//map에서 반복을 하는 방법 - but, 보통map을 쓸때는 반복문 없이 하나씩 꺼내려 한다.
		//1. Key들의 정보를 알아야함
		//   Key들을 먼저 Set으로 묶는다(Set이 중복을 허용하지 않고, 집합이기 때문)
		//   Set을 하나씩 꺼내기위해 열거형 Iterator로 변환
		Iterator<String> it = map.keySet().iterator(); // Key -> Set + .iterator();
		//이제 반복문을 돌릴 수 있음
		while(it.hasNext()) { //it가 다음값을 가지고 있는가? t/f
			String key = it.next();
			System.out.println("Key : "+key);
			String value = map.get(key);
			System.out.println("Value : "+value);
		} //반복문으로 map의 값을 꺼내는 방법이다.
		
		
		System.out.println(v);
		System.out.println(map);
		
		
		//전체 삭제
		map.clear();
	}

}
