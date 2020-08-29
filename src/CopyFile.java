import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class CopyFile {
	//�ַ��������ļ�
	static public void copy(String sourcefile, String targetfile) {
		File source = new File(sourcefile);// Դ�ļ�
		File target = new File(targetfile);// Ŀ���ļ�
		if (!source.exists()) {
			JOptionPane.showMessageDialog(null, "���棡�ļ�"+source+"������", "����", JOptionPane.WARNING_MESSAGE);
		}
		if (!target.exists()) {//���Ŀ���ļ������ھʹ���һ��
			try {
				target.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileReader fr = null;// �ַ�����ȡ
		BufferedReader br = null;// �����ַ�����ȡ
		FileWriter fw = null;// �ַ���д��
		BufferedWriter bw = null;// �����ַ���д��
		try {
			fr = new FileReader(source);
			br = new BufferedReader(fr);// ��ȡԴ�ļ�

			fw = new FileWriter(target, false);// ��׷��
			bw = new BufferedWriter(fw);// д�뵽Ŀ���ļ�

			String tmp = "";// �ݴ�
			while ((tmp = br.readLine()) != null) {// ѭ��д��
				bw.write(tmp);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	//�ֽ��������ļ�
	static public void copy2(String sourcefile, String targetfile) {
		File source = new File(sourcefile);// Դ�ļ�
		File target = new File(targetfile);// Ŀ���ļ�
		if (!source.exists()) {
			JOptionPane.showMessageDialog(null, "���棡�ļ�"+source+"������", "����", JOptionPane.WARNING_MESSAGE);
		}
		if (!target.exists()) {
			try {
				target.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileInputStream fis = null;// �ֽ�����ȡ
		BufferedInputStream bis = null;// �����ֽ�����ȡ

		FileOutputStream fos = null;// �ֽ������
		BufferedOutputStream bos = null;// �����ֽ������

		try {
			fis = new FileInputStream(source);
			bis = new BufferedInputStream(fis);// ��ȡԴ�ļ�

			fos = new FileOutputStream(target, false);
			bos = new BufferedOutputStream(fos);// д��Ŀ���ļ�
			
			byte buf[]=new byte[1024];
			int count=-1;
			while ((count=bis.read(buf))!=-1) {
				bos.write(buf,0,count);
				bos.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (bos!=null) {
				try {
					bos.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			if (bis!=null) {
				try {
					bis.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		//copy("source.txt", "target.txt");
		copy2("F:\\A.jpg", "F:\\B.jpg");
	}

}
