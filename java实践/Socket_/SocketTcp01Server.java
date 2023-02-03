package com.yrd980.API_.Socket_;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SocketTcp01Server {
	public static void main(String[] args) throws IOException {

		//在本机9999端口监听等待连接
		//细节ServerSocket 可以通过多个socket（）返回多个【多个服务器的并发称为多并发】

		ServerSocket serverSocket = new ServerSocket(9999);
		//细节必须是空的否则会抛异常
		System.out.println("服务器在9999端口监听等待连接");
		//在没有客户端连接9999端口时会阻塞等待连接
		Socket socket = serverSocket.accept();
		//范围0~2^16-1
		System.out.println("服务器端 socket= " + socket.getClass());

		//通过socket.getInputStream()读取客户端写入数据通道的数据并显示
		InputStream inputStream = socket.getInputStream();
		//IO读取
		byte[] buff = new byte[1024];
		int readlen = 0;
		while ((readlen = inputStream.read(buff)) != -1) {
			System.out.println(new String(buff, 0, readlen));
			//根据读取到的实际长度显示字符串
		}
		//关闭
		inputStream.close();
		socket.close();
		serverSocket.close();
		System.out.println("服务器端退出");
	}
}
