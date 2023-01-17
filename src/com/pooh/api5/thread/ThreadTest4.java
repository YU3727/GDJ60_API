package com.pooh.api5.thread;

public class ThreadTest4 implements Runnable{
//230116 2교시 Thread runable
	
	@Override
	public void run() {
		this.t4();
	}
	
	private void t4() {
		for(int i=0; i<25; i++) {
			System.out.println("world : "+i);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
