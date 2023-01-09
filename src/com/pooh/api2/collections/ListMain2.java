package com.pooh.api2.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain2 {
//230109 Collection Framework - List 7교시, 
	public static void main(String[] args) {
		int [] arr = new int[3];
		ArrayList ar = new ArrayList();
		
		//배열은 선언한 타입만 담을 수 있지만, ArrayList는 모든타입을 담을수 있음
		//다형성 - 상속관계에서 reference type 끼리의 형번환
		ar.add(1);       //int - primitive type 이므로, 다형성과 Auto Boxing 개념이 결합된 것(int <> Integer)
		//과정 - int1(primitive type)이 Integer1(reference type)로 변환 -> Object type은 모든 reference type
		//의 부모클래스이므로, 다형성이 성립됨. -> Integer타입이 오브젝트타입으로 변환되어 저장됨.
		
		//원래 과정 : Integer num1 = new Integer(1); 
//		Integer num1 = new Integer(1);
//		ar.add(num1);   Integer num1 = 1; 이게 int1(primitive)을 Integer1(reference)로 바꾸고, 인테저1
		ar.add(1.2);     //double -> Double(reference, Auto Boxing)
		ar.add("a");     //char   -> Character(reference, Auto Boxing)
		ar.add(false);   //boolean
		ar.add("hello"); //String
		ar.add(new Scanner(System.in));
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//서로 다른 데이터타입을 담을 수 있는것은 장점같아 보이지만, 사실은 단점이다.
		//에러가 뜸.
		//원래는
		Object n1 = ar.get(0);
		int n1 = (Integer)(ar.get(0)); //Auto Unboxing : reference type -> primitive type으로
		double n2 = (Double)(ar.get(1)); //Auto Unboxing

		
	}

}
