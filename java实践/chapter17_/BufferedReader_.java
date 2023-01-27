package com.yrd980.chapter17_;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BufferedReader_ {
	public static void main(String[] args) throws Exception{
		String filePath = "d:\\note.txt";

		BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
		String line = null;
		while ((line = bufferedReader.readLine())!=null){
			System.out.println(line);
		}
		bufferedReader.close();

	}
}
