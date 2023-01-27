package com.yrd980.chapter17_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class OutputStream_ {
	public static void main(String[] args) throws IOException {
		String srcPath = "d:\\data.dat";

		ObjectOutputStream objectOutputStream = null;
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream(srcPath));
		} catch (IOException e) {
			e.printStackTrace();
		}

		objectOutputStream.writeInt(100);
		objectOutputStream.writeBoolean(true);
		objectOutputStream.writeChar('a');
		objectOutputStream.writeDouble(9.5);
		objectOutputStream.writeUTF("宇");
		objectOutputStream.writeObject(new Dog("apple", 12));

		objectOutputStream.close();
		System.out.println("序列化");

	}
}

class Dog implements Serializable {
	private String name;
	private int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Dog{" +
				       "name='" + name + '\'' +
				       ", age=" + age +
				       '}';
	}
}
