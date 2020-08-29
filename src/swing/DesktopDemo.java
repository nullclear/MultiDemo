package swing;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DesktopDemo {

	public static void main(String[] args) {
		if (Desktop.isDesktopSupported()) {
			System.out.println("当前系统支持桌面集成控件");
		}
		Desktop d=Desktop.getDesktop();
		try {
			//d.browse(new URI("www.baidu.com"));
			d.open(new File("C:\\Users\\12061\\Desktop\\","java学习手记.txt"));
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
