package DRAW;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class DrawDemo extends JFrame {

	public DrawDemo() {
		setTitle("-----");
		setLocationRelativeTo(null);
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();

		Mycanvas mc = new Mycanvas();
		c.add(mc);

	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new DrawDemo().setVisible(true);
	}

	private class Mycanvas extends Canvas {
		@Override
		public void paint(Graphics g) {

			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(Color.BLUE);
			g2.drawOval(5, 5, 100, 100);
			g2.drawRect(15, 15, 80, 80);

			Shape shape1 = new Rectangle2D.Double(110, 5, 100, 100);
			// g2.draw(shape1);
			g2.fill(shape1);

			Shape shape2 = new Ellipse2D.Double(220, 15, 80, 80);
			g2.drawArc(320, 25, 100, 50, 270, 200);// ����

			g2.drawLine(5, 120, 100, 120);

			g2.drawRoundRect(120, 120, 100, 100, 10, 10);// Բ�Ǿ���

			int x[] = { 250, 300, 250, 300 };
			int y[] = { 130, 130, 200, 200 };
			// g2.drawPolygon(x, y, 4);//�����

			g2.drawPolyline(x, y, 4);// ����� �����

			Stroke stroke = new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);// �ʴ�
			g2.setStroke(stroke);// �ʴ�

			Font ft = new Font("����", Font.BOLD, 35);// ����
			g2.setFont(ft);
			g2.drawString("ǧɽ��ɾ�", 250, 233);

			Image img = new ImageIcon("src/3.png").getImage();
			g2.drawImage(img, 450, 250, this);
		}
	}

}
