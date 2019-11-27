package series.fun.java.chap04.lec01;

/*
 * 원시 방식
 */
class Box{
	Object obj;
	
	void setObj(Object obj) {
		this.obj = obj;
	}

	Object getObj() {
		return this.obj;
	}
}

/*
 * 제네릭 방식
 */
class Bottle<T>{
	T things;
	
	void setThings(T things) {
		this.things = things;
	}
	
	T getThings() {
		return this.things;
	}
}

public class _01_GenericClass {
	public static void main(String[] args) {
		
	}
}
