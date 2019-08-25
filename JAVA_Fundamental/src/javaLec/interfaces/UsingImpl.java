package javaLec.interfaces;

public class UsingImpl {
	public static void main(String[] args) {
		AddFunc add = new AddFunc();
		SubFunc sub = new SubFunc();
		MulFunc mul = new MulFunc();
		DivFunc div = new DivFunc();
		
		System.out.println(add.calculator(10,	20));
		
		int addNum = add.calculator(10, 20);
		int subNum = sub.calculator(10, 20);
		int mulNum = mul.calculator(10, 20);
		int divNum = div.calculator(10, 20);
		
		System.out.println(addNum);
		System.out.println(subNum);
		System.out.println(mulNum);
		System.out.println(divNum);
		
		System.out.println(add.calculator(10,	20)+subNum+mulNum+divNum);
		
		
	}
}
