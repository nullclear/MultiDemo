import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputSteamDemo {
	public static void main(String[] args) {
		File f = new File("word.txt");
		FileOutputStream out = null;
		DataOutputStream dos = null;
		try {
			out = new FileOutputStream(f);
			dos = new DataOutputStream(out);
			dos.writeUTF("����д���ַ�������");
			dos.writeDouble(3.14);// д�븡��������
			dos.writeBoolean(true);// bool
			dos.writeInt(123);// д����������
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			if (dos != null) {
				try {
					dos.close();
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

		DataInputStream dis = null;
		FileInputStream in = null;
		try {
			in = new FileInputStream(f);
			dis = new DataInputStream(in);
			
			System.out.println("readUtf:"+dis.readUTF());
			System.out.println("readDouble:"+dis.readDouble());
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}

	}
}
