package reflect;

public @interface MyAnnotation {
	String value() default "Ĭ��"; 
	Class type() default void.class;
}
