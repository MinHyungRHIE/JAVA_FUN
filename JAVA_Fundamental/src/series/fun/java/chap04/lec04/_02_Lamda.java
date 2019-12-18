package series.fun.java.chap04.lec04;

import java.util.Arrays;
import java.util.Comparator;

public class _02_Lamda {
	
	public static void main(String[] args) {
		
		//about lamda
		
//		MyFunc addF1 = new MyFunc(){
//			@Override
//			public int calculator(int x, int y) {
//				return x+y+10;
//			}
//		};
		
		/*** 1 : 클래스 이름을 없앤다. ***/
//		MyFunc addF1 =
//			@Override
//			public int calculator(int x, int y) {
//				return x+y+10;
//			}
		
		/*** 2 : 메서드 이름을 없앤다. 지금부터 사용이 가능하지만 더 줄일 수 있다.***/
//		MyFunc addF1 =(int x, int y)->{return x+y+10;};

		/*** 3 : 자료형을 없앤다. 자료형을 명시할거면 둘 다 모두 명시해야 한다.***/
//		MyFunc addF1 =(x, y)->{return x+y+10;};
		
		/*** 4 : 리턴을 없애고 코드 블럭을 없앤다.***/
		MyFunc addF1 =(x, y)->x+y+10;
		
	}
}

























