package com.yrd980.TankWar4;

import java.util.Vector;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Hero extends Tank {
	Shot shot = null;

	Vector<Shot> shots = new Vector<>();

	public Hero(int x, int y) {
		super(x, y);
	}

	public void shotEnermy() {

		//限制我方在屏幕内5颗子弹
		if (shots.size() == 5) {
			return;
		}

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
	}
}
