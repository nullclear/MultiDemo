package DRAW;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DrawScaledDemo extends JFrame {
	int num=0;
	public DrawScaledDemo() {
		setTitle("-----");
		setBounds(100, 100, 800, 600);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();

		JPanel panel = new JPanel();
		c.add(panel, BorderLayout.SOUTH);

		JButton btn1 = new JButton("∑≈¥Û");
		JButton btn2 = new JButton("Àı–°");
		panel.add(btn1);
		panel.add(new JLabel("       "));
		panel.add(btn2);
		MyCanvas mc= new MyCanvas();
		c.add(mc);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num+=20;
				mc.repaint();
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num-=20;
				mc.repaint();
			}
		});
		
		setVisible(true);
	}

	private class MyCanvas extends Canvas {
		@Override
		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			Image img = new ImageIcon("src/3.png").getImage();
			int imgWidth=img.getWidth(this);
			int imgHeight=img.getHeight(this);
			g2.drawImage(img, 0, 0, imgWidth+num, imgHeight+num, this);
		}
	}

	public static void main(String[] args) {
		new DrawScaledDemo();

	}

}
