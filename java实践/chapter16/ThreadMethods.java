package com.yrd980.chapter16;

import java.sql.SQLOutput;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ThreadMethods {
	public static void main(String[] args) throws InterruptedException {
		T2 t2 = new T2();
		t2.setName("apple");
		//t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		System.out.println(t2.getName());
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("主线程正在被执行" + i);
			if (i == 5) {
				//t2.join();
				t2.yield();
			}
		}
		//t2.interrupt();
	}
}

class T2 extends Thread {
	@Override
	public void run() {
		//while (true) {
		//super.run();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " 吃包子~~~" + i);

			try {
				//System.out.println(Thread.currentThread().getName() + "正在休眠~~~");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + "别interrupted了");
			}
		}
		//}
	}
}
