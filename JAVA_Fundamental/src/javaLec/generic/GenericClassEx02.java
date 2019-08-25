package javaLec.generic;

import java.util.ArrayList;

class ALBox<T>{
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

public class GenericClassEx02 {
	
}
