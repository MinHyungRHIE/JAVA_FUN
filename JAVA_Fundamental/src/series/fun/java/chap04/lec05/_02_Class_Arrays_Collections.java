package series.fun.java.chap04.lec05;

import java.util.Arrays;
import java.util.Comparator;

public class _02_Class_Arrays_Collections {
	public static void main(String[] args) {
		
		/*** Arrays 클래스는 배열을 좀 더 쉽게 사용할 수 있게 한다. ***/
		String[] arr = new String[] {"b","e","a","d","c"};
		System.out.println(Arrays.toString(arr)); //1차원 배열 출력시 사용
		System.out.println(Arrays.deepToString(arr)); //2차원 배열 출력시 사용. 1차원도 된다.
		
		//오름차순 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//내림차순 정렬, Comparator 클래스의 compare() 구현
		Arrays.sort(arr, new Comparator<String>(){
			/***
		     * @param o1 the first object to be compared.
		     * @param o2 the second object to be compared.
		     * @return a negative integer, zero, or a positive integer as the
		     *         first argument is less than, equal to, or greater than the
		     *         second.
			***/
			@Override
			public int compare(String o1, String o2) { 
				return o2.compareTo(o1) ;
			}
		});
		
		System.out.println(Arrays.toString(arr));
		
	}
}
