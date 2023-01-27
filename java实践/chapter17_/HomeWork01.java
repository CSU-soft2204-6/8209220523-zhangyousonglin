package com.yrd980.chapter17_;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HomeWork01 {
	public static void main(String[] args) throws IOException {

		String directoryPath = "d:\\temp";
		File file = new File(directoryPath);
		if (!file.exists()) {
			if (file.mkdirs()) {
				System.out.println("successful");
			} else {
				System.out.println("failure");
			}
		}

		String fileName = directoryPath + "\\hello.txt";
		File file1 = new File(fileName);
		if (!file1.exists()) {
			if (file1.createNewFile()) {
				System.out.println("create");

			} else {
				System.out.println(file1 + "fail");
			}
		} else {
			System.out.println("existed");
		}
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
		bufferedWriter.write("hello");
		bufferedWriter.close();
	}
}
