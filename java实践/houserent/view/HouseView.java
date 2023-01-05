package com.houserent.view;

/*
 * 1.显示界面
 * 2.接受用户的输入
 * 3.调用HouseService完成对房屋信息的各种操作
 * */

import com.houserent.HouseRentApp;
import com.houserent.domain.House;
import com.houserent.service.HouseService;
import com.houserent.utils.Utility;

import java.util.Scanner;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';

    private HouseService houseService = new HouseService(10);

    public void listHouses() {
        System.out.println("=========房屋列表========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租）");
        House[] houses = houseService.list();
        for (House house : houses) {
            if (house == null) {
                break;
            } else System.out.println(house);
        }
        System.out.println("=========房屋列表显示完毕========");
    }

    public void addHouse() {
        System.out.println("=========添加房屋========");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String telephone = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String status = Utility.readString(3);
        House newHouse = new House(0, name, telephone, address, rent, status);
        if (houseService.add(newHouse)) {
            System.out.println("=========添加房屋成功========");
        } else {
            System.out.println("=========添加房屋失败========");
        }

    }

    public void delHouse() {
        System.out.println("=========删除房屋信息========");
        System.out.println("请输入待删除的房屋编号（-1）退出：");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("=========放弃删除房屋信息========");
            return;
        }
        //System.out.println("请确认是否删除房屋信息（Y/N），小心选择：");
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("=========删除房屋信息成功========");
            } else {
                System.out.println("=========房屋信息不存在,删除失败========");
            }
        } else {
            System.out.println("=========放弃删除房屋信息========");
        }
    }

    public void findHouse(){
        System.out.println("=========查找房屋信息========");
        System.out.println("请输入要查找的id：");
        int findId = Utility.readInt();
        House house = houseService.findId(findId);
        if(house==null){
            System.out.println("=========没有查找到房屋信息========");
        }else {
            System.out.println(house);
        }
    }

    public void update(){
        System.out.println("=========修改房屋信息========");
        System.out.println("请输入待修改的房屋编号（-1表示退出）：");
        int updateId = Utility.readInt();
        if(updateId == -1){
            System.out.println("=========放弃删除房屋信息========");
            return;
        }

        House house = houseService.findId(updateId);
        if(house == null){
            System.out.println("=========修改房屋信息编号不存在========");
            return;
        }

        System.out.println("姓名（"+house.getName()+"):");
        String name = Utility.readString(8," ");
        if(!" ".equals(name)){
            house.setName(name);
        }

        System.out.println("电话（"+house.getTelephone()+"):");
        String telephone = Utility.readString(12);
        if(!" ".equals(telephone)){
            house.setTelephone(telephone);
        }

        System.out.println("地址（"+house.getAddress()+"):");
        String address = Utility.readString(18);
        if(!" ".equals(address)){
            house.setAddress(address);
        }

        System.out.println("租金（"+house.getRent()+"):");
        int rent = Utility.readInt(-1);
        if(rent!=-1){
            house.setRent(rent);
        }

        System.out.println("状态（"+house.getStatus()+"):");
        String status = Utility.readString(3," ");
        if(!" ".equals(status)){
            house.setStatus(status);
        }
    }

    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    //显示主菜单
    public void mainMenu() {

        do {

            System.out.println("--------房屋出租系统--------");
            System.out.println("\t\t\t1.新增房源");
            System.out.println("\t\t\t2.查找房源");
            System.out.println("\t\t\t3.删除房源");
            System.out.println("\t\t\t4.修改房屋信息");
            System.out.println("\t\t\t5.房屋列表");
            System.out.println("\t\t\t6.退出");
            System.out.println("请选择（1-6）：");
            key = Utility.readChar();

            switch (key) {
                case '1':
                    this.addHouse();
                    break;

                case '2':
                    findHouse();
                    break;

                case '3':
                    delHouse();
                    break;
                case '4':
                    System.out.println("修改");
                    System.out.println("姓名：");
                    break;
                case '5':
                    this.listHouses();
                    break;
                case '6':

                    break;
            }

        } while (loop);
    }
}
