package com.yrd980.TankWar;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Tank {

    //确定坦克坐标
    private int x;
    private int y;

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
