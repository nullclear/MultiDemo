import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		File f = new File("word.txt");
		/*FileWriter fw=null;
		try {
			fw =new FileWriter(f,true);
			String str="���н�����ǿ��Ϣ���������";
			fw.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}*/
		
		FileReader fr =null;
		try {
			fr=new FileReader(f);
			char ch[]=new char[1024];
			String tmp="";
			int count;
			while ((count=fr.read(ch))!=-1) {
				tmp=String.valueOf(ch,0,count);
				//System.out.println("�ļ��е�����Ϊ��"+new String(ch,0,count));
				System.out.println(tmp);
			}
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
}
