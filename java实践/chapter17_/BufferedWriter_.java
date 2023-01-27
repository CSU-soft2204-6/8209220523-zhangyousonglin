package com.yrd980.chapter17_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BufferedWriter_ {
	public static void main(String[] args) throws IOException {
		String filePath = "d:\\a.txt";

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
		bufferedWriter.write("hello");
		bufferedWriter.newLine();
		bufferedWriter.write("ok");
		bufferedWriter.newLine();
		bufferedWriter.close();
	}
}
