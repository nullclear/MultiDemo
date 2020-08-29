package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.*;

public class WindowFocusDemo extends JFrame{

	public WindowFocusDemo(){
		super();
		setTitle("-----");
		setLocationRelativeTo(null);
		setSize(500, 375);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JPanel panel=new JPanel();
		panel.setBounds(100, 100, 100, 100);
		panel.setBorder(BorderFactory.createLineBorder(Color.red, 3));
		panel.setBackground(Color.WHITE);
		c.add(panel);
		
		JLabel label=new JLabel();
		panel.add(label);
		addWindowFocusListener(new WindowFocusListener() {
			
			@Override
			public void windowLostFocus(WindowEvent e) {
				label.setIcon(new ImageIcon("src/1.png"));
			}
			
			@Override
			public void windowGainedFocus(WindowEvent e) {
				label.setIcon(new ImageIcon("src/3.png"));
			}
		});
	}
	public static void main(String[] args) {
		WindowFocusDemo w=new WindowFocusDemo();
		w.setVisible(true);
	}

}
