package com.yrd980.API_.Socket_;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SocketTCP04Client {
	public static void main(String[] args) throws Exception {
		//客户端连接服务端8888得到socket对象
		Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
		//创建读入磁盘的输入流
		String filePath = "D:\\15.png";
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
		//调用工具包
		byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
		//通过socket获得输入流将bytes数据发送服务端
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
		bufferedOutputStream.write(bytes);//传文件
		bufferedInputStream.close();
		//结束标记
		socket.shutdownOutput();

		//接受从服务端的消息
		InputStream input = socket.getInputStream();
		String s = StreamUtils.streamToString(input);
		System.out.println(s);

		//关闭
		bufferedOutputStream.close();
		socket.close();
	}
}
