package Inet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		try {
			Socket client = new Socket("127.0.0.1", 1100);// 创建套接字，指定服务器地址
			System.out.println("连接成功！");
			
			OutputStream out=client.getOutputStream();
			String message="服务器你好，我是客户端";
			out.write(message.getBytes());
			
			InputStream in=client.getInputStream();
			byte b[]=new byte[1024];
			int len=in.read(b);
			String data=new String(b,0,len);
			System.out.println("服务器发来消息："+data);
			
			client.close();
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
