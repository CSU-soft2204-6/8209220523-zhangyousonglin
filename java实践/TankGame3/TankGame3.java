package com.yrd980.TankGame3;

import javax.swing.*;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TankGame3 extends JFrame {

    MyPanel myPanel = null;
    public static void main(String[] args) {
        TankGame3 tankGame3 = new TankGame3();

    }

    public TankGame3() {
        myPanel = new MyPanel();
        new Thread(myPanel).start();
        this.add(myPanel);
        this.setSize(1000,750);
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
