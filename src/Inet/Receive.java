package Inet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Receive extends JFrame implements Runnable, ActionListener {
	JButton ince = new JButton("��ʼ����");// "��ʼ����"��ť
	JButton stop = new JButton("ֹͣ����");// "ֹͣ����"��ť
	JTextArea inceAr = new JTextArea(10, 10);// ��ʾ���չ㲥����ʾ
	JTextArea inced = new JTextArea(10, 10);// ��ʾ���ܵ��Ĺ㲥
	Thread thread;// ����Thread����,�����¿��߳�ִ�й㲥���ղ���
	boolean getMessage = true;// �Ƿ���չ㲥

	int port = 9898;// �˿�
	InetAddress group;// �㲥���ַ
	MulticastSocket socket;// �ಥ���ݰ��׽���

	public Receive() {// ���췽��
		super("�㲥���ݱ�");// ���ô������
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// ���ô���رշ�ʽ
		inceAr.setForeground(Color.blue);// ָ����ʾ�ı����е�������ɫ
		Container c = getContentPane();
		c.setLayout(new BorderLayout());// �߽粼��

		JPanel north = new JPanel();// ����Jpanel����
		north.add(ince);
		north.add(stop);
		add(north, BorderLayout.NORTH);

		JPanel center = new JPanel();
		center.setLayout(new GridLayout(1, 2));// ������岼��
		center.add(inceAr);

		final JScrollPane scrollPane = new JScrollPane(inced);
		center.add(scrollPane);
		// scrollPane.setViewportView(inced);
		add(center, BorderLayout.CENTER);
		thread = new Thread(this);
		ince.addActionListener(this);
		stop.addActionListener(this);
		validate();
		setBounds(100, 50, 360, 380);
		setVisible(true);

		// �㲥���ַ��Χ��224.0.0.0~239.255.255.255
		try {
			group = InetAddress.getByName("224.255.10.0");// ָ���㲥���ַ
			socket = new MulticastSocket(port);// ʵ�����ಥ���ݰ��׽���
			socket.joinGroup(group);// ����㲥��
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Receive rec = new Receive();
		rec.setSize(600, 400);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ince) {
			ince.setBackground(Color.red);
			stop.setBackground(Color.yellow);
			if (!thread.isAlive()) {
				thread = new Thread(this);
				getMessage = true;
			}
			thread.start();
		}
		if (e.getSource() == stop) {
			ince.setBackground(Color.yellow);
			stop.setBackground(Color.red);
			getMessage = false;

		}

	}

	@Override
	public void run() {
		while (getMessage) {
			DatagramPacket packet;
			byte data[] = new byte[1024];
			packet = new DatagramPacket(data, data.length, group, port);
			try {
				socket.receive(packet);// ��ȡ���ݰ�
				String message = new String(packet.getData(), 0, packet.getLength());// �����ݰ��ж�ȡ���ݱ�Ϊ�ַ���
				inceAr.setText("���ڽ��յ����ݣ�" + message);
				inced.append(message + "\n");
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

}
