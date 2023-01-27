package com.yrd980.chapter17_;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class OutputStreamWriter_ {
	public static void main(String[] args) throws IOException {
		String filename = "d:\\a2.txt";

		BufferedWriter bufferedWriter = new BufferedWriter
				                                (new OutputStreamWriter(new FileOutputStream(filename), "utf-8"));
		bufferedWriter.write("你好");
		System.out.println("done");
		bufferedWriter.close();
	}
}
