package com.yrd980.chapter17;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class FileInputStream_ {
	public static void main(String[] args) {

	}

	@Test
	public void read01() throws IOException {

		String filePath = "D:\\hello.txt";
		int read = 0;
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(filePath);
			while ((read = fileInputStream.read()) != -1) {
				System.out.print((char) read);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			fileInputStream.close();
		}

	}

	//优化
	@Test
	public void read02() throws IOException {

		String filePath = "D:\\hello.txt";

		byte[] buffer = new byte[8];
		int readlen = 0;

		FileInputStream fileInputStream = null;
		try {
			//循环读取效率高
			fileInputStream = new FileInputStream(filePath);
			while ((readlen = fileInputStream.read(buffer)) != -1) {
				System.out.print(new String(buffer,0,readlen));
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			fileInputStream.close();
		}

	}
}
