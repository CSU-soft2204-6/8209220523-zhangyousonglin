package com.yrd980.chapter17_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HomeWork02 {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = null;

		try {

			bufferedReader = new BufferedReader(new FileReader("d:\\contents.txt"));
			String line = null;
			int count = 1;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println((count++) + " " + line);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} finally {
			
			if (bufferedReader != null) {
				bufferedReader.close();
			}
		}
	}
}
