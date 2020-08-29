
public class threaddemo {

	public static void main(String[] args) {
		/**
		 * Threadʹ�������ڲ���
		 */
		new Thread() {
			public void run() {
				while (true) {
					System.out.println("A");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
			};
		}.start();
		/**
		 * Thread����Runnable�ӿ�ʹ�������ڲ���
		 */
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					System.out.println("B");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
			}
		}).start();
		/**
		 * Threadʹ��Lambda��ʽ��ʾ
		 */
		new Thread(() -> {
			while (true) {
				System.out.println("C");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}).start();
	}

}
