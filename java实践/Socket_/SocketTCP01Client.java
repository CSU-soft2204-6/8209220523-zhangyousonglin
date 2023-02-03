package com.yrd980.API_.Socket_;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SocketTCP01Client {
	public static void main(String[] args) throws IOException {
		//连接服务器（IP，端口）
		Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
		System.out.println("客户端 socket返回=" + socket.getClass());
		//连接后生成Socket 通过socket.getOutputStream()获得关联对象
		//编译类型是抽象而运行类型socketOutputStream向下转型父类引用指向子类对象
		OutputStream outputStream = socket.getOutputStream();
		//通过输出流写入数据到数据通道
		outputStream.write("hello,server".getBytes());
		//关闭
		outputStream.close();
		socket.close();
		System.out.println("客户端退出");
	}
}
