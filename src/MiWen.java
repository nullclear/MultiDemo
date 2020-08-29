import java.util.Scanner;
/**
 * 
 */

/** 
 * @ClassName MiWen
 * @Description 
 * @author Nuclear
 */
public class MiWen {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		System.out.println(Analyse(string));
	}
	
	public static String Analyse(String string) {
		char[] cs=string.toCharArray();
		StringBuffer str=new StringBuffer();
		for (int i = 0; i < cs.length; i++) {
			if(cs[i]>='a'&&cs[i]<='z'){
				if ("abc".contains(String.valueOf(cs[i]))) {
					str.append(2);
				}
				if ("def".contains(String.valueOf(cs[i]))) {
					str.append(3);
				}
				if ("ghi".contains(String.valueOf(cs[i]))) {
					str.append(4);
				}
				if ("jkl".contains(String.valueOf(cs[i]))) {
					str.append(5);
				}
				if ("mono".contains(String.valueOf(cs[i]))) {
					str.append(6);
				}
				if ("pqrs".contains(String.valueOf(cs[i]))) {
					str.append(7);
				}
				if ("tuv".contains(String.valueOf(cs[i]))) {
					str.append(8);
				}
				if ("wxyz".contains(String.valueOf(cs[i]))) {
					str.append(9);
				}
			}else if (cs[i]>='A'&&cs[i]<='Z') {
				if (cs[i]>='A'&&cs[i]<'Z') {
					str.append(String.valueOf((char) (cs[i]+1)).toLowerCase());
				}else{
					str.append('a');
				}
			}else{
				str.append(cs[i]);
			}
		}
		
		return str.toString();
	}
}
