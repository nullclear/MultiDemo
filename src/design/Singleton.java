/**
 * 
 */
package design;

/** 
 * @ClassName Singleton
 * @Description 
 * @author Nuclear
 */
public class Singleton {

	private Singleton() {
	}

	private static Singleton SINGLETON = null;

	public static Singleton getInstance() {
		if (SINGLETON == null) {
			synchronized (Singleton.class) {
				if (SINGLETON == null) {
					SINGLETON = new Singleton();
				}
			}
		}
		return SINGLETON;
	}

}
