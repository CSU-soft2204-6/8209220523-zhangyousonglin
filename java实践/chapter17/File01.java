package com.yrd980.chapter17;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class File01 {
	public static void main(String[] args) {

	}
	@Test
	public void create01()  {
		String filePath = "D:\\news01.txt";
		File file = new File(filePath);

		try {
			file.createNewFile();
			System.out.println("successful create ");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
	@Test
	public void create02(){
		File parantFile = new File("d:\\");
		String name = "news02.txt";

		File file = new File(parantFile, name);

		try {
			file.createNewFile();
			System.out.println("ok");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}


	@Test
	public void create03(){
		String parantPath = "d:\\";
		String childPath = "news03.txt";

		File file = new File(parantPath,childPath);
		try {
			file.createNewFile();
			System.out.println("access");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
