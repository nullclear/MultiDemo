/**
 * 
 */
package designPattern.observer;

/** 
 * @ClassName demo
 * @Description 
 * @author Nuclear
 */
public class demo {

	public static void main(String[] args) {
		Watched bird=new Bird();
		
		Watcher person1=new Person();
		Watcher person2=new Person();
		Watcher person3=new Person();
		
		bird.addWatcher(person1);
		bird.addWatcher(person2);
		bird.addWatcher(person3);
		
		bird.notifyWatcher("“Ø¿¥¡À");
	}
}
