package com.yrd980.chapter17;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class FileWriter_ {
	public static void main(String[] args) {

		String filePath = "d:\\note.txt";

		FileWriter fileWriter = null;
		char[] chars ={'a','b'};

		try {
			fileWriter = new FileWriter(filePath);
			//方法一
			fileWriter.write("h");
			//方法二
			fileWriter.write(chars);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("over");
	}
}
