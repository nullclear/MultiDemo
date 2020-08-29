package swing;

import java.awt.*;
import javax.swing.*;

public class JSplitPaneDemo extends JFrame{
	public JSplitPaneDemo(){
		super();//��ʼ������JFrame
		setTitle("�ָ����");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();//�������
		
		JSplitPane jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true);
		c.add(jsp,BorderLayout.CENTER);
		jsp.setLeftComponent(new JLabel("�������"));
		
		JSplitPane rjsp=new JSplitPane(JSplitPane.VERTICAL_SPLIT,true);
		jsp.setRightComponent(rjsp);
		
		rjsp.setBorder(BorderFactory.createLineBorder(Color.RED));
		rjsp.setOneTouchExpandable(true);
		rjsp.setLeftComponent(new JLabel("�����ϱ�"));
		rjsp.setRightComponent(new JLabel("�����±�"));
		
	}
	public static void main(String[] args) {
		JSplitPaneDemo jspd=new JSplitPaneDemo();
		jspd.setVisible(true);
	}

}
