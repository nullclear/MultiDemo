/**
 * 
 */
package valueAndreference;

import java.util.Collections;

/** 
 * @ClassName test2
 * @Description 
 * @author Nuclear
 */
public class test2 {
	public static void main(String[] args) {
		String str="a"; 
		StringBuffer sb=new StringBuffer("a"); 
		process(str); 
		System.out.println(str); 
		process(sb); 
		System.out.println(sb); 
		process(str,sb);
		System.out.println(str); 
		System.out.println(sb); 
		//½á¹û a a a aA
		}
		public static void process(String str) {
		str = "A";
		}
		public static void process(StringBuffer sb) {
		sb = new StringBuffer();
		sb.append("A");
		}
		public static void process(String str, StringBuffer sb) {
		str = new String("A");
		sb.append("A");
		}
}
