package reflect;

import java.lang.reflect.Field;

public class Demo4 {

	public static void main(String[] args) {
		try {
			Class c = Class.forName("reflect.CellPhone");
			Field fs[]=c.getDeclaredFields();
			for (Field f : fs) {
				if (f.isAnnotationPresent(PhoneAnnotation.class)) {
					PhoneAnnotation p=f.getAnnotation(PhoneAnnotation.class);
					System.out.print(f.getName()+"����ע������Ϊ��");
					System.out.print("��ע="+p.remark());//����ע���б�ע������
					System.out.println(" , �����Ƿ���Ч="+p.enable());//���������Ƿ�����
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}
