package javaFun.chapC.lecture17.usefulClasses;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
* LocalDate + LocalTime = LocalDateTime
* LocalDateTime + 시간대 = ZonedDateTime
* 
* LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Instant의 날짜와 시간을 표현하기 위한 클래스들은
* 모두 Temporal, TemporalAccessor, TemporalAdjuster인터페이스를 구현했음
*/
public class LocalZonedDateTime {
	
	public static void main(String[] args) {
		//now(), of()를 이용해 객체 생성하기
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		ZonedDateTime dateTimeInKr = ZonedDateTime.of(dateTime, ZoneId.of("Asia/Seoul"));
		
		System.out.println(dateTimeInKr);

		/*Instant 사용하기
		 * Instant는 에포크 타임(EPOCH TIME, 1970-01-01 00:00:00 UTC)부터 경과된 시간을 나노초 단위로 표현
		 * Instant는 항상 UTC(+00:00)를 기준으로 하기 때문에 LocalTime과 차이가 있을 수 있다. (한국은 9시간 차이)
		 * 
		 * UTC는 Coordinated Universal Time의 약자로 '세계 협정시'라고 하며, 
		 * 1972년 1월 1일부터 시행된 국제 표준시이다.
		 * 이전에 사용되던 GMT(Greenwich Mean Time)와 UTC는 거의 같지만, UTC가 좀 더 정확하다.
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
		 * with() : 특정 필드값 변경 
		 * plus(), minus() : 특정 필드값을 더하거나 뺄 때
		 * 
		 */
	}
}
