import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		File f = new File("word.txt");
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(f,false);//trueΪ׷�����ݣ�falseΪ��������
			String str = "������賿�ĵ����ɼ���";
			byte b[] = str.getBytes();// �ַ���ת��Ϊ�ֽ�����
			out.write(b);// ���ֽ������е�����д�뵽�ļ���
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		FileInputStream in =null;
		try {
			in=new FileInputStream(f);
			
			byte b2[]=new byte[1024];//������
			int len=in.read(b2);
			
			System.out.println(new String(b2,0,len));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
