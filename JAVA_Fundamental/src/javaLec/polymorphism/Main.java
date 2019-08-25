package javaLec.polymorphism;

public class Main {
	public static void main(String[] args) {
		MyFunc add = (MyFunc) new AddFunc();
		MyFunc sub = (MyFunc) new SubFunc();
		MyFunc mul = (MyFunc) new MulFunc();
		MyFunc div = (MyFunc) new DivFunc();
		
		add = sub;
		sub = mul;
		div = add;
		
		AddFunc a = new AddFunc();
		SubFunc s = new SubFunc();
		MulFunc m = new MulFunc();
		DivFunc d = new DivFunc();
		
//		a = s;
//		s = m;
//		d = a;
		
	}
}
