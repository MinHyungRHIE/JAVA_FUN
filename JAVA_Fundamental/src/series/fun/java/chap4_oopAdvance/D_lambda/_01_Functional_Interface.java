package series.fun.java.chap4_oopAdvance.D_lambda;

import java.util.Arrays;

/*** 어노테이션은 없어도 되지만 붙이면 컴파일 부분부터 필터링을 할 수 있어 편하다. ***/
@FunctionalInterface
interface MyFunc {
	int calculator(int x, int y);
}

public class _01_Functional_Interface {}
