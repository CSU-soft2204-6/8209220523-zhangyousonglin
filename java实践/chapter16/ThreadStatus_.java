package com.yrd980.chapter16;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ThreadStatus_ {
	public static void main(String[] args) throws InterruptedException {
		T4 t4 = new T4();
		System.out.println(t4.getName()+" status "+t4.getState());
		t4.start();

		while (Thread.State.TERMINATED!=t4.getState()){

			System.out.println(t4.getName()+" status "+t4.getState());
			Thread.sleep(500);

		}

		System.out.println(t4.getName()+" status "+t4.getState());
	}
}

class T4 extends Thread {
	@Override
	public void run() {
		super.run();
		while (true) {
		    for (int i = 0; i <5;i++ ) {
			    System.out.println("hi "+i);
			    try {
				    Thread.sleep(1000);
			    } catch (InterruptedException e) {
				    throw new RuntimeException(e);
			    }
		    }
			break;
		}
	}
}
