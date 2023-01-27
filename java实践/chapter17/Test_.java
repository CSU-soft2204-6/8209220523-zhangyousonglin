package com.yrd980.chapter17;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Test_ {
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new FileReader());
		//bufferedReader.readFiles();
		//bufferedReader.readFiles(1);
		bufferedReader.read();
		bufferedReader.reads(1);
		BufferedReader bufferedReader1 = new BufferedReader(new StringReader());
		//bufferedReader1.readStrings(1);
		bufferedReader1.read();
	}
}
