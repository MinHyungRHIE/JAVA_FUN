package tmp2;

import java.util.Arrays;

public class _03_Intro3 {
	 public static void main(String[] args) {
			int[] iArr = new int[] {4,2,10,1,5};
			//?��름차?��?���? ?��?��?���? ?��?��.
//			for(int i = 0; i < iArr.length-1 ; i++) {
//				for(int j = i+1; j < iArr.length ; j++) {
//					if(iArr[i] > iArr[j]) {
//						int tmp = iArr[i];
//						iArr[i] = iArr[j];
//						iArr[j] = tmp;
//					}
//				}
//			}
//			
//			for(int i = 0; i < iArr.length; i++) {
//				System.out.println(iArr[i]);
//			}
			Arrays.sort(iArr);
			System.out.println(Arrays.toString(iArr));
			
			/*
			 * 비록 Arrays ?��체는 컬렉?��?�� ?��?���? 배열?���?�?
			 * 컬렉?��?�� ?��?? 같이 비슷?���? ?��?��간다.
			 * 
			 * 배열?�� 문제 : ?��기�? ?��?��?�� ?��?��.
			 * ?���? --> 컬렉?�� ?��?��(?��기�? ?��?��?��?���? �??��?��)
			 */
	 }
}
