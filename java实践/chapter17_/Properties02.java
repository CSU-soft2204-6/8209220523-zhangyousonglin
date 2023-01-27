package com.yrd980.chapter17_;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Properties02 {
	public static void main(String[] args) throws IOException {
		//使用 properties 来读取 mysql.properties文件

		//创建properties对象
		Properties properties = new Properties();
		//加载指定文件
		properties.load(new FileReader("src\\mysql.properties"));
		//把k-v显示控制台
		properties.list(System.out);
		String user = properties.getProperty("user");
		System.out.println(user);
	}
}
