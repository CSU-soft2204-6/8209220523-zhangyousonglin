package com.yrd980.chapter14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Test04 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,new Emp("apple",21000,1));
        map.put(2,new Emp("bear",210000,2));
        map.put(3,new Emp("orange",1000,3));

        Set set = map.keySet();
        for(Object o:set){
            Emp emp = (Emp) map.get(o);
            if(emp.getSalary()>18000){
                System.out.println(emp);
            }
        }

        Set entrySet = map.entrySet();
        Iterator iter = entrySet.iterator();
        while (iter.hasNext()) {
            Map.Entry next =  (Map.Entry)iter.next();
            Emp emp = (Emp) next.getValue();
            if(emp.getSalary()>18000){
                System.out.println(emp);
            }
        }

    }
}
class Emp{
    private String name;
    private double salary;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Emp(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}