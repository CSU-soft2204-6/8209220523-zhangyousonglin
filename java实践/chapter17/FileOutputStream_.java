package com.yrd980.chapter17;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class FileOutputStream_ {
	public static void main(String[] args) {

	}
	@Test
	public void writeFile() throws IOException {

		//io流都不安全所以都是异常处理
		String filePath = "d:\\a.txt";

		FileOutputStream fileOutputStream = null;

		try {
			fileOutputStream = new FileOutputStream(filePath);

			//写入一个字节
			//fileOutputStream.write('a');
			String str = "hello";
			fileOutputStream.write(str.getBytes());

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}finally {
		    fileOutputStream.close();
		}

	}
}
