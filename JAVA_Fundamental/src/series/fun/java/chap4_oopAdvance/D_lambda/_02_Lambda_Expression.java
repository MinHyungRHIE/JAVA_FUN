package series.fun.java.chap4_oopAdvance.D_lambda;

/*람다식이란 익명 함수(anonymous function)이라고도 하며, 
 * 메서드를 간략하고도 명확하게 함수형으로 표현할 수 있어 코드를 간결하게 만들어준다.
 */
public class _02_Lambda_Expression {
	
	public static void main(String[] args) {

		/*** 원본 코드 -> 람다식으로 표현하기 ***/
//		MyFunc addF1 = new MyFunc(){
//			@Override
//			public int calculator(int x, int y) {
//				return x+y+10;
//			}
//		};
		
		/*** 1. 먼저 인스턴스 생성부분을 지운다. ***/
//		MyFunc addF1 =
//			@Override
//			public int calculator(int x, int y) {
//				return x+y+10;
//			}
		
		/*** 2. 메서드 이름을 지운다. 자료형을 적을거면 둘 다, 지울거면 둘 다 모두 적용해야한다. ***/
//		MyFunc addF1 =(int x, int y)->{return x+y+10;};
		
		/*** 3. return이 있을땐 { }블럭이 있어야 한다. ***/
//		MyFunc addF1 =(x, y)->{return x+y+10;};
		
		/*** 4. 최종적인 람다의 모습 ***/
		MyFunc addF1 =(x, y)->x+y+10;
	}
}
