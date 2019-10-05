package tmp;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
* LocalDate + LocalTime = LocalDateTime
* LocalDateTime + ?��간�? = ZonedDateTime
* 
* LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Instant?�� ?��짜�? ?��간을 ?��?��?���? ?��?�� ?��?��?��?��??
* 모두 Temporal, TemporalAccessor, TemporalAdjuster?��?��?��?��?���? 구현?��?��
*/
public class LocalZonedDateTime {
	
	public static void main(String[] args) {
		//now(), of()�? ?��?��?�� 객체 ?��?��?���?
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		ZonedDateTime dateTimeInKr = ZonedDateTime.of(dateTime, ZoneId.of("Asia/Seoul"));
		
		System.out.println(dateTimeInKr);

		/*Instant ?��?��?���?
		 * Instant?�� ?��?��?�� ???��(EPOCH TIME, 1970-01-01 00:00:00 UTC)�??�� 경과?�� ?��간을 ?��?���? ?��?���? ?��?��
		 * Instant?�� ?��?�� UTC(+00:00)�? 기�??���? ?���? ?��문에 LocalTime�? 차이�? ?��?�� ?�� ?��?��. (?���??? 9?���? 차이)
		 * 
		 * UTC?�� Coordinated Universal Time?�� ?��?���? '?���? ?��?��?��'?���? ?���?, 
		 * 1972?�� 1?�� 1?���??�� ?��?��?�� �??�� ?���??��?��?��.
		 * ?��?��?�� ?��?��?��?�� GMT(Greenwich Mean Time)?? UTC?�� 거의 같�?�?, UTC�? �? ?�� ?��?��?��?��.
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
		 * with() : ?��?�� ?��?���? �?�? 
		 * plus(), minus() : ?��?�� ?��?��값을 ?��?��거나 �? ?��
		 * 
		 */
	}
}
