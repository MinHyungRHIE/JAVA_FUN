package tmp2;

public class _02_Intro2 {
	
	public static void main(String[] args) {
		
		int[] iArr = new int[] {4,2,10,1,5};
		//?��름차?��?���? ?��?��?���? ?��?��.
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
		
		//Create?��?��, Read?���?, Update?��?��, Delete?��?�� ... ?��료구조의 기본
				//?��료구�? : ?��?��게하�? ?��?��?���? ?��?��?��?���? �?리할 ?�� ?��?���?
				//Collection = ?��료구�?
	}
}
