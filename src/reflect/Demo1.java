package reflect;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Demo1 {

	public static void main(String[] args) {
		try {
			Class c= Class.forName("reflect.Example1");
			Constructor cons[]=c.getDeclaredConstructors();
			for (Constructor constructor : cons) {
				System.out.print(Modifier.toString(constructor.getModifiers())+" ");
				System.out.print(constructor.getName()+"(");
				Class params[]=constructor.getParameterTypes();
				for(int i= 0;i<params.length;i++){
					System.out.print(params[i].getSimpleName()+" args ");
					if(i<params.length-1){
						System.out.print(", ");
					}
				}
				System.out.println("){ }");
			}
			
			Constructor cs1=c.getDeclaredConstructor();//无参构造方法
			Object obj= cs1.newInstance();
			System.out.println(obj.toString());
			
			Constructor cs2=c.getDeclaredConstructor(int.class);//构造方法
			obj= cs2.newInstance(123);
			System.out.println(obj.toString());
			
			Constructor cs3=c.getDeclaredConstructor(int.class,String.class,double.class);//构造方法
			cs3.setAccessible(true);//获取操作权限
			obj= cs3.newInstance(123,"reflect",-1.1);
			System.out.println(obj.toString());
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
		}

	}

}
