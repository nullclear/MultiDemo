package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo3 {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("reflect.Example3");
			Method ms[] = c.getDeclaredMethods();
			for (Method m : ms) {
				System.out.print(Modifier.toString(m.getModifiers()) + " ");
				System.out.print(m.getReturnType().getSimpleName() + " ");
				System.out.print(m.getName() + " ( ");
				Class paras[] = m.getParameterTypes();
				for (int i = 0; i < paras.length; i++) {
					System.out.print(paras[i].getSimpleName() + " arg ");
					if (i < paras.length - 1) {
						System.out.print(" , ");
					}

				}
				System.out.print(" ) ");
				Class excs[] = m.getExceptionTypes();
				if (excs.length > 0) {
					System.out.print(" throws ");
					for (int i = 0; i < excs.length; i++) {
						System.out.println(excs[i].getSimpleName());
						if (i < excs.length - 1) {
							System.out.print(" , ");
						}
					}
				}
				System.out.println(" { } ");
			}
			Constructor cs = c.getConstructor();
			Example3 e = (Example3) cs.newInstance();//实例化
			
			Method m = c.getDeclaredMethod("add", int.class, int.class);
			m.setAccessible(true);
			m.invoke(e, 1, 2);
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
	}
}
