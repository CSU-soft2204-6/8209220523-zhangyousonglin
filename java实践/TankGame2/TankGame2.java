package com.yrd980.TankGame2;

import javax.swing.*;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TankGame2 extends JFrame {

    MyPanel myPanel = null;
    public static void main(String[] args) {
        TankGame2 tankGame2 = new TankGame2();

    }

    public TankGame2() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1000,750);
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
