/**
 * 
 */
package designPattern.observer;

/** 
 * @ClassName Watched
 * @Description 
 * @author Nuclear
 */
public interface Watched {

	void addWatcher(Watcher watcher);
	
	void removeWatcher(Watcher watcher);
	
	void notifyWatcher(String str);
}
