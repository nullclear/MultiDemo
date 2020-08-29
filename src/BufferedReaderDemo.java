import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		File f = new File("word2.txt");
//		FileWriter fw = null;
//		BufferedWriter bw = null;
//		try {
//			fw = new FileWriter(f);
//			bw = new BufferedWriter(fw);// �ļ��ַ��������װ�ɻ����ַ���
//
//			String str = "������ô��";
//			String str2 = "����ȥ����";
//			bw.write(str);
//			bw.newLine();
//			bw.write(str2);
//		} catch (IOException e) {
//			// TODO �Զ����ɵ� catch ��
//			e.printStackTrace();
//		} finally {
//			if (bw != null) {
//				try {
//					bw.close();
//				} catch (IOException e) {
//					// TODO �Զ����ɵ� catch ��
//					e.printStackTrace();
//				}
//			}
//			if (fw != null) {
//				try {
//					fw.close();
//				} catch (IOException e) {
//					// TODO �Զ����ɵ� catch ��
//					e.printStackTrace();
//				}
//			}
//
//		}

		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr=new FileReader(f);
			br=new BufferedReader(fr);
			String tmp="";
			int i=1;
			while((tmp=br.readLine())!=null){//ѭ����ȡ�ļ�
				System.out.println("��"+(i++)+"�У�"+tmp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
