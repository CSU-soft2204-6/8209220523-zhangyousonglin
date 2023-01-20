package com.yrd980.chapter14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;


/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Test03 {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(2, 4, 6);
        MyDate myDate1 = new MyDate(2, 4, 6);
        MyDate myDate2 = new MyDate(2, 4, 6);
        Employee apple = new Employee("apple", 10,myDate);
        Employee bear = new Employee("bear", 45,myDate1);
        Employee bear1 = new Employee("bear", 45,myDate2);
        HashSet hashSet = new HashSet();
        hashSet.add(bear);
        hashSet.add(bear1);
        hashSet.add(apple);
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Employee next = (Employee) iterator.next();
            System.out.println(next.toString());
        }

    }
}
class Employee{
    private String name;
    private int age;

    private MyDate birthday;

    public Employee(String name, int age,MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday=birthday;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
