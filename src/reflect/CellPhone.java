package reflect;

public class CellPhone {
	@PhoneAnnotation(remark="品牌型号")
	public String brdMdl;//品牌型号
	
	@PhoneAnnotation(remark="价格")
	public double pirce;//价格
	
	@Deprecated
	@PhoneAnnotation(remark="电池接口",enable=false)//属性不启用
	public String batteryInter;//电池接口
	
	@PhoneAnnotation(remark="手机厂商")
	public String produced;//手机厂商
	
}
