package series.fun.java.chap4_oopAdvance.D_lambda;

import java.util.function.Supplier;

interface MyFunction<T, R>{
	R apply(T t);
}

class SingleConstObject{
	SingleConstObject(){}
	void info() {
		System.out.println("하나의 생성자만 있는 SingleConstObject 클래스");
	}
}

class MultiConstObject{
	private String initStr;
	MultiConstObject(){}
	MultiConstObject(String setStr){this.initStr = setStr;}
	void info() {
		System.out.println("여러 생성자들이 있는 MultiConstObject 클래스 : " + initStr);
	}
}

@FunctionalInterface
interface MySupplier<T>{
	T get();
}

public class _03_Lambda_Method_Reference {
	public static void main(String[] args) {
		/*** 원본 코드 -> 람다식으로 표현하기 ***/
//		MyFunction getHashcode = new MyFunction<String, Integer>(){
//			@Override
//			public Integer apply(String t) {
//				return t.hashCode();
//			}
//		};
		
		/*** 1. 람다의 모습 ***/
//		MyFunction<String,Integer> getHashcode = (t) -> t.hashCode();
		
		/*** 2. 메서드 참조 ***/
		MyFunction<String,Integer> getHashcode = Object::hashCode;
		
		/*
		 클래스이름::메서드이름 || 참조변수::메서드이름
		 */
		
		/*** Tip : 메서드 참조로 객체도 만들 수 있다. ***/
//		SingleConstObject singleObj = new SingleConstObject();
//		SingleConstObject singleObj = SingleConstObject::new; //[에러]Functional Interface만 된다.
		MySupplier<SingleConstObject> singleObj = SingleConstObject::new;
		singleObj.get().info();
		MySupplier<MultiConstObject> multiObj = MultiConstObject::new; //오버로딩된 것들 중 인자가 없는 것만 불러옴
		multiObj.get().info();
		MyFunction<String, MultiConstObject> multiObj2 = MultiConstObject::new;
		multiObj2.apply("안녕하세요").info();
	}
}
