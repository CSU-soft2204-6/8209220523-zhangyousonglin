package com.yrd980.chapter16;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ThreadMethod02 {
	public static void main(String[] args) throws InterruptedException {
		MyDeamonThread myDemoThread = new MyDeamonThread();
		myDemoThread.setDaemon(true);
		myDemoThread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("doing");
			Thread.sleep(1000);
		}
	}
}
class MyDeamonThread extends Thread {
	@Override
	public void run() {
		super.run();
		for (;;){
			try{
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println("talking");
		}
	}
}
