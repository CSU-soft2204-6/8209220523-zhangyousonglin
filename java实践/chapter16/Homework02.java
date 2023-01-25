package com.yrd980.chapter16;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework02 {
	public static void main(String[] args) {
		/*
		WithDraw withDraw = new WithDraw();
		new Thread(withDraw).start();
		new Thread(withDraw).start();
		*/
		//下面这个还需修改
		new WithDraw1().start();
		new WithDraw1().start();

	}

}

class WithDraw implements Runnable {
	private int money = 10000;

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				if (money < 1000) {
					System.out.println("余额不足1000");
					break;
				}
				money -= 1000;
				System.out.println(Thread.currentThread().getName() + "取走了1000 " + "余额=" + money);

			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

}

class WithDraw1 extends Thread {
	private static int money = 10000;

	private  static Object object = new Object();

	@Override
	public void run() {
		super.run();
		synchronized (object) {
			while (true) {
				synchronized (this) {
					if (money < 1000) {
						System.out.println("余额不足1000");
						break;
					}
					money -= 1000;
					System.out.println(Thread.currentThread().getName() + "取走了1000 " + "余额=" + money);

				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
}
