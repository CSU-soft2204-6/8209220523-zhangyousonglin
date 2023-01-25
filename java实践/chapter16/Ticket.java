package com.yrd980.chapter16;

/**
 * @author Yrd
 * @version 1.0
 * 有缺陷
 */
@SuppressWarnings({"all"})
public class Ticket {
	public static void main(String[] args) {
		SellTicket sellTicket = new SellTicket();

		new Thread(sellTicket).start();
		new Thread(sellTicket).start();
		new Thread(sellTicket).start();

	}
}

class SellTicket implements Runnable {
	private  int num = 20;

	public void setLoop(boolean loop) {
		this.loop = loop;
	}

	private boolean loop = true;

	@Override
	public void run() {

		while (loop) {
			if (num <= 0) {
				System.out.println("售票结束~~~");
				break;
			}
			System.out.println("剩余的票数=" + Thread.currentThread().getName() + " " + (--num));
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			if (num == 0) break;
		}
	}
}
