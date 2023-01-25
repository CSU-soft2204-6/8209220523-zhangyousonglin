package com.yrd980.chapter16;

import org.junit.jupiter.api.Test;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Thread01 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.start();
		//主线程启动一个子线程时时并行不会阻塞
		for (int i = 0; i < 80; i++) {
			System.out.println("主线程=" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

class Cat extends Thread {
	@Override
	public void run() {
		super.run();
		int times = 0;
		while (true) {

			System.out.println("mi~ao~~~" + (++times) + " " + Thread.currentThread().getName());

			//让其休眠ctrl alt t
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			if (times == 100) break;
		}
	}
}
