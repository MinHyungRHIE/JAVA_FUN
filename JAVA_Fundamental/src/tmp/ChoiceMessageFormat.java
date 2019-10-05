package tmp;

import java.text.ChoiceFormat;
import java.text.MessageFormat;

public class ChoiceMessageFormat {
	public static void main(String[] args) {
		/* ChoiceFormat ?‚¬?š©?•˜ê¸?
		 * ChoiceFormat?? ?Š¹? • ë²”ìœ„?— ?†?•˜?Š” ê°’ì„ ë¬¸ì?—´ë¡? ë³??™˜?•´ì¤??‹¤.
		 * ifë¬¸ì´?‚˜ switchë¬¸ë³´?‹¤ ê°„ë‹¨?•˜ê³? ì§ê?? ?œ¼ë¡? ë§Œë“¤ ?ˆ˜ ?ˆ?‹¤.
		 */
		double[] limits = new double[] {60,70,80,90}; //ë°˜ë“œ?‹œ ?˜¤ë¦„ì°¨?ˆœ?´?–´?•¼ ?•œ?‹¤.
		String[] grades = new String[] {"D","C","B","A"}; //limits, gradesê°„ì˜ ?ˆœ?„œ?? ê°œìˆ˜ë¥? ë§ì¶”?–´?•¼ ?•œ?‹¤.
		int[] scores = {100, 95, 88, 70, 52, 60, 72, 62};
		
		ChoiceFormat form = new ChoiceFormat(limits,grades);
		
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i] + " : " + form.format(scores[i]));
		}
		
		System.out.println("-------------------------------------------");
		
		//String?œ¼ë¡? ?Œ¨?„´?„ ë§Œë“¤ ?ˆ˜?„ ?ˆ?Š”?° êµ¬ë¶„?ë¡? '#'?? '<' ?‘ ê°?ì§?ë¥? ? œê³µí•œ?‹¤. (limit#value), #?? ?¬?•¨, <?? ë¯¸í¬?•¨
		String pattern = "60#D|70#C|80<B|90#A";
		int[] numbers = { 91, 90, 80 ,88, 70, 52 ,60, 62};
		
		ChoiceFormat formWithPattern = new ChoiceFormat(pattern);
		
		for(int i = 0; i < numbers.length ; i++) {
			System.out.println(numbers[i] + " : " + formWithPattern.format(numbers[i]));
		}
		
		System.out.println("-------------------------------------------");
		
		/* MessageFormat ?‚¬?š©?•˜ê¸?
		 * ?°?´?„°ê°? ?“¤?–´ê°? ?ë¦¬ë?? ë§ˆë ¨?•´ ?†“?? ?–‘?‹?„ ë¯¸ë¦¬ ?‘?„±?•˜ê¸?
		 * ?‹¤?ˆ˜?˜ ?°?´?„°ë¥? ê°™ì? ?–‘?‹?œ¼ë¡? ì¶œë ¥?•  ?•Œ ì¢‹ë‹¤.
		 */
		String msg = "Name : {0} \nTel : {1} \nAge : {2}";
		
		Object[] arguments = { "RHIE", "02-1234-5678","27"};
		
		String result = MessageFormat.format(msg, arguments);
		System.out.println(result);
	}
}
