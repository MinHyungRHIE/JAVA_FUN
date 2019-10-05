package javaFun.chapD.lecture18.collectionGeneric;

import java.util.Arrays;

public class _03_Intro3 {
	 public static void main(String[] args) {
			int[] iArr = new int[] {4,2,10,1,5};
			//오름차순으로 정렬하고 싶다.
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
			 * 비록 Arrays 자체는 컬렉션이 아니고 배열이지만
			 * 컬렉션도 이와 같이 비슷하게 돌아간다.
			 * 
			 * 배열의 문제 : 크기가 정해져 있다.
			 * 해결 --> 컬렉션 사용(크기가 유동적으로 변한다)
			 */
	 }
}
