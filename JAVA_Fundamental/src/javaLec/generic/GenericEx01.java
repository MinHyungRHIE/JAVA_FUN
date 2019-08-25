package javaLec.generic;

public class GenericEx01 {
	
	public static void main(String[] args) {

		/*
		Primitive Type은 못들어감, Reference Type만 들어갈 수 있음
			-	Primitive Type : int, long, double ...
		그래서 Primitive Type을 Generic(제네릭) 요소(T,E,K,V)에 넣고 싶으면
		Wrapper Class를 이용해서 넣어야 한다.
		int => Integer
		long => Long
		double => Double
		 */
		
//		Box<long> box = new Box<long>(); 에러
//		Box<Long> box = new Box<Long>(); 정상
		Box<String> strBox = new Box<String>();
/*
		class Box<String>{
			String item;
			
			void setItem(String item) {
				this.item = item;
			}
			
			String getItem() {
				return this.item;
			}
		}
*/
		
//		box.setItem(10); 에러
		strBox.setItem("Hello World");
		System.out.println(strBox.getItem());
		
		Box<Integer> intBox = new Box<Integer>();
//		intBox.setItem("hi"); 에러
		intBox.setItem(10);
		System.out.println(intBox.getItem());
	}
	
}
