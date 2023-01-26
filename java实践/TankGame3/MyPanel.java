package com.yrd980.TankGame3;

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
public class MyPanel extends JPanel implements KeyListener, Runnable {

	//定义我方坦克
	Hero hero = null;

	//定义敌方坦克放在vector因为线程安全

	Vector<EnemyTank> enemyTanks = new Vector<>();
	//定义敌方坦克数量
	int EnemyTankSize = 3;

	//生成炸弹
	Vector<Bomb> bombs = new Vector<>();
	//显示爆炸效果
	Image image = null;
	Image image1 = null;
	Image image2 = null;

	//一切的初始化
	public MyPanel() {
		//生成
		hero = new Hero(500, 500);

		hero.setSpeed(10);

		for (int i = 0; i < EnemyTankSize; i++) {

			EnemyTank enemyTank = new EnemyTank((i + 1) * 100, 0);

			enemyTank.setDirection(2);

			enemyTanks.add(enemyTank);

			//启动敌人坦克线程
			new Thread(enemyTank).start();

			Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 20, enemyTank.getDirection());

			enemyTank.shots.add(shot);
			//开启线程
			new Thread(shot).start();


		}
		image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/view.png"));
		image1 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/view1.png"));
		image2 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/view2.png"));

	}

	//绘画出对应场景
	@Override
	public void paint(Graphics g) {

		super.paint(g);

		g.fillRect(0, 0, 1000, 750);

		//画我方坦克
		if (hero != null && hero.isLive) {
			drawTank(hero.getX(), hero.getY(), g, hero.getDirection(), 1);
		}

		//画出hero射出的子弹

		for (int i = 0; i < hero.shots.size(); i++) {
			Shot shot = hero.shots.get(i);
			if (shot != null && shot.isLive()) {
				g.draw3DRect(shot.getX(), shot.getY(), 1, 1, false);
			} else {
				hero.shots.remove(shot);
			}
		}


		//如果bombs有对象
		for (int i = 0; i < bombs.size(); i++) {
			//为了第一个爆炸有效果

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}


			Bomb b = bombs.get(i);

			if (b.life > 6) {
				g.drawImage(image, b.x, b.y, 60, 60, this);
			} else if (b.life > 3) {
				g.drawImage(image1, b.x, b.y, 60, 60, this);
			} else {
				g.drawImage(image2, b.x, b.y, 60, 60, this);
			}
			//一直在重绘相当于循环
			//这是拖延时间
			b.lifeDown();
			if (b.life == 0) {
				bombs.remove(b);
			}
		}

		//初始化敌人坦克
		//下面EnemyTankSize是因为常数打不死
		for (int i = 0; i < enemyTanks.size(); i++) {
			//初始化坦克因为新加入了子弹
			EnemyTank enemyTank = enemyTanks.get(i);

			if (enemyTank.isLive) {
				//同上
				drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 0);
				//加入子弹
				for (int j = 0; j < enemyTank.shots.size(); j++) {
					//取出子弹
					Shot shot = enemyTank.shots.get(j);
					//绘制
					if (shot.isLive()) {
						g.draw3DRect(shot.getX(), shot.getY(), 1, 1, false);
					} else {
						enemyTank.shots.remove(shot);
					}

				}
			}

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
	//画出坦克
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

	public void hitHero() {
		for (int i = 0; i < enemyTanks.size(); i++) {

			EnemyTank enemy = enemyTanks.get(i);

			for (int j = 0; j < enemy.shots.size(); j++) {

				Shot shot = enemy.shots.get(j);

				if (hero.isLive && shot.isLive()) {

					hitEnermy(shot, hero);

				}
			}
		}
	}

	//多发子弹射击敌人
	public void hitEnermyTank() {
		for (int i = 0; i < hero.shots.size(); i++) {
			Shot shot = hero.shots.get(i);
			if (shot != null && shot.isLive()) {
				for (int j = 0; j < enemyTanks.size(); j++) {
					EnemyTank enemy = enemyTanks.get(j);
					hitEnermy(shot, enemy);
				}
			}
		}
		//先前判断射击
		/*
		if (hero.shot != null && hero.shot.isLive()) {
				for (int i = 0; i < enemyTanks.size(); i++) {
					EnemyTank enemy = enemyTanks.get(i);
					hitEnermy(hero.shot, enemy);
				}
			}
		 */
	}

	//子弹击中敌人并产生爆炸效果
	public void hitEnermy(Shot shot, Tank Tank) {

		switch (Tank.getDirection()) {

			case 0:
			case 2://子弹接触坦克
				if (shot.getX() > Tank.getX() && shot.getX() < Tank.getX() + 40
						&& shot.getY() < Tank.getY() + 60 && shot.getY() > Tank.getY()) {

					shot.setLive(false);

					Tank.isLive = false;

					enemyTanks.remove(Tank);

					//增加炸弹爆炸效果

					Bomb bomb = new Bomb(Tank.getX(), Tank.getY());

					bombs.add(bomb);

				}
				break;
			case 1:
			case 3:
				if (shot.getX() > Tank.getX() && shot.getX() < Tank.getX() + 60
						&& shot.getY() < Tank.getY() + 40 && shot.getY() > Tank.getY()) {

					shot.setLive(false);

					Tank.isLive = false;

					enemyTanks.remove(Tank);

					//增加炸弹爆炸效果

					Bomb bomb = new Bomb(Tank.getX(), Tank.getY());

					bombs.add(bomb);

				}
				break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	//按键控制移动和射击
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			hero.setDirection(0);
			if (hero.getY() > 0) {
				hero.moveUp();
			}
		} else if (e.getKeyCode() == KeyEvent.VK_D) {
			hero.setDirection(1);
			if (hero.getX() + 60 < 1000) {
				hero.moveRight();
			}
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			hero.setDirection(2);
			if (hero.getY() + 60 < 750) {
				hero.moveDown();
			}
		} else if (e.getKeyCode() == KeyEvent.VK_A) {
			hero.setDirection(3);
			if (hero.getX() > 0) {
				hero.moveLeft();
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_J) {
			/*射出一发
			if (hero.shot == null || !hero.shot.isLive()) {
				hero.shotEnermy();
			}
			*/
			hero.shotEnermy();
		}
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	//实现坦克射击效果
	@Override
	public void run() {
		//子弹射击是不停的重绘的过程
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			//判断是否消灭敌方坦克
			hitEnermyTank();
			//判断是否消灭我方坦克
			hitHero();
			//对应所有子弹都有效果
			hitEnermyTank();
			this.repaint();
		}
	}
}
