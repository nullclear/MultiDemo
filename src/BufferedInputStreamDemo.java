import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamDemo {
	public static void main(String[] args) {
		File f = new File("D:\\JDK1.8 API �����ĵ� ���������� CHM\\jdk api 1.8_google\\jdk api 1.8_google.CHM");
		BufferedInputStream bi =null;
		FileInputStream in = null;
		long start=System.currentTimeMillis();
		try {
			in = new FileInputStream(f);
			bi =new BufferedInputStream(in);
			byte b[] = new byte[1024];//�������ֽ�����
			while (bi.read(b)!=-1) {
				
			}
			long end=System.currentTimeMillis();
			System.out.println("�����ˣ�"+(end-start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			if(bi!=null){
				try {
					bi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
