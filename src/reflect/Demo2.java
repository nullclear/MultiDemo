package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Demo2 {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("reflect.Example2");
			Field fs[]=c.getDeclaredFields();//返回所有属性
			for (Field f : fs) {
				System.out.print(Modifier.toString(f.getModifiers())+" ");
				System.out.print(f.getType().getSimpleName()+" ");
				System.out.print(f.getName());
				System.out.println();
			}
			Constructor cs=c.getConstructor();
			Example2 e=(Example2)cs.newInstance();
			Field f = c.getDeclaredField("price");
			f.setAccessible(true);//使用权限
			System.out.println(f.get(e));
			f.set(e, 3.14);
			System.out.println(f.get(e));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (NoSuchFieldException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
	}
}
