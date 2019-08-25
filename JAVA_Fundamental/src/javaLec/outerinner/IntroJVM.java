package javaLec.outerinner;


public class IntroJVM {
	
	int num = 10;
	static String str = "HELLO";
	
	public static void main(String[] args) {
		IntroJVM pointer = new IntroJVM();
		System.out.println(pointer);
		System.out.println(pointer.num);
		
		System.out.println(IntroJVM.str);
	}
	
}
