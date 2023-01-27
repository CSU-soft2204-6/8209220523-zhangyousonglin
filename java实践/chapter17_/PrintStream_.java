package com.yrd980.chapter17_;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class PrintStream_ {
	public static void main(String[] args) throws IOException {

		PrintStream out = System.out;

		out.println("hello");
		out.write("ok".getBytes());
		
		out.close();
	}
}
