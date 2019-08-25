package javaLec.collection;

public class Intro {
	public static void main(String[] args) {
		
		int[] iArr = new int[] {4,2,10,1,5};
		//오름차순으로 정렬하고 싶다.
		for(int i = 0; i < iArr.length-1 ; i++) {
			for(int j = i+1; j < iArr.length ; j++) {
				if(iArr[i] > iArr[j]) {
					int tmp = iArr[i];
					iArr[i] = iArr[j];
					iArr[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		//Create생성, Read읽기, Update수정, Delete삭제 ... 자료구조의 기본
				//자료구조 : 어떻게하면 데이터를 효율적으로 관리할 수 있을까
				//Collection = 자료구조
		
	}
}
