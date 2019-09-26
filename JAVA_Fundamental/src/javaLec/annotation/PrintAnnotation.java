package javaLec.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 메서드가 적용대상이고
 * 실행시에 PrintAnnotation정보(value,number)를
 * 리플렉션으로 얻을 수 있다.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) //컴파일 이후에도 JVM에 의해서 참조가 가능
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;	
}

//@PrintAnnotation ->디폴트
//@PrintAnnotation(value="홍길동", number=20) -> 오류
//class tmp{
//	
//}