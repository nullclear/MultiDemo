import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 
 */

/** 
 * @ClassName touzi
 * @Description 
 * @author Nuclear
 */
public class touzi {

	public static void main(String[] args) {
		/*double sum=0;
		double a=1.0/6;
		for (int i = 0; i < 1000; i++) {
			sum=sum+Math.pow(a, i+1);
		}
		System.out.println(sum);*/
		Double sum=0d;
		BigDecimal de=new BigDecimal(1.0/6);
		System.out.println("初始总和:"+sum+"基数因子:"+de.setScale(10, RoundingMode.HALF_UP));
		for (int i = 0; i < 100; i++) {
			sum+=Double.parseDouble(de.pow(i).toString());
		}
		System.out.println(sum);
	}
}
