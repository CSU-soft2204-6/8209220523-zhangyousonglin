package com.SmallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner myScanner = new Scanner(System.in);
        String key = " ";
        String details = "------------零钱通明细-----------";
        double money;
        double balance = 0;
        String note;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = null;
        do {


            System.out.println("============零钱通菜单=============");
            System.out.println("\t\t\t1. 零钱通明细");
            System.out.println("\t\t\t2. 收益入账");
            System.out.println("\t\t\t3. 消费");
            System.out.println("\t\t\t4. 退出");

            System.out.println("请选择（1-4）：");
            key = myScanner.next();

            switch (key) {
                case "1":
                    System.out.println(details);
                    System.out.println();
                    break;
                case "2":
                    System.out.print("收益入账金额：");
                    money = myScanner.nextDouble();
                    if (money < 0) {
                        System.out.println("请输入大于0的金额");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
                    System.out.println(details);
                    break;
                case "3":
                    System.out.println("消费金额：");
                    money = myScanner.nextDouble();
                    if (money < 0 || money > balance) {
                        System.out.println("请输入在0-" + balance + "的金额");
                        break;
                    }
                    System.out.println("说明：");
                    note = myScanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    System.out.println(details);
                    break;
                case "4":
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
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
    
            }

        } while (loop);
        System.out.println("=========退出了零钱通项目===========");
    }
}
