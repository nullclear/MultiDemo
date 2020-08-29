package swing;

import java.awt.*;
import javax.swing.*;

public class JSplitPaneDemo extends JFrame{
	public JSplitPaneDemo(){
		super();//初始化父类JFrame
		setTitle("分割面板");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();//获得容器
		
		JSplitPane jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true);
		c.add(jsp,BorderLayout.CENTER);
		jsp.setLeftComponent(new JLabel("我是左边"));
		
		JSplitPane rjsp=new JSplitPane(JSplitPane.VERTICAL_SPLIT,true);
		jsp.setRightComponent(rjsp);
		
		rjsp.setBorder(BorderFactory.createLineBorder(Color.RED));
		rjsp.setOneTouchExpandable(true);
		rjsp.setLeftComponent(new JLabel("我是上边"));
		rjsp.setRightComponent(new JLabel("我是下边"));
		
	}
	public static void main(String[] args) {
		JSplitPaneDemo jspd=new JSplitPaneDemo();
		jspd.setVisible(true);
	}

}
