package com.yrd980.chapter17;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class FileReader_ {
	public static void main(String[] args) throws IOException {
		String fileName = "d:\\a.txt";
		int data = 0;

		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
			while ((data = fileReader.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println();

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

	}
	@Test
	public void file(){
		String fileName = "d:\\a.txt";
		int readlen = 0;
		char[] buffer = new char[8];

		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
			while ((readlen = fileReader.read(buffer)) != -1) {
				System.out.print(new String(buffer,0,readlen));
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
