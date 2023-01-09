package com.pooh.api1.strings;

public class StringBuffer1 {
//230109 1교시 StringBuffer
	public static void main(String[] args) {
		//StringBuffer는 String이 아님
		
		//객체선언은 변수선언부터 하고 new 생성자()로
		StringBuffer sb = new StringBuffer("Hello");
		
		//hello + world
		
		sb.append("world"); //.append를 치면 매개변수가 많이 나옴 = 오버로딩		
		
		System.out.println(sb);
		
		//참조변수를 출력하면 자동으로 toString()이 호출 : 클래스명@객체주소
		//**toString은 object 클래스에서 상속받아서 쓸수 있음....
		//주소가 나오지 않고 "Helloworld"가 나왔다는건 상속받은 내용을 변경했음
		//즉, toString을 오버라이딩 했음을 유추할 수 있다.
		
		//변수에는 같은 데이터 타입만 대입 가능하다.
		//String str = sb; //String타입과 StringBuffer는 다른 데이터타입
		String str = sb.substring(0);
		
		str = sb.toString();
		
		System.out.println(str);
		//오버라이딩 : 부모클래스로부터 상속받은 메서드의 내용을 재정의하는 것....
		//toString메서드의 리턴타입은 String.(object에 toString메서드의 원형이 있음)
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(String.valueOf(str));
		//데이터 타입을 String으로 바꾸고 싶어서 쓰는 메서드(int > String, Double > String)
		//static이 붙은 애들은 클래스명.메서드명으로 호출한다.
		
		str = 123+""; //이 방법 또한 가능하지만, 객체가 생성된다.
	}

}
