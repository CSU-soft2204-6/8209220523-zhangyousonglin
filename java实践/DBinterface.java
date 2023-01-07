package com.interface_;

import java.sql.SQLOutput;

public interface DBinterface {
    void start();
    void close();
}

class camara implements DBinterface {

    @Override
    public void start() {
        System.out.println("照相机开机");
    }

    @Override
    public void close() {
        System.out.println("照相机关机");
    }
}

class phone implements DBinterface{

    @Override
    public void start() {
        System.out.println("手机开机");
    }

    @Override
    public void close() {
        System.out.println("手机关机");
    }
}

class computer{
    public void showInfo(DBinterface a){
        a.start();
        a.close();
    }

    public static void main(String[] args) {
        phone phone = new phone();
        camara camara = new camara();
        computer computer = new computer();
        computer.showInfo(phone);
        computer.showInfo(camara);
    }
}