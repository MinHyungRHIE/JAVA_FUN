package tmp;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
* LocalDate + LocalTime = LocalDateTime
* LocalDateTime + ?‹œê°„ë? = ZonedDateTime
* 
* LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Instant?˜ ?‚ ì§œì? ?‹œê°„ì„ ?‘œ?˜„?•˜ê¸? ?œ„?•œ ?´?˜?Š¤?“¤??
* ëª¨ë‘ Temporal, TemporalAccessor, TemporalAdjuster?¸?„°?˜?´?Š¤ë¥? êµ¬í˜„?–ˆ?Œ
*/
public class LocalZonedDateTime {
	
	public static void main(String[] args) {
		//now(), of()ë¥? ?´?š©?•´ ê°ì²´ ?ƒ?„±?•˜ê¸?
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		ZonedDateTime dateTimeInKr = ZonedDateTime.of(dateTime, ZoneId.of("Asia/Seoul"));
		
		System.out.println(dateTimeInKr);

		/*Instant ?‚¬?š©?•˜ê¸?
		 * Instant?Š” ?—?¬?¬ ???„(EPOCH TIME, 1970-01-01 00:00:00 UTC)ë¶??„° ê²½ê³¼?œ ?‹œê°„ì„ ?‚˜?…¸ì´? ?‹¨?œ„ë¡? ?‘œ?˜„
		 * Instant?Š” ?•­?ƒ UTC(+00:00)ë¥? ê¸°ì??œ¼ë¡? ?•˜ê¸? ?•Œë¬¸ì— LocalTimeê³? ì°¨ì´ê°? ?ˆ?„ ?ˆ˜ ?ˆ?‹¤. (?•œêµ??? 9?‹œê°? ì°¨ì´)
		 * 
		 * UTC?Š” Coordinated Universal Time?˜ ?•½?ë¡? '?„¸ê³? ?˜‘? •?‹œ'?¼ê³? ?•˜ë©?, 
		 * 1972?…„ 1?›” 1?¼ë¶??„° ?‹œ?–‰?œ êµ?? œ ?‘œì¤??‹œ?´?‹¤.
		 * ?´? „?— ?‚¬?š©?˜?˜ GMT(Greenwich Mean Time)?? UTC?Š” ê±°ì˜ ê°™ì?ë§?, UTCê°? ì¢? ?” ? •?™•?•˜?‹¤.
		 * 
		 * Instant --> Date : static Date from(Instant instant)
		 * Date --> Instant : toInstant()
		 */
		Instant now = Instant.now();
		Instant now2 = Instant.ofEpochSecond(now.getEpochSecond());
		Instant now3 = Instant.ofEpochSecond(now.getEpochSecond(), now.getNano());
		
		System.out.println(now);
		System.out.println(now2);
		System.out.println(now3);
		
		long timestamp = now.toEpochMilli();
		System.out.println(timestamp);

		/*
		 * with() : ?Š¹? • ?•„?“œê°? ë³?ê²? 
		 * plus(), minus() : ?Š¹? • ?•„?“œê°’ì„ ?”?•˜ê±°ë‚˜ ëº? ?•Œ
		 * 
		 */
	}
}
