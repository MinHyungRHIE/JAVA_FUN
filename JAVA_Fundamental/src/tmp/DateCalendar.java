package tmp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ?‚ ì§œì? ?‹œê°„ì„ ?‚˜???‚´?Š” Java ?´?˜?Š¤ë¥? ?•Œ?•„ë³´ì.
 * 
 * [?—­?‚¬]
 * JDK 1.0 : Date --> JDK 1.1 : Calendar --> JDK 1.8 : java.time
 * 
 *  ?˜„?¬ Date?˜ ??ë¶?ë¶„ì˜ ë©”ì„œ?“œ?Š” Deprecated ?ƒ?ƒœ. ?‚¬?š©?„ ê¶Œì¥?•˜ì§??Š” ?•Š?Š”?‹¤.
 *  
 */
public class DateCalendar {
	
	public static void main(String[] args) {
		
		//intro
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();

		/*SimpleDateFormat ?‚ ì§? ?°?´?„°ë¥? ?›?•˜?Š” ?˜•?ƒœë¡? ?‹¤?–‘?•˜ê²? ì¶œë ¥?•˜ê¸?
		 * DateFormat ì¶”ìƒ?´?˜?Š¤ --> SimpleDateFormat êµ¬í˜„?´?˜?Š¤
		 * G : AD, BC - ?—°??
		 * y : 2019 - ?…„?„
		 * M : 10 | 10?›” | OCT - ?›”
		 * w : 1~53 - ?…„?˜ ëª? ë²ˆì§¸ ì£?
		 * W : 1~5 - ?›”?˜ ëª? ë²ˆì§¸ ì£?
		 * D : 1~366 - ?…„?˜ ëª? ë²ˆì§¸ ?¼
		 * d : 1~31 - ?›”?˜ ëª? ë²ˆì§¸ ?¼
		 * E : ?›”~?¼ - ?š”?¼
		 * a : ?˜¤? „/?˜¤?›„ | AM/PM
		 * H : 0~23 - ?‹œê°?
		 * h : 1~12 - ?‹œê°?
		 * m : 0~59 - ë¶?
		 * s : 0~59 - ì´?
		 * ` : escapeë¬¸ì(?Š¹?ˆ˜ë¬¸ìë¥? ?‘œ?˜„?•  ?•Œ ?‚¬?š©)
		 * z : Time zone, General time zone
		 * Z : Time zone, RFC 822 time zone
		 */
		
		//ê¸°ë³¸ ?‚¬?š©ë²?
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String result = df.format(today);
		System.out.println(result);
		
		//Date ?¸?Š¤?„´?Š¤ë§? formatë©”ì„œ?“œ?— ?‚¬?š©?  ?ˆ˜ ?ˆ?Œ
		Calendar cal = Calendar.getInstance();
		cal.set(2005,9,3);
		Date day = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss  E?š”?¼");
		System.out.println(sdf.format(day));
		
	}
}
