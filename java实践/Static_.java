package com.yrd;

public class Static_ {
    public static void main(String[] args) {
        /*B b = new B(2, 3, 4);
        System.out.println();
        B b1 = new B(1, 1, 1);
        System.out.println();
        System.out.println(B.key);*/

        new C();

    }
}

class A {
    private int age;
    private int time;

    static {
        System.out.println("爷类静态代码块");
    }

    {
        System.out.println("爷类普通代码块");
    }

    public A() {
        System.out.println("爷类无参构造器");
    }

    public static void show() {
        System.out.println("爷类静态方法");
    }

    public A(int age, int time) {
        this.age = age;
        this.time = time;
    }
}

class B extends A {

    public static int key = 0;

    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类普通代码块");
    }

    public B() {
        System.out.println("父类无参构造器");
    }

    public B(int age, int time, int key) {
        super(age, time);
    }

    public static void say() {
        System.out.println("父类静态方法");
    }
}

class C extends B {
    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类普通代码块");
    }

    public C() {
        System.out.println("子类构造器");
    }


}