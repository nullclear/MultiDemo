package swing;

import java.awt.Container;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.*;

public class WindowStateDemo extends JFrame {
	public WindowStateDemo(){
		setTitle("-----");
		setLocationRelativeTo(null);
		setSize(500, 375);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		addWindowStateListener(new WindowStateListener() {
			
			@Override
			public void windowStateChanged(WindowEvent e) {
				int oldState=e.getOldState();
				int newState=e.getNewState();
				String from="";
				switch (oldState) {
				case Frame.NORMAL:
					from="正常化";
					break;
				case Frame.MAXIMIZED_BOTH:
					from="最大化";
					break;

				default:from="最小化";
					break;
				}
				String to="";
				switch (newState) {
				case Frame.NORMAL:
					to="正常化";
					break;
				case Frame.MAXIMIZED_BOTH:
					to="最大化";
					break;

				default:to="最小化";
					break;
				}
				System.out.println(from+"--->"+to);
			}
		});
	}
	public static void main(String[] args) {
		WindowStateDemo w=new WindowStateDemo();
		w.setVisible(true);

	}

}
