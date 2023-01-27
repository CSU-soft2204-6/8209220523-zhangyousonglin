package com.yrd980.chapter17_;

import java.io.*;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BufferCopy02 {
	public static void main(String[] args) {
		String srcFile = "d:\\14.png";
		String destnation = "d:\\15.png";

		BufferedInputStream bi = null;
		BufferedOutputStream bo = null;

		try {
			bi = new BufferedInputStream(new FileInputStream(srcFile));
			bo = new BufferedOutputStream(new FileOutputStream(destnation));
			byte[] buf = new byte[1024];
			int readlen = 0;
			while ((readlen = bi.read(buf)) != -1) {
				bo.write(buf, 0, readlen);
			}
			System.out.println("ok");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bo != null) {
					bo.close();
				}
				if (bi != null) {
					bi.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
