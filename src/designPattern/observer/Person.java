/**
 * 
 */
package designPattern.observer;

/** 
 * @ClassName Person
 * @Description 
 * @author Nuclear
 */
public class Person implements Watcher{

	@Override
	public void update(String str) {
		System.out.println("被观察者发来消息："+str);
	}
	
}
