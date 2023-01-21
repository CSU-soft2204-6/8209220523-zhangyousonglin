package com.yrd980.TankWar;

import javax.swing.*;
import java.awt.*;

/**
 * @author Yrd
 * @version 1.0
 * 坦克大战绘图区
 */
@SuppressWarnings({"all"})
public class MyPanel extends JPanel {
    Hero hero = null;

    public MyPanel() {
        hero = new Hero(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);

        //画坦克封装方法
        drawTank(hero.getX(),hero.getY(),g,0,0);
        drawTank(hero.getX()+60,hero.getY(),g,0,1);

    }
    //此处快捷键是/**➕enter键

    /**
     * @param x为坦克横坐标
     * @param y为坦克纵坐标
     * @param g这是画笔
     * @param direction考虑的是方向
     * @param type这是坦克类型
     */

    public void drawTank(int x, int y, Graphics g, int direction, int type) {

        switch (type) {
            case 0: //我方坦克
                g.setColor(Color.CYAN);
                break;
            case 1://敌方坦克
                g.setColor(Color.yellow);
                break;
        }

        switch (direction) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);//左边的轮子
                g.fill3DRect(x+30, y, 10, 60, false);//右边的轮子
                g.fill3DRect(x+10, y+10, 20, 40, false);//画出坦克的盖子
                g.fillOval(x+10, y+20, 20, 20);//画出坦克的圆形盖子
                g.drawLine(x+20,y+30,x+20,y);//画出炮筒
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }
}
