package com.yrd980.TankGame3;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Tank {

	//确定坦克坐标
	private int x;
	private int y;

	boolean isLive = true;

	private int direction;//坦克方向 0 1 2 3 上右下左

	private int speed = 1;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void moveUp() {
		y -= speed;
	}

	public void moveDown() {
		y += speed;
	}

	public void moveLeft() {
		x -= speed;
	}

	public void moveRight() {
		x += speed;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public Tank(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
