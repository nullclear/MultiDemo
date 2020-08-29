package swing;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class MenuDemo extends JFrame{

	public MenuDemo(){
		super();
		setTitle("定制个性化菜单栏");
		setLocationRelativeTo(null);
		setSize(500, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon=new ImageIcon("src/3.png");
		icon.setImage(icon.getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT));
		
		JMenuBar menuBar=new JMenuBar();//菜单栏
		setJMenuBar(menuBar);//给窗体添加菜单栏
		
		JMenu menu1=new JMenu("File(F)");
		menu1.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu1);
		
		JMenuItem newMenu = new JMenuItem("create");
		newMenu.addActionListener(new ItemListener());
		menu1.add(newMenu);
		
		JMenu openMenu=new JMenu("open");
		menu1.add(openMenu);
		
		JMenuItem openNewFile=new JMenuItem("openNewFile");
		JMenuItem openOldFile=new JMenuItem("openOldFile");
		openOldFile.setEnabled(false);
		openNewFile.addActionListener(new ItemListener());
		openOldFile.addActionListener(new ItemListener());

		openMenu.add(openNewFile);
		openMenu.add(openOldFile);

		JMenuItem saveMenu=new JMenuItem("save");
		saveMenu.addActionListener(new ItemListener());

		menu1.add(saveMenu);
		
		menu1.addSeparator();
		JMenuItem exitMenu=new JMenuItem("exit");
		exitMenu.addActionListener(new ItemListener());

		menu1.add(exitMenu);
		
		newMenu.setIcon(icon);
	}
	public static void main(String[] args) {
		MenuDemo md=new MenuDemo();
		md.setVisible(true);
	}

	private class ItemListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			JMenuItem item=(JMenuItem) e.getSource();
			System.out.println("you clik :"+item.getText());
		}
		
	}
}
