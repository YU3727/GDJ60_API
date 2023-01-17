package com.pooh.api5.thread;

public class ThreadMain1 {
//230116 1~2교시 Thread(개념만 알고 가자, 나중에 배울 web에서는 자동으로 쓰레드를 만들어줌)	
	public static void main(String[] args) {
		
		ThreadTest1 tt1 = new ThreadTest1(); //ThreadMain1 클래스는 tt1변수가 필요하다. > ThreadMain은 tt1에 대해 의존적(필요함)이다
		ThreadTest2 tt2 = new ThreadTest2();
		ThreadTest3 tt3 = new ThreadTest3();
		ThreadTest4 tt4 = new ThreadTest4();
		
		//Thread는 프로그래머가 직접 실행하는게 아니라 OS가 실행하는 것이다. 그래서 실행을 멤버변수명.start()로 함
		//이 때 운영체제한테 메서드를 실행해 달라고 위임(tt1.start())하면, tt1, tt2에 있는 run()을 OS가 임의대로 실행한다.
		//run메서드는 운영체제가 실행한다.
		
		//Thread 상속
		tt1.start();
		tt2.start();
		
		//Runnable 확장 > Runnable에서 start를 쓰기 위해서는 쓰레드 클래스를 만들어야한다.(Runnable에는 run메서드 밖에 없음)
		Thread tr1 = new Thread(tt3);
		Thread tr2 = new Thread(tt4);
		
		//Runnable로 확장한것을 실행
		tr1.start();
		tr2.start();
		
		
		//OS가 균등하게 실행하도록 조정은 가능함. -> 메서드 한번 실행하고 쉬는시간 약간 주기
		//Thread.sleep(mili sec); Thread 클래스 내의 메서드를 사용.(클래스변수.메서드명)
		
		//그래도 아직 카카오톡같이 메시지 주고받는 기능을 구현하기는 힘들다.
		//Console창이 한개이기 때문 -> 입력창, 출력창을 구분. 화면 만들기는 다른걸로
	}

}
