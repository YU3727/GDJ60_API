package com.pooh.api5.thread;

public class ThreadTest2 extends Thread{
//230116 1교시 Thread run
	
	@Override
	public void run() { 
		this.t2();
	}
	
	
	public void t2() {
		for(int i='A'; i<='Z'; i++) { //'A', 'Z'는 char타입으로 int랑 cascading한것
			System.out.println("T2 : "+(char)i);
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
