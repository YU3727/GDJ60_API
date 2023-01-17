package com.pooh.api5.thread;

public class ThreadTest1 extends Thread{ //thread는 java.lang에 있어서 import 받지 않아도 됨
//230116 1교시 Thread run
	
	@Override
	public void run() { //쓰레드 실행을 위한 메서드 - 운영체제가 실행하므로 운영체제가 이 쓰레드를 실행하게끔 유도해야한다. 이 때 호출하는 메서드가 run()
		this.t1();
	}
	
	
	public void t1() {
		for(int i=0; i<26; i++) {
			System.out.println("i : "+i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
