package com.pooh.api1.objects;

public class ObjectStudy {
	//230105 5교시 6교시 Library(API)
	public static void main(String[] args) {
		//객체 생성 코드
		Object object = new Object();
		
		//무슨일을 하는지는 몰라도 호출까지는 가능해야한다
		
		//멤버 사용(접근)
		//참조변수명.변수명 또는 참조변수명.메서드명()
		
		//hashCode 메서드 사용해보기
		int n = object.hashCode();
		System.out.println(n);

		
		//toString 메서드 사용해보기
		String s = object.toString();
		System.out.println(s);
		System.out.println(object); //참조변수를 찍으면 object.toString()과 같음.
		
		
		//모든 클래스의 최고 조상은 object 클래스이다.(모든 클래스의 부모)
		//즉, 모든 클래스는 object 타입이다.
		Child child = new Child();
//		child.toString(); //Child, Parent에는 아무것도 선언되어 있지 않지만 .toString 메서드를 쓸수있음
		                  //즉, object클래스로부터 상속받음
		
		Object obj = new Object();
		System.out.println(object == obj); //주소값은 새로운 객체들끼리 비교이므로 다름...
		boolean check = object.equals(obj);
		System.out.println(check);
		
		System.out.println(child.toString());
		System.out.println(child); //참조변수를 찍으면 내부적으로 toString()이 찍힘
		
		//메모리 주소를 알고싶을때는 어떻게 할까? -> 이 때 쓰는게 hashCode
		System.out.println(child.hashCode());
		//it업계에서 hash는 보안에서 많이 쓴다.
		//hash는 갈아버린다 정도의 의미. 비밀번호 1234 -(hash)-> ab134d352
		
		Object o = child; // 다형성
		
	}
	
}
