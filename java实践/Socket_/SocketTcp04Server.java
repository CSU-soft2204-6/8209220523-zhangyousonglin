package com.yrd980.API_.Socket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SocketTcp04Server {
	public static void main(String[] args) throws Exception {
		//服务器监听8888端口
		ServerSocket serverSocket = new ServerSocket(8888);
		System.out.println("服务器监听8888端口");
		//等待连接
		Socket socket = serverSocket.accept();

		//读取客户端数据
		BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
		byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

		//将所得写入指定文件
		String destPath = "src\\16.png";
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destPath));
		bufferedOutputStream.write(bytes);
		bufferedOutputStream.close();

		//向客户端回应收到
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		writer.write("收到图片");
		writer.flush();
		socket.shutdownOutput();

		//关闭
		writer.close();
		bufferedInputStream.close();
		socket.close();
		serverSocket.close();

	}
}
