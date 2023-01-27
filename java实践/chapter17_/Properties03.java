package com.yrd980.chapter17_;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Properties03 {
	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();

		properties.setProperty("charset", "utf-8");
		properties.setProperty("user", "Tom");
		properties.setProperty("psw", "abc111");

		properties.store(new FileOutputStream("src\\mysql02.properties"), null);
		System.out.println("successful");

	}
}
