package com.yrd;

public class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object a){
        if(this == a){
            return true;
        }if (a instanceof Person2) {
            Person2 p = (Person2) a;
            return this.name.equals(p.name)&&this.age==(p.age);
        }return false;
    }

    public static void main(String[] args) {
        Person2 jack = new Person2("jack", 20);
        Person2 jack1 = new Person2("jack", 20);
        System.out.println(jack.equals(jack1));
        String a = "him";
        String b ="him";
        String apple = new String("apple");
        String apple1 = new String("apple");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(apple==apple1);
        System.out.println(apple.equals(apple1));
    }
}

