import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipDD {
	static void compress() {
		File source = new File("F:\\Test\\");
		File target = new File("F:\\Ztest.zip");
		try (FileOutputStream fos = new FileOutputStream(target); ZipOutputStream zos = new ZipOutputStream(fos)) {
			if (source.isDirectory()) {
				for (File f : source.listFiles()) {
					addEntry(zos, "", f);
				}
			} else {
				addEntry(zos, "", source);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param zos-压缩流
	 * @param base-文件在压缩包中的路径
	 * @param source-被压缩文件
	 */
	static void addEntry(ZipOutputStream zos, String base, File source) {
		if (source.isDirectory()) {
			for (File file : source.listFiles()) {
				addEntry(zos, base + source.getName() + File.separator, file);
			}
		} else {
			byte buf[] = new byte[1024];
			try (FileInputStream fis = new FileInputStream(source)) {
				int count = -1;
				zos.putNextEntry(new ZipEntry(base + source.getName()));
				while ((count = fis.read(buf)) != -1) {
					zos.write(buf, 0, count);
					zos.flush();
				}
				zos.closeEntry();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		compress();
	}

}
