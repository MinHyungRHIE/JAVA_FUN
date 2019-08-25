package javaLec.generic;

//T, E, K, V
//인스턴스별로 다르게 동작하도록 하려고 만든 기능
class Box<T>{
	T item;
	
	void setItem(T item) {
		this.item = item;
	}
	
	T getItem() {
		return this.item;
	}
}
/*
 * 모든 객체에 대해서 동일하게 동작해야되는 static T var 불가
 * new T[10] 같이 제네릭 타입의 배열 생성 불가 : new  연산자 때문에 => 컴파일 시점에 T가 뭔질 정확하게 알아야함, instanceof도 마찬가지
 */
public class GenericClassEx01 {
	public static void main(String[] args) {
		Box<String> b = new Box<String>();
		b.setItem("ABC");
		String item = b.getItem();
		System.out.println(item);
	}
}
