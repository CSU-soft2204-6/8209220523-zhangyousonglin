package com.yrd980.chapter17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class FileCopy_ {
	public static void main(String[] args) {
		//完成文件拷贝
		String filePath = "D:\\steam\\steamapps\\workshop\\content\\431960\\2179153203\\images\\14.jpg";
		String destnation = "d:\\14.png";
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		try {

			fileInputStream = new FileInputStream(filePath);
			fileOutputStream = new FileOutputStream(destnation);

			byte[] buffer = new byte[1024];
			int readlen = 0;
			while ((readlen = fileInputStream.read(buffer)) != -1) {
				fileOutputStream.write(buffer, 0, readlen);
			}
			System.out.println("successful");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
