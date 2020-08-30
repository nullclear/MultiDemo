import java.util.Random;
import java.util.Scanner;

public class QiangHongBao {
	public static void main(String[] args) {
		System.out.println("--------微信抢红包----------");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入红包金额：");
		double total = sc.nextDouble();
		System.out.println("请输入红包个数：");
		int bagCount = sc.nextInt();

		Random rd = new Random();
		double min = 0.01;// 最少一分钱

		for (int i = 1; i < bagCount; i++) {
			double max = total - min * (bagCount - i + 1);// 除去每个包中的一分钱，剩下的钱都可以用来随机
			double bound = (double) (rd.nextInt((int) (max * 100)) / (100 * (bagCount - i)));// 为了防止前面的人把红包里的钱拿光，做了限制
			double money = bound + min;
			System.out.println("第" + i + "个红包是：" + String.format("%.2f", money) + "元");
			total = total - money;
		}
		System.out.println("第" + bagCount + "个红包是：" + String.format("%.2f", total) + "元");
		sc.close();
	}
}
