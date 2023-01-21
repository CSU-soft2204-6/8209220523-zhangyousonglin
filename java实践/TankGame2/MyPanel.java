package com.yrd980.TankGame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author Yrd
 * @version 1.0
 * 坦克大战绘图区
 */
@SuppressWarnings({"all"})
public class MyPanel extends JPanel implements KeyListener {

	//定义我方坦克
	Hero hero = null;

	//定义敌方坦克放在vector

	Vector<EnemyTank> enemyTanks = new Vector<>();
	//定义敌方坦克数量
	int EnemyTankSize = 3;

	public MyPanel() {
		hero = new Hero(100, 100);
		hero.setSpeed(10);
		for (int i = 0; i < EnemyTankSize; i++) {
			EnemyTank enemyTank = new EnemyTank((i + 1) * 100, 0);
			enemyTank.setDirection(2);
			enemyTanks.add(enemyTank);
		}
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, 1000, 750);

		//画坦克封装方法
		drawTank(hero.getX(), hero.getY(), g, hero.getDirection(), 1);

		//初始化敌人坦克
		//下面EnemyTankSize是因为常数打不死
		for (int i = 0; i < EnemyTankSize; i++) {
			EnemyTank enemyTank = enemyTanks.get(i);
			drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 0);
		}

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
			case 1: //我方坦克
				g.setColor(Color.CYAN);
				break;
			case 0://敌方坦克
				g.setColor(Color.yellow);
				break;
		}


		//根据坦克方向绘制对应形状坦克
		//规定0 1 2 3分别对应向上向右向下向左
		switch (direction) {
			case 0://向上
				g.fill3DRect(x, y, 10, 60, false);//左边的轮子
				g.fill3DRect(x + 30, y, 10, 60, false);//右边的轮子
				g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克的盖子
				g.fillOval(x + 10, y + 20, 20, 20);//画出坦克的圆形盖子
				g.drawLine(x + 20, y + 30, x + 20, y);//画出炮筒
				break;
			case 1://向右
				g.fill3DRect(x, y, 60, 10, false);//左边的轮子
				g.fill3DRect(x, y + 30, 60, 10, false);//右边的轮子
				g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克的盖子
				g.fillOval(x + 20, y + 10, 20, 20);//画出坦克的圆形盖子
				g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒
				break;
			case 2://向下
				g.fill3DRect(x, y, 10, 60, false);//左边的轮子
				g.fill3DRect(x + 30, y, 10, 60, false);//右边的轮子
				g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克的盖子
				g.fillOval(x + 10, y + 20, 20, 20);//画出坦克的圆形盖子
				g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出炮筒
				break;
			case 3://向左
				g.fill3DRect(x, y, 60, 10, false);//左边的轮子
				g.fill3DRect(x, y + 30, 60, 10, false);//右边的轮子
				g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克的盖子
				g.fillOval(x + 20, y + 10, 20, 20);//画出坦克的圆形盖子
				g.drawLine(x + 30, y + 20, x, y + 20);//画出炮筒
				break;
			default:
				System.out.println("暂时没有处理");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			hero.setDirection(0);
			hero.moveUp();
		} else if (e.getKeyCode() == KeyEvent.VK_D) {
			hero.setDirection(1);
			hero.moveRight();
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			hero.setDirection(2);
			hero.moveDown();
		} else if (e.getKeyCode() == KeyEvent.VK_A) {
			hero.setDirection(3);
			hero.moveLeft();
		}
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
