package com.yrd980.chapter16;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Thread03 {
	public static void main(String[] args) {
		Thread t = new Thread(new T1(){
			public void run() {
				int count = 0;
				while (true){
					System.out.println("ok");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					if (count == 20) {
					    break;
					}
				}
			}

		});
		t.start();
	}
}
	class T1 implements Runnable {

		@Override
		public void run() {

		}
	}
