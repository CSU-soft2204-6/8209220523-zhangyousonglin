package com.yrd980.TankWar;

import javax.swing.*;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TankGame1 extends JFrame {

    MyPanel myPanel = null;
    public static void main(String[] args) {
        TankGame1 tankGame1 = new TankGame1();

    }

    public TankGame1() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
