import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("F:\\J2EE");
		File f[] = file.listFiles();
		for (File tmp : f) {
			if (tmp.isFile()) {
				System.out.println("文件：" + tmp.getName());
			} else if (tmp.isDirectory()) {
				System.out.println("文件夹：" + tmp.getName());
			}
		}
	}
}
