/**
 * 
 */
package designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/** 
 * @ClassName Birds
 * @Description 
 * @author Nuclear
 */
public class Bird implements Watched{

	List<Watcher> watchers=new ArrayList<Watcher>();
	
	@Override
	public void addWatcher(Watcher watcher) {
		watchers.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		watchers.remove(watcher);
	}

	@Override
	public void notifyWatcher(String str) {
		for (Watcher watcher : watchers) {
			watcher.update(str);
		}
	}

}
