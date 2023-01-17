package com.pooh.api5.thread;

public class ThreadTest3 implements Runnable{
//230116 2교시 Thread runable
	
	@Override
	public void run() {
		this.t3();
	}
	
	private void t3() {
		for(int i=0; i<25; i++) {
			System.out.println("Hello : "+i);
			try {
				Thread.sleep(150);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
