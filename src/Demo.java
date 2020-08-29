import java.util.*;

public class Demo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "1111");
		map.put(2, "2222");
		map.put(3, "3333");
		map.put(4, "4444");
		System.out.println("map��������" + map.size());

		// ��������ַ���
		// ��һ��foreach
		Set<Integer> set = map.keySet();
		for (int key : set) {
			System.out.println("key:" + key + " value:" + map.get(key));
		}

		// ������
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println("key:" + key + " value:" + map.get(key));
		}
	
	}
}
