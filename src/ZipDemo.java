import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipDemo {
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
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param zos
	 *            ѹ����
	 * @param base
	 *            �ļ���ѹ�����е�·��
	 * @param source
	 *            ��ѹ�����ļ�
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
				// ��ѹ�������������Ŀ
				zos.putNextEntry(new ZipEntry(base + source.getName()));
				while ((count = fis.read(buf)) != -1) {
					zos.write(buf, 0, count);
					zos.flush();
				}
				zos.closeEntry();// �ر���Ŀ
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	static void decompress(){
		File dir = new File("zip\\");
		File source = new File("F:\\Ztest.zip");
		byte[] buf =new byte[1024];
		ZipEntry entry=null;
		try(FileInputStream fis=new FileInputStream(source);
				ZipInputStream zis=new ZipInputStream(fis)){
			while(true){
				entry= zis.getNextEntry();
				if(entry==null){
					break;
				}
				if(entry.isDirectory()){
					continue;
				}
				
				File f=new File(dir,entry.getName());
				if(!f.getParentFile().exists()){//�����ѹ���ļ�������
					f.getParentFile().mkdirs();//����
				}
				int count=-1;
				FileOutputStream fos=new FileOutputStream(f);
				while((count=zis.read(buf))!=-1){
					fos.write(buf, 0, count);
					fos.flush();
				}
				fos.close();
				zis.closeEntry();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		compress();
		decompress();
	}
}
