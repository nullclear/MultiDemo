import java.util.*;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class streamdemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
	    list.add("Java3y");
	    list.add("3y");
	    list.add("光头");
	    list.add("帅哥");
	    list.add("光头");
	    list.add("光头");
	    list.add("光头");


	    // 传统的方式删除"光头"的元素
//	    ListIterator<String> iterator = list.listIterator();
//	    while (iterator.hasNext()) {
//	        if ("光头".equals(iterator.next())) {
//	            iterator.remove();
//	        }
//	    }
	   for (int i = 0; i < list.size(); i++) {
		if ("光头".equals(list.get(i))) {
			list.remove(i);
			i--;
		}
	}
	    // Lambda方式删除"光头"的元素
	    //list.removeIf(s->"光头".equals(s));
	    // 使用Lambda遍历List集合
	    list.forEach(s->System.out.println(s));
	    for (String string : list) {
			System.out.println(string);
		}
	   
	}
}
