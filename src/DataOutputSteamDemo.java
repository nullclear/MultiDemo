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
			dos.writeUTF("这是写入字符串数据");
			dos.writeDouble(3.14);// 写入浮点型数据
			dos.writeBoolean(true);// bool
			dos.writeInt(123);// 写入整型数据
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}

	}
}
