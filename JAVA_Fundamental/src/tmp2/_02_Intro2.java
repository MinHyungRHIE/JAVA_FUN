package tmp2;

public class _02_Intro2 {
	
	public static void main(String[] args) {
		
		int[] iArr = new int[] {4,2,10,1,5};
		//?˜¤ë¦„ì°¨?ˆœ?œ¼ë¡? ? •? ¬?•˜ê³? ?‹¶?‹¤.
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
		
		//Create?ƒ?„±, Read?½ê¸?, Update?ˆ˜? •, Delete?‚­? œ ... ?žë£Œêµ¬ì¡°ì˜ ê¸°ë³¸
				//?žë£Œêµ¬ì¡? : ?–´?–»ê²Œí•˜ë©? ?°?´?„°ë¥? ?š¨?œ¨? ?œ¼ë¡? ê´?ë¦¬í•  ?ˆ˜ ?žˆ?„ê¹?
				//Collection = ?žë£Œêµ¬ì¡?
	}
}
