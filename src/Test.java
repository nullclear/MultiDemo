import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	private static void p() {
		File f = new File("F:\\A.jpg");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ByteArrayOutputStream baos = null;
		byte[] bytes;

		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			baos = new ByteArrayOutputStream(1024);

			byte[] b = new byte[1024];
			int count = -1;
			while ((count = bis.read(b)) != -1) {
				baos.write(b, 0, count);
			}
			bytes = baos.toByteArray();
			fos = new FileOutputStream("F:\\B.jpg");
			fos.write(bytes, 0, bytes.length);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			if (baos != null) {
				try {
					baos.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		p();
	}

}
