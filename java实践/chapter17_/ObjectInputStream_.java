package com.yrd980.chapter17_;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ObjectInputStream_ {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fileName = "d:\\data.dat";
		ObjectInputStream ois = null;

		ois = new ObjectInputStream(new FileInputStream(fileName));

		System.out.println(ois.readInt());
		System.out.println(ois.readBoolean());
		System.out.println(ois.readChar());
		System.out.println(ois.readDouble());
		System.out.println(ois.readUTF());
		Object dog = ois.readObject();
		System.out.println("dog=" + dog.getClass());
		System.out.println(dog);

		ois.close();
		System.out.println("反序列化");
	}
}

