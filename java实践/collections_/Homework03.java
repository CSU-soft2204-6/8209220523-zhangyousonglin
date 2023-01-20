package com.yrd980.collections_;

import java.util.*;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework03 {
    public static void main(String[] args) {

        HashMap map = new HashMap();

        map.put("jack",650);
        map.put("tom",1200);
        map.put("smith",2900);

        System.out.println(map);

        map.put("jack",2600);

        System.out.println(map);

        Set set = map.keySet();
        for(Object key : set){
            map.put(key,(Integer)map.get(key)+100);
        }
        System.out.println(map);

        Set entrySet = map.entrySet();

        Iterator iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry =(Map.Entry) iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("遍历所有工资");
        Collection value = map.values();
        for(Object value1 :value){
            System.out.println("工资="+value1);
        }
    }
}
