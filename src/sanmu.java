/**
 * 
 */

/** 
 * @ClassName sanmu
 * @Description 
 * @author Nuclear
 */
public class sanmu {
	public static int sum;
	public static void main(String[] args) {
		int isum=iSum(100);
		System.out.println(isum);
	}
	public static int iSum(int n) {
		sum+=n;
		sum=n==0?sum:iSum(--n);
		return sum;
	}
}
