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
	//字符流复制文件
	static public void copy(String sourcefile, String targetfile) {
		File source = new File(sourcefile);// 源文件
		File target = new File(targetfile);// 目标文件
		if (!source.exists()) {
			JOptionPane.showMessageDialog(null, "警告！文件"+source+"不存在", "警告", JOptionPane.WARNING_MESSAGE);
		}
		if (!target.exists()) {//如果目标文件不存在就创建一个
			try {
				target.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileReader fr = null;// 字符流读取
		BufferedReader br = null;// 缓冲字符流读取
		FileWriter fw = null;// 字符流写入
		BufferedWriter bw = null;// 缓冲字符流写入
		try {
			fr = new FileReader(source);
			br = new BufferedReader(fr);// 读取源文件

			fw = new FileWriter(target, false);// 不追加
			bw = new BufferedWriter(fw);// 写入到目标文件

			String tmp = "";// 暂存
			while ((tmp = br.readLine()) != null) {// 循环写入
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
	//字节流复制文件
	static public void copy2(String sourcefile, String targetfile) {
		File source = new File(sourcefile);// 源文件
		File target = new File(targetfile);// 目标文件
		if (!source.exists()) {
			JOptionPane.showMessageDialog(null, "警告！文件"+source+"不存在", "警告", JOptionPane.WARNING_MESSAGE);
		}
		if (!target.exists()) {
			try {
				target.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileInputStream fis = null;// 字节流读取
		BufferedInputStream bis = null;// 缓冲字节流读取

		FileOutputStream fos = null;// 字节流输出
		BufferedOutputStream bos = null;// 缓冲字节流输出

		try {
			fis = new FileInputStream(source);
			bis = new BufferedInputStream(fis);// 读取源文件

			fos = new FileOutputStream(target, false);
			bos = new BufferedOutputStream(fos);// 写入目标文件
			
			byte buf[]=new byte[1024];
			int count=-1;
			while ((count=bis.read(buf))!=-1) {
				bos.write(buf,0,count);
				bos.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (bos!=null) {
				try {
					bos.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (bis!=null) {
				try {
					bis.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
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
