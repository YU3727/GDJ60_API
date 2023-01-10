package com.pooh.api2.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMain {
//230110 java.util.Map Set 7교시
	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		//ar1, ar2를 한꺼번에 모을 수 있는 ArrayList를 만들려면?
		ArrayList<ArrayList<Integer>> ars = new ArrayList<>();
		
		ars.add(ar1);
		ars.add(ar2);
		
		//ar1의 0번인덱스를 꺼내고싶다면?
		ars.get(0).get(0); //ars.get(0)까지가 ArrayList<Integer> 타입
		
		//이론상으로는 된다. 쓸데는 없고 효율도 없지만 정 필요하다면 이렇게라도 써야한다.
		ArrayList<ArrayList<ArrayList<Integer>>> arrs = new ArrayList<>();
		
		
		HashMap<String, ArrayList<Integer>> hm = new HashMap<>();
		//key는 개발자 마음대로 만듦.
		hm.put("ar1", ar1);
		hm.put("ar2", ar2);
		
	}

}
