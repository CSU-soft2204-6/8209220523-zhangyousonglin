package com.yrd980.chapter16;

/**
 * @author Yrd
 * @version 1.0
 * 静态代理模式
 */
@SuppressWarnings({"all"})
public class Thread02 {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		ThreadProxy threadProxy = new ThreadProxy(tiger);
		threadProxy.run();
	}
}

class Animal{}
class Tiger extends Animal implements Runnable {

	@Override
	public void run() {
		System.out.println("ao ao ao ~~~");
	}
}
class ThreadProxy implements Runnable {

	private Runnable target = null;
	@Override
	public void run() {
		if (target != null) {
		    target.run();
		}
	}

	public ThreadProxy(Runnable target) {
		this.target = target;
	}

	public void start() {
	    start0();
	}

	public void start0() {
	    run();
	}
}
