package com.houserent.service;

/*
*  House[]数组专门保存House对象
* 1.响应HouseView.java的各种操作
* 2.完成房屋信息的各种操作（实现增删改查）
* */

import com.houserent.domain.House;

public class HouseService {

    private House[] houses;
    private int houseNum = 1;

    private int idCounter = 1;

    public HouseService(int size){
        houses = new House[size];
        //以下为测试案例
        houses[0] = new House(1,"jack","123434","海淀区",2000,"未出租");
    }



    public boolean add(House newHouse){
        if(houseNum==houses.length){
            System.out.println("数组已满不能添加");
            return false;
        }else{
            houses[houseNum++] = newHouse;
            newHouse.setId(++idCounter);
            return true;
        }
    }

    public boolean del(int delId){
        //先找到下标
        int index = -1;
        for(int i = 0; i < houses.length; i++){
            if(delId == houses[i].getId()) {
                index = i;
            }
        }
        if(index == -1) {
            return false;
        }
        for (int i = index; i < houses.length-1; i++) {
            houses[i]=houses[i+1];
        }
        houses[--houseNum]=null;
        return true;
    }

    public House findId(int findId ){
        for (int i = 0; i < houses.length; i++) {
            if(findId == houses[i].getId()){
                return houses[i];
            }
        }return null;
    }

    public House[] list(){
        return houses;
    }
}
