package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class KeyDemo extends JFrame{
	JTextField textField;
	JButton btnA;
	JButton btnB;
	JButton btnC;
	public KeyDemo(){
		super();
		setTitle("定制个性化菜单栏");
		setLocationRelativeTo(null);
		setSize(500, 375);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		
		btnA=new JButton("A");
		btnA.setBackground(Color.WHITE);
		btnA.setBounds(0, 0, 50, 50);
		c.add(btnA);
		
		btnB=new JButton("B");
		btnB.setBackground(Color.WHITE);
		btnB.setBounds(60, 0, 50, 50);
		c.add(btnB);
		
		btnC=new JButton("C");
		btnC.setBackground(Color.WHITE);
		btnC.setBounds(120, 0, 50, 50);
		c.add(btnC);
		
		
		textField=new JTextField();
		textField.setColumns(10);
		textField.setBounds(0, 60, 170, 30);
		c.add(textField);
		
		
		List<JButton> list=new ArrayList<>();
		Component items[]=c.getComponents();
		
		for (Component com : items) {
			if (com instanceof JButton) {
				list.add((JButton)com);
			}
		}
		
		textField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO 自动生成的方法存根
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
//				int code=e.getKeyCode();
//				switch (code) {
//				case KeyEvent.VK_A:
//					btnA.setBackground(Color.WHITE);
//					break;
//
//				default:
//					break;
//				}
				char ch=e.getKeyChar();
				for (JButton btn : list) {
					String btnText=btn.getText();
					if (btnText.equalsIgnoreCase(String.valueOf(ch))) {
						btn.setBackground(Color.WHITE);
					}
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
//				int code=e.getKeyCode();
//				switch (code) {
//				case KeyEvent.VK_A:
//					btnA.setBackground(Color.GREEN);
//					break;
//
//				default:
//					break;
//				}
				char ch=e.getKeyChar();
				for (JButton btn : list) {
					String btnText=btn.getText();
					if (btnText.equalsIgnoreCase(String.valueOf(ch))) {
						btn.setBackground(Color.GREEN);
					}
				}
			}
		});
		
	}
	public static void main(String[] args) {
		KeyDemo k=new KeyDemo();
		k.setVisible(true);
	}

}
