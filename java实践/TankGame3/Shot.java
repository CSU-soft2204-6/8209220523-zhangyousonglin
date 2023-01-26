package com.yrd980.TankGame3;

/**
 * @author Yrd
 * @version 1.0
 * 射击子弹
 */
@SuppressWarnings({"all"})
public class Shot implements Runnable {
	private int x;
	private int y;

	private int direction;//坦克方向 0 1 2 3 上右下左

	private int speed = 10;

	private boolean isLive = true;//妙手

	public Shot(int x, int y, int direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getDirection() {
		return direction;
	}

	public boolean isLive() {
		return isLive;
	}

	public void setLive(boolean live) {
		isLive = live;
	}

	@Override
	//射击子弹
	public void run() {
		while (true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			switch (direction) {
				case 0://up
					y -= speed;
					break;
				case 1://right
					x += speed;
					break;
				case 2://down
					y += speed;
					break;
				case 3://left
					x -= speed;
					break;
			}
			if (!(isLive && x > 0 && x < 1000 && y > 0 && y < 750)) {
				isLive = false;
				break;
			}
		}
	}
}
