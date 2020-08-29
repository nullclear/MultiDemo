package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MouseDemo extends JFrame{
	public MouseDemo(){
		super();
		setTitle("-----");
		setLocationRelativeTo(null);
		setSize(500, 375);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JLabel label=new JLabel();
		label.setBounds(250, 50, 100, 100);
		label.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
		c.add(label);
		
		JScrollPane sc=new JScrollPane();
		sc.setBounds(20, 20, 200, 200);
		c.add(sc);
		
		JTextArea textArea=new JTextArea();
		sc.setViewportView(textArea);
		
		JLabel label2=new JLabel("鼠标点击区域");
		label2.setBounds(260, 20, 80, 20);
		c.add(label2);
		
		label.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.append("鼠标释放组件\n");					
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.append("鼠标按下组件\n");				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				textArea.append("鼠标离开组件\n");				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				textArea.append("鼠标进入组件\n");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.append("鼠标点击组件\n");
				int btn=e.getButton();
				switch (btn) {
				case MouseEvent.BUTTON1:
					textArea.append("点击了鼠标左键\n");
					break;
				case MouseEvent.BUTTON2:
					textArea.append("点击了鼠标滚轮\n");
					break;
				case MouseEvent.BUTTON3:
					textArea.append("点击了鼠标右键\n");
					break;

				default:
					break;
				}
			}
		});
		
	}
	public static void main(String[] args) {
		MouseDemo m=new MouseDemo();
		m.setVisible(true);
	}
}
