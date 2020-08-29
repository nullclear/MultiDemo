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
	JButton ince = new JButton("开始接收");// "开始接收"按钮
	JButton stop = new JButton("停止接收");// "停止接收"按钮
	JTextArea inceAr = new JTextArea(10, 10);// 显示接收广播的提示
	JTextArea inced = new JTextArea(10, 10);// 显示接受到的广播
	Thread thread;// 创建Thread对象,用来新开线程执行广播接收操作
	boolean getMessage = true;// 是否接收广播

	int port = 9898;// 端口
	InetAddress group;// 广播组地址
	MulticastSocket socket;// 多播数据包套接字

	public Receive() {// 构造方法
		super("广播数据报");// 设置窗体标题
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// 设置窗体关闭方式
		inceAr.setForeground(Color.blue);// 指定提示文本域中的文字颜色
		Container c = getContentPane();
		c.setLayout(new BorderLayout());// 边界布局

		JPanel north = new JPanel();// 创建Jpanel对象
		north.add(ince);
		north.add(stop);
		add(north, BorderLayout.NORTH);

		JPanel center = new JPanel();
		center.setLayout(new GridLayout(1, 2));// 设置面板布局
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

		// 广播组地址范围：224.0.0.0~239.255.255.255
		try {
			group = InetAddress.getByName("224.255.10.0");// 指定广播组地址
			socket = new MulticastSocket(port);// 实例化多播数据包套接字
			socket.joinGroup(group);// 加入广播组
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
				socket.receive(packet);// 读取数据包
				String message = new String(packet.getData(), 0, packet.getLength());// 从数据包中读取数据变为字符串
				inceAr.setText("正在接收的内容：" + message);
				inced.append(message + "\n");
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
