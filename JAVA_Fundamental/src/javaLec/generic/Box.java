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