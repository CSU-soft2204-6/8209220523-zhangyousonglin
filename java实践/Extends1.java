package com.yrd;

public class Extends1 {
    public static void main(String[] args) {
        Pc pc = new Pc("AMD",280,56,"apple");
        pc.showInfo();
    }
}
class Computer{
    private String cpu;
    private int memory;
    private int disk;

    public Computer() {
    }

    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getDetails(){
        return "cpu="+cpu+" memory="+memory+" disk="+disk;
    }

    public void showInfo(){
        System.out.println(getDetails());
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}

class Pc extends Computer {
    private String brand;

    public Pc(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getDetails(){
        return super.getDetails()+" brand="+brand;
    }

    public void showInfo(){
        System.out.println(getDetails());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}