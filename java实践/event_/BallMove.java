package com.yrd980.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BallMove extends JFrame {
	MyPanel myPanel = null;

	public static void main(String[] args) {
		BallMove ballMove = new BallMove();
	}

	public BallMove() {
		myPanel = new MyPanel();
		this.add(myPanel);
		this.setSize(400, 300);
		this.addKeyListener(myPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

class MyPanel extends JPanel implements KeyListener {

	//为了让小球移动给（x,y)设置变量
	int x = 10;
	int y = 10;

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(x, y, 20, 20);
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		//根据用户按下的不同的键来控制上下左右
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 10;
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			y -= 10;
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 10;
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 10;
		}
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
