package reflect;

public class CellPhone {
	@PhoneAnnotation(remark="Ʒ���ͺ�")
	public String brdMdl;//Ʒ���ͺ�
	
	@PhoneAnnotation(remark="�۸�")
	public double pirce;//�۸�
	
	@Deprecated
	@PhoneAnnotation(remark="��ؽӿ�",enable=false)//���Բ�����
	public String batteryInter;//��ؽӿ�
	
	@PhoneAnnotation(remark="�ֻ�����")
	public String produced;//�ֻ�����
	
}
