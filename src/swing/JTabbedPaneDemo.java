package swing;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class JTabbedPaneDemo extends JFrame{
	private JRadioButton rdbtnTop;
	private AbstractButton rdbtnDown;
	private JRadioButton rdbtnLeft;
	private AbstractButton rdbtnRight;
	private AbstractButton rdbtnWrap;
	private AbstractButton rdbtnScroll;
	private JPanel contentPane;

	JTabbedPane tab;
	public static void main(String[] args) {
		JTabbedPaneDemo jtp=new JTabbedPaneDemo();
		jtp.setVisible(true);

	}

	public JTabbedPaneDemo(){
		super();
		setTitle("选项卡面板");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane =new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		tab=new JTabbedPane();
		contentPane.add(tab,BorderLayout.CENTER);
		setContentPane(contentPane);
	}
	
	private void buttonInit(){
		JPanel panel=new JPanel();
		contentPane.add(panel,BorderLayout.WEST);
		
		JLabel lblDirections=new JLabel("选项卡方向按钮");
		lblDirections.setHorizontalAlignment(SwingConstants.CENTER);
		lblDirections.setFont(new Font("微软雅黑",Font.BOLD,14));
		panel.add(lblDirections);
		
		rdbtnTop=new JRadioButton("选项卡在顶部");
		rdbtnTop.setSelected(true);
		rdbtnTop.setFont(new Font("微软雅黑",Font.PLAIN,14));
	}
}
