package com.yrd980.chapter17_;


import java.io.*;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BufferCopy_ {
	public static void main(String[] args) {
		String fileName = "d:\\a.txt";
		String destination = "d:\\a1.txt";
		BufferedReader br = null;
		BufferedWriter bw = null;
		String line = null;

		try {
			br = new BufferedReader(new FileReader(fileName));
			bw = new BufferedWriter(new FileWriter(destination));
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("拷贝完毕");
		

	}
}
