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
			String str="天行健，自强不息，厚德载物";
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
				//System.out.println("文件中的内容为："+new String(ch,0,count));
				System.out.println(tmp);
			}
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
