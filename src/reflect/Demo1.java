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
			
			Constructor cs1=c.getDeclaredConstructor();//�޲ι��췽��
			Object obj= cs1.newInstance();
			System.out.println(obj.toString());
			
			Constructor cs2=c.getDeclaredConstructor(int.class);//���췽��
			obj= cs2.newInstance(123);
			System.out.println(obj.toString());
			
			Constructor cs3=c.getDeclaredConstructor(int.class,String.class,double.class);//���췽��
			cs3.setAccessible(true);//��ȡ����Ȩ��
			obj= cs3.newInstance(123,"reflect",-1.1);
			System.out.println(obj.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

}
