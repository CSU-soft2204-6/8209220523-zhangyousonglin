package com.yrd980.chapter17_;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class InputStreamReader_ {
	public static void main(String[] args) throws IOException {
		String fileName = "d:\\a.txt";

		//解读先将FileInputStream转成InputStreamReader
		//指定编码方式
		//InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(fileName), "gbk");
		//转入处理流
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "gbk"));
		//读取
		String line = " ";
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		//
		br.close();
	}
}
