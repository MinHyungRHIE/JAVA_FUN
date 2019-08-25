package javaLec.lamda;

import java.util.Arrays;
import java.util.Comparator;

public class UsingLamda {
	
	public static void main(String[] args) {
		
		//about lamda
		
//		MyFunc addF1 = new MyFunc(){
//			@Override
//			public int calculator(int x, int y) {
//				return x+y+10;
//			}
//		};
		
		/*** 1?‹¨ê³? : ?´?ž˜?Š¤ë¥? ?—†?•¤?‹¤ ***/
//		MyFunc addF1 =
//			@Override
//			public int calculator(int x, int y) {
//				return x+y+10;
//			}
		
		/*** 2?‹¨ê³? : ë©”ì„œ?“œ ?´ë¦„ì„ ?—†?•¤?‹¤ : ?—¬ê¸°ì„œë¶??„´ ?“¸ ?ˆ˜ ?žˆ?‹¤. ?•˜ì§?ë§? ?” ì¤„ì¼ ?ˆ˜ ?žˆ?Œ ***/
//		MyFunc addF1 =(int x, int y)->{return x+y+10;};

		/*** 3?‹¨ê³? : ?žë£Œí˜•?„ ?—†?•¤?‹¤. ?‘˜ ?‹¤ ?žˆ?˜ì§? ?‘˜ ?‹¤ ?—†?˜ì§? ?•´?•¼?•œ?‹¤. ?•˜?‚˜ë§? ?žë£Œí˜• ë¶??—¬ ë¶ˆê?***/
//		MyFunc addF1 =(x, y)->{return x+y+10;};
		
		/*** 4?‹¨ê³? : ë¦¬í„´?„ ?—†?•¤?‹¤.***/
		MyFunc addF1 =(x, y)->x+y+10;
		
//		MyFunc addF2 = new MyFunc(){
//			@Override
//			public int calculator(int x, int y) {
//				return x+y+10+20;
//			}
//		};
		MyFunc addF2 = 	(x, y)->x+y+10+20;
		System.out.println(addF2.calculator(10, 10));
		
		
		
//		System.out.println(new MyFunc(){
//			@Override
//			public int calculator(int x, int y) {
//				return x+y+10+20+30;
//			}
//		}.calculator(10, 10));
		
		
		String[] names = new String[] {"e","b","c","f","a","d"};
//		?˜¤ë¦„ì°¨?ˆœ
//		Arrays.sort(names);
		
//		?‚´ë¦¼ì°¨?ˆœ
//		Arrays.sort(names,new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return s2.compareTo(s1);
//			}
//		});
		
//		?‚´ë¦¼ì°¨?ˆœ(?žŒ?‹¤?‹)
		Arrays.sort(names,(s1, s2)->s2.compareTo(s1));
		System.out.println(Arrays.toString(names));
	}
}

























