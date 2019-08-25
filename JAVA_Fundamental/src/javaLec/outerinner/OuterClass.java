package javaLec.outerinner;

public class OuterClass {
	
	class InnerClass{
		
		int innerNum = 10;

		public void innerMethod() {
			System.out.println("inner method");
		}
		
		
	}//InnerClass
	
	int num = 10;
	static String str = "HELLO";

	public void OuterMethod() {
		System.out.println("outer method");

	}
	
	public static void OuterStaticMethod() {
		System.out.println("outer static method");
	}
	
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();

		System.out.println(outer.num);
		System.out.println(OuterClass.str);
		outer.OuterMethod();
		OuterClass.OuterStaticMethod();
		
		/////////////////////////////////////////
		
		InnerClass inner = new OuterClass().new InnerClass();
		
		System.out.println(inner.innerNum);
		inner.innerMethod();
	}
}//OuterClass
