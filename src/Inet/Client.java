package Inet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		try {
			Socket client = new Socket("127.0.0.1", 1100);// �����׽��֣�ָ����������ַ
			System.out.println("���ӳɹ���");
			
			OutputStream out=client.getOutputStream();
			String message="��������ã����ǿͻ���";
			out.write(message.getBytes());
			
			InputStream in=client.getInputStream();
			byte b[]=new byte[1024];
			int len=in.read(b);
			String data=new String(b,0,len);
			System.out.println("������������Ϣ��"+data);
			
			client.close();
		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}
