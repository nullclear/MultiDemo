package swing;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DesktopDemo {

	public static void main(String[] args) {
		if (Desktop.isDesktopSupported()) {
			System.out.println("��ǰϵͳ֧�����漯�ɿؼ�");
		}
		Desktop d=Desktop.getDesktop();
		try {
			//d.browse(new URI("www.baidu.com"));
			d.open(new File("C:\\Users\\12061\\Desktop\\","javaѧϰ�ּ�.txt"));
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}
