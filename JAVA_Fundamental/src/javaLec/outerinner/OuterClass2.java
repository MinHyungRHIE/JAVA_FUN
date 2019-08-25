package javaLec.outerinner;

import javaLec.outerinner.OuterClass.InnerClass;

public class OuterClass2 {
	
	int num = 10;
	static int staticNum = 20;
	
	public void outerMethod() {
		System.out.println("outer method");
	}
	
	public static void outerStaticMethod() {
		System.out.println("outer static method");
	}
	
	static class InnerClass{
		int innerNum = 30;
		static int innerStaticNum = 40; 
		
		public void innerMethod() {
			System.out.println("inner method");
		}
		
		public static void innerStaticMethod() {
			System.out.println("inner static method");
		}
	}
	
	public static void main(String[] args) {
		OuterClass2 outer2 = new OuterClass2();
		System.out.println(new OuterClass2().num);
		System.out.println(OuterClass2.staticNum);
		OuterClass2.InnerClass inner = new OuterClass2.InnerClass();
	}	
}
