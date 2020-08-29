package swing;

import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class WindowDemo extends JFrame{
	public WindowDemo(){
		setTitle("-----");
		setLocationRelativeTo(null);
		setSize(500, 375);
		setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		
		addWindowListener(new myWindowListener());
	}
	
	class myWindowListener implements WindowListener{
		@Override
		public void windowOpened(WindowEvent e) {
			// TODO 自动生成的方法存根
			System.out.println("windowOpened");
		}
		
		@Override
		public void windowIconified(WindowEvent e) {
			// TODO 自动生成的方法存根
			System.out.println("windowIconified");
		}
		
		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO 自动生成的方法存根
			System.out.println("windowDeiconified");
		}
		
		@Override
		public void windowDeactivated(WindowEvent e) {
			System.out.println("windowDeactivated");
			
		}
		
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO 自动生成的方法存根
			System.out.println("windowClosing");
		}
		
		@Override
		public void windowClosed(WindowEvent e) {
			System.out.println("windowClosed");
			
		}
		
		@Override
		public void windowActivated(WindowEvent e) {
			System.out.println("windowActivated");
			
		}
	}
	public static void main(String[] args) {
		WindowDemo w=new WindowDemo();
		w.setVisible(true);

	}

}
