package com.yrd980.chapter17_;


import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HomeWork03 {
	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();
		properties.setProperty("name", "apple");
		properties.setProperty("age", "10");
		properties.setProperty("color", "black");
		properties.store(new FileOutputStream("src\\mysql03.properties"), null);

		String name = properties.getProperty("name");
		int age = Integer.parseInt(properties.getProperty("age"));

		Dog1 dog1 = new Dog1(name, age, "black");

		//序列化
		String fileName = "d:\\dog1.dat";
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
		objectOutputStream.writeObject(dog1);
		objectOutputStream.close();
		System.out.println("序列化成功");


	}

	//反序列化
	@Test
	public void m1() throws IOException, ClassNotFoundException {
		String filename = "d:\\dog1.dat";

		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename));
		Dog1 dog1 = (Dog1) objectInputStream.readObject();
		System.out.println(dog1);

		objectInputStream.close();


	}
}

class Dog1 implements Serializable {
	private String name;
	private int age;

	private String color;

	public Dog1(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog1{" +
				       "name='" + name + '\'' +
				       ", age=" + age +
				       ", color='" + color + '\'' +
				       '}';
	}
}
