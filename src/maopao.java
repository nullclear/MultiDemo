/**
 * 
 */

/** 
 * @ClassName maopao
 * @Description 
 * @author Nuclear
 */
public class maopao {

	public static void main(String[] args) {
		int[] a={10,9,8,7,6,5,4,3,2,1};
		int temp;
		boolean flag;
		
		for (int i = 0; i < a.length-1; i++) {
			flag=true;
			for (int j = 0; j < a.length-i-1; j++) {
				if (a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=false;
				}
			}
			if (flag) {
				break;
			}
		}
		
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k]+"   ");
		}
	}
}
