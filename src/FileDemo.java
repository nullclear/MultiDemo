import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("F:\\J2EE");
		File f[] = file.listFiles();
		for (File tmp : f) {
			if (tmp.isFile()) {
				System.out.println("�ļ���" + tmp.getName());
			} else if (tmp.isDirectory()) {
				System.out.println("�ļ��У�" + tmp.getName());
			}
		}
	}
}
