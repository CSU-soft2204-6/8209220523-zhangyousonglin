package com.houserent.domain;
/*
*   房屋的对象表示信息
* */
public class House {
    //编号 房主 电话 地址 月租 状态（未出租/已出租）
    private int id;
    private String name;
    private String telephone;
    private String address;
    private double rent;
    private String status;
    //

    public House(int id, String name, String telephone, String address, double rent, String status) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.rent = rent;
        this.status = status;
    }

    @Override
    public String toString() {
        return id +
                "\t\t" + name +
                "\t" + telephone +
                "\t" + address +
                "\t" + rent +
                "\t" + status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
