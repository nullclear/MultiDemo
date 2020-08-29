package reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)//��ע��ֻ�������ڳ�Ա������
@Retention(RetentionPolicy.RUNTIME)//��ע����Ա�����
public @interface PhoneAnnotation {
	String remark() default "";//��ע
	boolean enable() default true;//�����Ƿ�����
	
}
