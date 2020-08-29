package ENUM;

public class Demo {
	public static void main(String[] args) {
		int index1=302;
		String value1=ErrorIndex.Value(index1);
		
		String value2="SeverError";
		int index2=ErrorIndex.Index(value2);
		
		System.out.println(index1+"对应的value是："+value1);
		System.out.println(value2+"对应的index是："+index2);
	}
}
