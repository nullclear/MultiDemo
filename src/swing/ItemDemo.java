package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ItemDemo extends JFrame {
	public ItemDemo() {
		setTitle("-----");
		setLocationRelativeTo(null);
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();

		JPanel leftpanel = new JPanel();
		c.add(leftpanel, BorderLayout.WEST);
		leftpanel.setLayout(new BorderLayout());

		JLabel titleLabel = new JLabel("ѡ��Ҫ��ʾ�����");
		titleLabel.setPreferredSize(new Dimension(150, 50));
		titleLabel.setBorder(new EmptyBorder(0, 20, 0, 0));
		leftpanel.add(titleLabel, BorderLayout.NORTH);

		String items[] = { "ȫ����ʾ", "��ѡ��", "��ѡ��" };
		JComboBox comboBox = new JComboBox(items);
		JPanel tmpPanel = new JPanel();
		tmpPanel.add(comboBox);
		leftpanel.add(tmpPanel, BorderLayout.CENTER);

		JPanel rightPanel = new JPanel();
		rightPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		c.add(rightPanel, BorderLayout.CENTER);

		JCheckBox check = new JCheckBox("��ѡ��");
		rightPanel.add(check);
		JRadioButton radio = new JRadioButton("��ѡ��");
		rightPanel.add(radio);

		comboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String itemName = e.getItem().toString();
				switch (itemName) {
				case "1":
					check.setVisible(true);
					radio.setVisible(false);
					break;
				case "2":
					check.setVisible(false);
					radio.setVisible(true);
					break;
				default:
					check.setVisible(true);
					radio.setVisible(true);
					break;
				}

			}
		});
		
		check.addItemListener(new MyItemListener());
		radio.addItemListener(new MyItemListener());
		setResizable(false);
		setVisible(true);
	}
	class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			AbstractButton btn=(AbstractButton) e.getSource();
			int state=e.getStateChange();
			switch (state) {
			case ItemEvent.SELECTED:
				System.out.println(btn.getText()+"ѡ��");
				break;
			case ItemEvent.DESELECTED:
				System.out.println(btn.getText()+"δѡ��");
				break;
			default:
				break;
			}
			
		}
		
	}
	public static void main(String[] args) {
		new ItemDemo();
	}

}
