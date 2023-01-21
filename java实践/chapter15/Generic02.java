package com.yrd980.chapter15;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Generic02 {
    public static void main(String[] args) {

    }
    @Test
    public void test(){
        DAO<User> dao = new DAO<>();

        dao.save("001",new User(001,20,"jack"));
        dao.save("002",new User(002,20,"cat"));
        dao.save("003",new User(003,20,"tom"));

        List<User> list = dao.list();
        System.out.println("list="+list);
    }

}

class DAO<T> {
    private Map<String, T> map=new HashMap<>( );//一定要初始化不然put放不了

    public DAO() {
    }

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

    public void save(String id, T entity){
        map.put(id,entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        Set<String> strings = map.keySet();
        for(String key:strings){
            list.add(get(key));
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }

}
class User{
    private int id;
    private int age;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
