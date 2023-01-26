package com.yrd980.TankGame3;

import java.util.Random;
import java.util.Vector;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class EnemyTank extends Tank implements Runnable {
	Vector<Shot> shots = new Vector<>();

	boolean isLive = true;

	public EnemyTank(int x, int y) {
		super(x, y);
	}

	//让坦克自由移动
	//根据坦克方向随机
	//射击子弹
	@Override
	public void run() {

		while (true) {

			if (isLive && shots.size() <= 5) {

				Shot shot = null;

				switch (getDirection()) {
					case 0:
						shot = new Shot(getX() + 20, getY(), 0);
						break;
					case 1:
						shot = new Shot(getX() + 60, getY() + 20, 1);
						break;
					case 2:
						shot = new Shot(getX() + 20, getY() + 60, 2);
						break;
					case 3:
						shot = new Shot(getX(), getY() + 20, 3);
						break;
				}
				shots.add(shot);

				new Thread(shot).start();

				//我认为的
			/*
			Shot shot = new Shot(getX() + 20, getY() + 20, getDirection());

			shots.add(shot);
			//开启线程
			new Thread(shot).start();

			 */

			}


		//自由移动
			switch (getDirection()) {
				case 0:
					for (int i = 0; i < 30; i++) {
						if (getY() > 0) {
							moveUp();
						}
						try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							throw new RuntimeException(e);
						}
					}
					break;

				case 1:
					for (int i = 0; i < 30; i++) {
						if (getX() + 60 < 1000) {
							moveRight();
						}

						try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							throw new RuntimeException(e);
						}
					}
					break;

				case 2:
					for (int i = 0; i < 30; i++) {
						if (getY() + 60 < 750) {
							moveDown();
						}
						try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							throw new RuntimeException(e);
						}
					}
					break;

				case 3:
					for (int i = 0; i < 30; i++) {
						if (getX() > 0) {
							moveLeft();
						}
						try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							throw new RuntimeException(e);
						}
					}
					break;

			}

			setDirection(new Random().nextInt(4));

			//写并发程序一定要考虑结束
			if (!isLive) {
				break;
			}
		}
	}
}
