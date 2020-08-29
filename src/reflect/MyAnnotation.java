package reflect;

public @interface MyAnnotation {
	String value() default "д╛хо"; 
	Class type() default void.class;
}
