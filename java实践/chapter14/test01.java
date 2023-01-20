package com.yrd980.chapter14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class test01 {
    public static void main(String[] args) {
        //@SuppressWarnings({"all"})
        Collection col = new ArrayList();
        col.add(new Book("a",5));
        col.add(new Book("b",6));
        col.add(new Book("c",9));
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
