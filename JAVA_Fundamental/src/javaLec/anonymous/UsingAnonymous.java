package javaLec.anonymous;

public class UsingAnonymous {
	
	class AddFunc implements MyFunc{
		@Override
		public int calculator(int x, int y) {
			return x+y;
		}
	}
	
	class SubFunc implements MyFunc {
		@Override
		public int calculator(int x, int y) {
			return x-y;
		}
	}
	
	class MulFunc implements MyFunc{
		@Override
		public int calculator(int x, int y) {
			return x*y;
		}
	}
	
	class DivFunc implements MyFunc{
		@Override
		public int calculator(int x, int y) {
			return x/y;
		}
	}
	
	public static void main(String[] args) {
		int addResult = new UsingAnonymous().new AddFunc().calculator(10, 10);
		System.out.println(addResult);
		
		MyFunc addF1 = new MyFunc(){
			@Override
			public int calculator(int x, int y) {
				return x+y+10;
			}
		};
		
		System.out.println(addF1.calculator(10, 10));
		
		MyFunc addF2 = new MyFunc(){
			@Override
			public int calculator(int x, int y) {
				return x+y+10+20;
			}
		};
		
		System.out.println(addF2.calculator(10, 10));
		
		System.out.println(new MyFunc(){
			@Override
			public int calculator(int x, int y) {
				return x+y+10+20+30;
			}
		}.calculator(10, 10));
		
		
	}
}
