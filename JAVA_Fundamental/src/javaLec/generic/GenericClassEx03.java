package javaLec.generic;

import java.util.ArrayList;

interface Eatable{
	void method();
}

class Fruit implements Eatable{

	@Override
	public void method() {
		System.out.println("Fruit");
	}
	
}



//class FruitBox<T extends Fruit>{ //Fruit의 자손만 타입으로 지정 가능
class FruitBox<T extends Fruit & Eatable>{ //Fruit의 자손이면서 Eatable인터페이스도 구현
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	ArrayList<T> getList(){
		return list;
	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}

public class GenericClassEx03 {

}
