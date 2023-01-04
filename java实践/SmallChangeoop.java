package com.SmallChange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
这是零钱通的面向对象改写对照前面修改
 */
public class SmallChangeoop {
    boolean loop = true;
    Scanner myScanner = new Scanner(System.in);
    String key = " ";
    String details = "------------零钱通明细-----------";
    double money;
    double balance = 0;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Date date = null;
    String note;
    public void menu(){

        do {
            System.out.println("============零钱通菜单============");
            System.out.println("\t\t\t1. 零钱通明细");
            System.out.println("\t\t\t2. 收益入账");
            System.out.println("\t\t\t3. 消费");
            System.out.println("\t\t\t4. 退出");
            System.out.println("================================");

            System.out.println("请选择（1-4）：");
            key = myScanner.next();

            switch (key) {
                case "1" -> this.showDetails();
                case "2" -> this.income();
                case "3" -> this.cost();
                case "4" -> this.exit();
                default -> System.out.println("选择有误，请重新选择");
            }

        } while (loop);

    }
    public void showDetails(){
        System.out.println(details);
        System.out.println();

    }
    public void income(){
        System.out.print("收益入账金额：");
        money = myScanner.nextDouble();
        if (money < 0) {
            System.out.println("请输入大于0的金额");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
        System.out.println(details);
    }
    public void cost(){
        System.out.println("消费金额：");
        money = myScanner.nextDouble();
        if (money < 0 || money > balance) {
            System.out.println("请输入在0-" + balance + "的金额");
            return;
        }
        System.out.println("说明：");
        note = myScanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
        System.out.println(details);
    }
    public void exit(){
        System.out.println("你是否要退出请输入（y/n)");
        String choice;
        while (true) {
            choice = myScanner.next();
            if ("y".equals(choice)) {
                loop = false;
                break;
            }
            if ("n".equals(choice)) {
                break;
            }
        }System.out.println("=========退出了零钱通项目===========");
    }
}
