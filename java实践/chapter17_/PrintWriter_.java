package com.yrd980.chapter17_;

import java.io.PrintWriter;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class PrintWriter_ {
	public static void main(String[] args) {
		PrintWriter printWriter = new PrintWriter(System.out);
		printWriter.println("hello");
		printWriter.close();
	}
}
