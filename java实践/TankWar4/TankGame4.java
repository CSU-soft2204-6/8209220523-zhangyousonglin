package com.yrd980.TankWar4;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TankGame4 extends JFrame {

	MyPanel myPanel = null;

	static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {

		TankGame4 tankGame4 = new TankGame4();

	}

	public TankGame4() {
		System.out.println("请选择 1：新游戏 2：继续上一局");
		String key = myScanner.next();
		myPanel = new MyPanel(key);
		new Thread(myPanel).start();
		this.add(myPanel);
		this.setSize(1330, 750);
		this.addKeyListener(myPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		//增加关闭窗口的监听机制
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Recorder_.keepRecord();
				System.exit(0);
			}
		});

	}
}
