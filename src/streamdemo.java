import java.util.*;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class streamdemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
	    list.add("Java3y");
	    list.add("3y");
	    list.add("��ͷ");
	    list.add("˧��");
	    list.add("��ͷ");
	    list.add("��ͷ");
	    list.add("��ͷ");


	    // ��ͳ�ķ�ʽɾ��"��ͷ"��Ԫ��
//	    ListIterator<String> iterator = list.listIterator();
//	    while (iterator.hasNext()) {
//	        if ("��ͷ".equals(iterator.next())) {
//	            iterator.remove();
//	        }
//	    }
	   for (int i = 0; i < list.size(); i++) {
		if ("��ͷ".equals(list.get(i))) {
			list.remove(i);
			i--;
		}
	}
	    // Lambda��ʽɾ��"��ͷ"��Ԫ��
	    //list.removeIf(s->"��ͷ".equals(s));
	    // ʹ��Lambda����List����
	    list.forEach(s->System.out.println(s));
	    for (String string : list) {
			System.out.println(string);
		}
	   
	}
}
