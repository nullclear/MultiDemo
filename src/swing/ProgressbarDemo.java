package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressbarDemo extends JFrame {
	JProgressBar bar2;

	public ProgressbarDemo() {
		super();
		setTitle("定制个性化菜单栏");
		setLocationRelativeTo(null);
		setSize(500, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		JProgressBar bar1 = new JProgressBar();
		bar1.setIndeterminate(true);
		bar1.setStringPainted(true);
		bar1.setString("loading....");

		bar2 = new JProgressBar();
		bar2.setIndeterminate(false);
		bar2.setStringPainted(true);
		
		c.add(bar1, BorderLayout.NORTH);
		c.add(bar2, BorderLayout.SOUTH);
		
		Mythread t=new Mythread();
		t.start();
		
		setContentPane(c);
	}

	public static void main(String[] args) {
		ProgressbarDemo bar = new ProgressbarDemo();
		bar.setVisible(true);
	}

	class Mythread extends Thread {
		@Override
		public void run() {
			for (int i = 0; i <=100; i++) {
				bar2.setValue(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
