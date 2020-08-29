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
					System.out.print(f.getName()+"属性注解内容为：");
					System.out.print("备注="+p.remark());//返回注解中备注的内容
					System.out.println(" , 属性是否有效="+p.enable());//返回属性是否启用
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
