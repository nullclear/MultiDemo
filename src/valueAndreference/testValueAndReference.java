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
		person.setName("����");
		System.out.print(person+"~~~~");
		changeReference(person);
		System.out.println(person);
		
		Integer i=1;//Դ���е�value��final���Σ������޷�ʹ�����ô���
		System.out.print(i+"~~~~");
		changeValue(i);
		System.out.println(i);
		
		//����취����ʹ��ԭ����
		AtomicInteger k=new AtomicInteger(8);
		System.out.print(k+"~~~~");
		changeAtomicInteger(k);
		System.out.println(k);
	}
	public static void changeReference(Person person) {
		person.setName("����");
	}
	
	public static void changeValue(Integer i) {
		i=2;
	}
	
	public static void changeAtomicInteger(AtomicInteger k) {
		k.set(100);
	}
}
