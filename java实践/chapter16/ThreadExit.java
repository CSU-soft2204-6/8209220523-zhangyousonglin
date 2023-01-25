package com.yrd980.chapter16;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ThreadExit {
	public static void main(String[] args) throws InterruptedException {
		T t = new T();
		t.start();
		Thread.sleep(5*1000);
		t.setLoop(false);
	}
}

class T extends Thread {
	private int count = 0;
	private boolean loop = true;

	public void setLoop(boolean loop) {
		this.loop = loop;
	}

	public void run(){
		while (loop){
			System.out.println("ok"+(++count));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}

		}
	}
}
