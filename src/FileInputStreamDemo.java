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
			out = new FileOutputStream(f,false);//true为追加内容，false为覆盖内容
			String str = "你见过凌晨四点的洛杉矶吗？";
			byte b[] = str.getBytes();// 字符串转换为字节数组
			out.write(b);// 将字节数组中的数据写入到文件中
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
			
			byte b2[]=new byte[1024];//缓冲区
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
