package com.yrd980.chapter16;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework01 {
	public static void main(String[] args) {
		A a = new A();
		new B(a).start();
		a.start();


	}
}

class A extends Thread {
	private boolean loop = true;

	@Override
	public void run() {
		super.run();
		while (loop) {
			System.out.println(new Random().nextInt(100));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}

	}

	public void setLoop(boolean loop) {
		this.loop = loop;
	}
}

class B extends Thread {
	private Scanner myScanner = new Scanner(System.in);
	private A a;

	public B(A a) {
		this.a = a;
	}

	@Override
	public void run() {
		super.run();
		while (true) {
			System.out.println("输入Q暂停");
			char c = myScanner.next().toUpperCase().charAt(0);
			if (c == 'Q') {
				a.setLoop(false);
				System.out.println("over");
				break;
			}
		}
	}
}
