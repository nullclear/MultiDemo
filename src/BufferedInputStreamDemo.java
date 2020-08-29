import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamDemo {
	public static void main(String[] args) {
		File f = new File("D:\\JDK1.8 API 中文文档 高清完整版 CHM\\jdk api 1.8_google\\jdk api 1.8_google.CHM");
		BufferedInputStream bi =null;
		FileInputStream in = null;
		long start=System.currentTimeMillis();
		try {
			in = new FileInputStream(f);
			bi =new BufferedInputStream(in);
			byte b[] = new byte[1024];//缓冲区字节数组
			while (bi.read(b)!=-1) {
				
			}
			long end=System.currentTimeMillis();
			System.out.println("经历了："+(end-start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
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
