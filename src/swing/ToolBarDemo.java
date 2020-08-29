package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class ToolBarDemo extends JFrame{
	public ToolBarDemo(){
		super();
		setTitle("¹¤¾ßÀ¸");
		setLocationRelativeTo(null);
		setSize(500, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		JButton newButton=new JButton("create");
		JButton saveButton=new JButton("save");
		JButton exitButton=new JButton("exit");
		
		JToolBar tool=new JToolBar();
		c.add(tool, BorderLayout.NORTH);
		tool.add(newButton);
		tool.addSeparator();
		tool.add(saveButton);
		tool.addSeparator(new Dimension(20, 0));
		tool.add(exitButton);
		
		tool.setFloatable(false);
	}
	public static void main(String[] args) {
		ToolBarDemo tool=new ToolBarDemo();
		tool.setVisible(true);
	}
}
