package com.yrd980.chapter17;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class FileInfo {
	public static void main(String[] args) {

	}

	@Test
	//获取文件信息
	public void info(){
		//先创建对象
		File file = new File("d:\\news01.txt");

		//调用相关方法得到对应信息
		System.out.println("file name = "+file.getName());

		System.out.println("absolute path = "+file.getAbsolutePath());

		System.out.println("file content ="+file.length());
	}
}
