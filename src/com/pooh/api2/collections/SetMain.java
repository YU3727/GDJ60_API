package com.pooh.api2.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {
//230110 java.util.Set 6교시
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(11);
		hs.add(11);
		hs.add(2);
		hs.remove(1);
		
		System.out.println(hs.toString()); //toString 메서드를 오버라이딩 함
		System.out.println(hs.size()); 
		//hs.get : index번호가 없으므로 get메서드를 쓸수없음
		
		//Set의 Data들을 출력하기 위해서는 Iterator 형식으로 변경한다
		//변수 선언 - 다형성
		Iterator<Integer> is = hs.iterator();
		//interface든 추상클래스든 객체생성은 못하지만, 데이터타입으로는 쓸 수 있다.
		while(is.hasNext()) { //다음값이 있는가?
			Integer num = is.next(); //다음거 주세요
		}
		//set은 하나의 무리로 움직일수는 있지만, 데이터를 하나씩 꺼내기에는 불편하다
	}

}
