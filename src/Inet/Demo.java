package Inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo {
	public static void main(String[] args) {
		try {
			//InetAddress local =InetAddress.getLocalHost();//��ȡ����������ַ����
			InetAddress[] local=InetAddress.getAllByName("www.baidu.com");
			for (InetAddress inetAddress : local) {
				System.out.println(inetAddress.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
