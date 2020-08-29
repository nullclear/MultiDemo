package swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.*;

public class FileChooserDemo extends JFrame{

	private JTextField textField;
	public FileChooserDemo(){
		super();
		setTitle("FileChooserDemo");
		setLocationRelativeTo(null);
		setSize(500, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JPanel panel= new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		final JLabel label=new JLabel();
		label.setText("文件：");
		panel.add(label);
		
		textField=new JTextField();
		textField.setColumns(20);
		panel.add(textField);
		
		final JButton button=new JButton();
		button.setText("上传");
		panel.add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser filechooser=new JFileChooser();
				
				FileNameExtensionFilter filter=new FileNameExtensionFilter("Photo", "PNG","JPG","GIF");
				filechooser.setFileFilter(filter);
				
				int i=filechooser.showOpenDialog(getContentPane());
				if(i==JFileChooser.APPROVE_OPTION){
					File f=filechooser.getSelectedFile();
					textField.setText(f.getAbsolutePath());
				}
			}
		});
		
	}
	public static void main(String[] args) {
		FileChooserDemo fs=new FileChooserDemo();
		fs.setVisible(true);
		
	}

}
