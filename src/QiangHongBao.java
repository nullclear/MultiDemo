import java.util.Random;
import java.util.Scanner;

public class QiangHongBao {
	public static void main(String[] args) {
		System.out.println("--------΢�������----------");
		Scanner sc = new Scanner(System.in);
		System.out.println("����������");
		double total = sc.nextDouble();
		System.out.println("��������������");
		int bagCount = sc.nextInt();

		Random rd = new Random();
		double min = 0.01;// ����һ��Ǯ

		for (int i = 1; i < bagCount; i++) {
			double max = total - min * (bagCount - i + 1);// ��ȥÿ�����е�һ��Ǯ��ʣ�µ�Ǯ�������������
			double bound = (double) (rd.nextInt((int) (max * 100)) / (100 * (bagCount - i)));// Ϊ�˷�ֹǰ����˰Ѻ�����Ǯ�ù⣬��������
			double money = bound + min;
			System.out.println("��" + i + "������ǣ�" + String.format("%.2f", money) + "Ԫ");
			total = total - money;
		}
		System.out.println("��" + bagCount + "������ǣ�" + String.format("%.2f", total) + "Ԫ");
		sc.close();
	}
}
