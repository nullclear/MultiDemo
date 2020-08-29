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
		setTitle("ѡ����");
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
		
		JLabel lblDirections=new JLabel("ѡ�����ť");
		lblDirections.setHorizontalAlignment(SwingConstants.CENTER);
		lblDirections.setFont(new Font("΢���ź�",Font.BOLD,14));
		panel.add(lblDirections);
		
		rdbtnTop=new JRadioButton("ѡ��ڶ���");
		rdbtnTop.setSelected(true);
		rdbtnTop.setFont(new Font("΢���ź�",Font.PLAIN,14));
	}
}
