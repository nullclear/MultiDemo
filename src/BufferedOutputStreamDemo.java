import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
	public static void main(String[] args) {
		File f = new File("word.txt");
		BufferedOutputStream bo=null;
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(f);
			bo =new BufferedOutputStream(out);
			String str = "�����Ҳı����ã�ǧ��ɢ��������";
			byte b[] = str.getBytes();
			bo.write(b);
//			bo.flush();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			if (bo != null) {
				try {
					bo.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			
		}

	}
}
