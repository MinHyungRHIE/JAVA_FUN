package tmp2;

import java.util.Arrays;

public class _03_Intro3 {
	 public static void main(String[] args) {
			int[] iArr = new int[] {4,2,10,1,5};
			//?ò§Î¶ÑÏ∞®?àú?úºÎ°? ?†ï?†¨?ïòÍ≥? ?ã∂?ã§.
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
			 * ÎπÑÎ°ù Arrays ?ûêÏ≤¥Îäî Ïª¨Î†â?Öò?ù¥ ?ïÑ?ãàÍ≥? Î∞∞Ïó¥?ù¥Ïß?Îß?
			 * Ïª¨Î†â?Öò?èÑ ?ù¥?? Í∞ôÏù¥ ÎπÑÏä∑?ïòÍ≤? ?èå?ïÑÍ∞ÑÎã§.
			 * 
			 * Î∞∞Ïó¥?ùò Î¨∏Ï†ú : ?Å¨Í∏∞Í? ?†ï?ï¥?†∏ ?ûà?ã§.
			 * ?ï¥Í≤? --> Ïª¨Î†â?Öò ?Ç¨?ö©(?Å¨Í∏∞Í? ?ú†?èô?†Å?úºÎ°? Î≥??ïú?ã§)
			 */
	 }
}
