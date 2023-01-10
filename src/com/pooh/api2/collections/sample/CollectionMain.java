package com.pooh.api2.collections.sample;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollectionMain {
//230110 java.util.Map, Set 7교시 - Generic
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		
		//child1과 child2는 관계가 없다
		//ArrayList에 child1과 child2를 한번에 모으고 싶으면 어떻게 선언해야할까
		ArrayList<Parent> ar = new ArrayList<>(); // child1,2는 둘 다 Parent를 상속받았으므로 Parent 타입
		ar.add(child1);
		ar.add(child2);
		
		Child1 ch1 = (Child1)ar.get(0); //parent타입을 child1으로 한정지어야 변수에 대입가능
		
		//instanceof 연산자 : 맞으면 true 틀리면 false 반환
		System.out.println(ar.get(0) instanceof Child1); //해석 : 0번의 참조변수가 Child1클래스의 instance입니까?
		
		//Parent타입과 Parent를 상속받는 타입을 모으겠다는 의미
		ArrayList<? extends Parent> ar2 = new ArrayList<>();
		//Parent타입과 Parent의 부모타입을 모으겠다는 의미
		ArrayList<? super Parent> ar3 = new ArrayList<>();
		
	}

}
