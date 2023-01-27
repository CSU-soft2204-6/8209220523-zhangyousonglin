package com.yrd980.chapter17_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Properties01 {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\mysql.properties"));
		String line = " ";
		while ((line = bufferedReader.readLine()) != null) {
			String[] split = line.split("=");
			System.out.println(split[0] + " " + split[1]);
		}
		bufferedReader.close();
	}
}
