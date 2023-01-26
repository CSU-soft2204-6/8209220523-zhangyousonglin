package com.yrd980.TankGame3;

/**
 * @author Yrd
 * @version 1.0
 * 血条
 */
@SuppressWarnings({"all"})
public class Bomb {
	int x, y;
	int life=9;// bomb span

	boolean isLive = true;

	public Bomb(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void lifeDown() {
		if (life > 0) {
			life--;
		} else {
			isLive = false;
		}
	}
}

