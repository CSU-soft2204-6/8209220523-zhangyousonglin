package com.yrd980.drawexercise;

import javax.swing.*;
import java.awt.*;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
//演示如何在面板画圆形
//JFrame这是框架就是显示屏
public class Draw extends JFrame{

    private MyPanel myPanel = null;
    public static void main(String[] args) {
        new Draw();
    }
    //注意此时快捷键构造器不好用
    public Draw() {
        myPanel = new MyPanel();
        //把面板放入画框
        //下面应该都是继承的
        this.add(myPanel);
        //设置窗口大小
        this.setSize(1000,1200);
        //下面是退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
//1.先定义MyPanel,继承JPanel 这是java自带的
class MyPanel extends JPanel {

    //说明：
    //1。MyPanel对象是一个画板
    //2.Graphics g 是一个画笔
    @Override
    //被调用是监听机制
    //自动调用条件
    //组件第一次在屏幕显示
    //或窗口最小化然后最大化
    //或窗口大小发生变化
    //或调用repaint（）方法

    public void paint(Graphics g) {

        super.paint(g);//调用父类方法完成初始化

        //g.drawOval(10,10,100,100);
        //因为计算机GUI已经不常用就演示好玩的图片

        //画图片
        //1.获取图片资源
        //注意图片要复制下粘贴到out的包处
        //下面url的反斜杠表示根目录
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/16.png"));
        //2。画图
        g.drawImage(image,10,10,500,700,this);

        //写字
        /*
        *g.setColor(Color.CYAN);
        g.setFont(new Font("隶书",Font.PLAIN,50));
        g.drawString("你好",100,100);
        */
    }
}
