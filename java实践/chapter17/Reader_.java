package com.yrd980.chapter17;


/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public abstract class Reader_ {

	public abstract void read();

}

class BufferedReader extends Reader_ {
	private Reader_ reader_;

	public BufferedReader(Reader_ reader_) {
		this.reader_ = reader_;
	}

	public void read() {
		reader_.read();
	}

	public void reads(int num) {
	    for (int i = 0; i < num; i++) {
	        reader_.read();
	    }
	}
}

class FileReader extends Reader_ {

	public void read() {
		System.out.println("对文件进行读取。。。");
	}

}

class StringReader extends Reader_ {

	public void read() {
		System.out.println("读取字符串。。。");
	}
}
