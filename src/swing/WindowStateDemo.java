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
					from="������";
					break;
				case Frame.MAXIMIZED_BOTH:
					from="���";
					break;

				default:from="��С��";
					break;
				}
				String to="";
				switch (newState) {
				case Frame.NORMAL:
					to="������";
					break;
				case Frame.MAXIMIZED_BOTH:
					to="���";
					break;

				default:to="��С��";
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
