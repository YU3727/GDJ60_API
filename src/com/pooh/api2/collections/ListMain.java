package com.pooh.api2.collections;

import java.util.ArrayList;

public class ListMain {
//230109 Collection Framework - List 7교시
	public static void main(String[] args) {
		//순서유지, 값의 중복을 허용, 배열기반(index 사용)
		//배열과의 비교를 해보자면..
		int [] arr = new int[3];
		ArrayList ar = new ArrayList();
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3; //배열은 3칸으로 만들었으므로, 더이상 값을 넣을 수 없다
		
		//add() : 새로운 데이터를 추가하는 메서드
		ar.add(1); //0번인덱스에 들어감
		ar.add(2); //1번인덱스에 들어감
		ar.add(3); //2번인덱스에 들어감
		ar.add(4); //3번인덱스에 들어감...
		
		//배열과 ArrayList의 내용 꺼내오기
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		ar.add(1, 8); //추가를 하는데 1번인덱스에 8을 끼워 넣으라는 소리. 데이터가 덮어씌워지는게 아니라 index번호가 밀려난다
		ar.remove(0);
		ar.set(2, 9); //해당 인덱스의 데이터를 주어진 elements로 수정. 덮어씌워지는거라 index번호가 그대로임
		
		System.out.println("=======================");
		for(int i=0; i<ar.size(); i++) { //size는 몇칸인지 알려주는 메서드. length와 유사한 기능
			System.out.println(ar.get(i)); //꺼내오는거는 get
		}
	}

}
