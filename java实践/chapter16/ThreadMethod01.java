package com.yrd980.chapter16;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ThreadMethod01 {
	public static void main(String[] args) throws InterruptedException {
		T3 t3 = new T3();
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("hi " + i);
			if(i==5){
				Thread thread = new Thread(t3);
				thread.start();
				thread.join();
			}
		}
		System.out.println("main over");
	}
}

class T3 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println("hello");
		}
		System.out.println("over");
	}
}
