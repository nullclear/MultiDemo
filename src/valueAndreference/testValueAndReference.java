/**
 * 
 */
package valueAndreference;

import java.util.concurrent.atomic.AtomicInteger;

/** 
 * @ClassName testValueAndReference
 * @Description 
 * @author Nuclear
 */
public class testValueAndReference {
	public static void main(String[] args) {
		Person person=new Person();
		person.setName("马云");
		System.out.print(person+"~~~~");
		changeReference(person);
		System.out.println(person);
		
		Integer i=1;//源码中的value用final修饰，所以无法使用引用传递
		System.out.print(i+"~~~~");
		changeValue(i);
		System.out.println(i);
		
		//解决办法就是使用原子类
		AtomicInteger k=new AtomicInteger(8);
		System.out.print(k+"~~~~");
		changeAtomicInteger(k);
		System.out.println(k);
	}
	public static void changeReference(Person person) {
		person.setName("东哥");
	}
	
	public static void changeValue(Integer i) {
		i=2;
	}
	
	public static void changeAtomicInteger(AtomicInteger k) {
		k.set(100);
	}
}
