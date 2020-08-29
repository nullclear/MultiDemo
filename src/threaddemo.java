
public class threaddemo {

	public static void main(String[] args) {
		/**
		 * Thread使用匿名内部类
		 */
		new Thread() {
			public void run() {
				while (true) {
					System.out.println("A");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
			};
		}.start();
		/**
		 * Thread调用Runnable接口使用匿名内部类
		 */
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					System.out.println("B");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
			}
		}).start();
		/**
		 * Thread使用Lambda方式表示
		 */
		new Thread(() -> {
			while (true) {
				System.out.println("C");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}).start();
	}

}
