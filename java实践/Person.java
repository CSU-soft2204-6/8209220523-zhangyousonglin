package com.yrd;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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

    public String showIn() {
        return "name=" + name + " age=" + age;
    }

    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("merry", 12, 100);
        persons[2] = new Teacher("zhan  ", 20, "math");
        for (Person person : persons) {
            System.out.println(person.showIn());
            if(person instanceof Student){
                ((Student) person).study();
            }else if(person instanceof Teacher){
                ((Teacher)person).teach();
            }else if(person instanceof Person){

            }else{
                System.out.println("false");
            }
        }
    }
}

class Student extends Person {
    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void study(){
        System.out.println("study~~");
    }

    public String showIn() {
        return super.showIn() + " score=" + score;
    }
}

class Teacher extends Person {
    private String classes;

    public Teacher(String name, int age, String classes) {
        super(name, age);
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String showIn() {
        return super.showIn() + " classes=" + classes;
    }

    public void teach(){
        System.out.println("teach~~");
    }
}
