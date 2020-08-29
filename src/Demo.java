import java.util.*;

public class Demo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "1111");
		map.put(2, "2222");
		map.put(3, "3333");
		map.put(4, "4444");
		System.out.println("map的数量：" + map.size());

		// 输出的两种方法
		// 第一种foreach
		Set<Integer> set = map.keySet();
		for (int key : set) {
			System.out.println("key:" + key + " value:" + map.get(key));
		}

		// 迭代器
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println("key:" + key + " value:" + map.get(key));
		}
	
	}
}
