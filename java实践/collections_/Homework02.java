package com.yrd980.collections_;

import java.util.TreeSet;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        tree.add(new Person(
        ){
            public int compareTo(){
                return 0;
            }
        });

    }
}
class Person {


}
