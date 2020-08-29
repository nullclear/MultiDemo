package swing;

import java.awt.AWTException;
import java.awt.Container;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;

import javax.imageio.ImageIO;
import javax.swing.*;

public class TrayIconDemo extends JFrame{
	public TrayIconDemo(){
		super();
		setTitle("���Ƹ��Ի��˵���");
		setLocationRelativeTo(null);
		setSize(500, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		PopupMenu menu=new PopupMenu();
		menu.add(new MenuItem("��"));
		menu.add(new MenuItem("�뿪"));
		
		ImageIcon icon=new ImageIcon("src/3.png");
		icon.setImage(icon.getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT));
		
		TrayIcon tray=new TrayIcon(icon.getImage(), "����", menu);
		SystemTray system=SystemTray.getSystemTray();
		try {
			system.add(tray);
		} catch (AWTException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		TrayIconDemo tray=new TrayIconDemo();
		tray.setVisible(true);
	}

}
