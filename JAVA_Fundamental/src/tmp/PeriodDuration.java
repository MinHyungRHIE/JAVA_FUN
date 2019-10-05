package tmp;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

/**
 * Period : ?���? - ?���?
 * Duration : ?���? - ?���?
 * 
 * Duration�? Period?�� TemporalAmount ?��?��?��?��?���? 구현???��
 */
public class PeriodDuration {
	
	public static void main(String[] args) {
		//?�� ?��짜의 차이
		LocalDateTime datetime = LocalDateTime.now();
		
		System.out.println("기�? : " + datetime);
		
		LocalDate comparedDate = LocalDate.of(2018, 8, 8);
		Period period = Period.between(comparedDate, datetime.toLocalDate());
		System.out.println(comparedDate + "?? 비교 --> " + period);
		
		LocalTime comparedTime = LocalTime.of(5, 10, 30);
		Duration duration =Duration.between(comparedTime, datetime.toLocalTime());
		System.out.println(comparedTime + "�? 비교 --> " + duration);
	
		//get?�� ?��?�� ?��?�� 값을 ?��?�� ?�� ?��?��. ex) ChronoUnit.YEARS
		
		/*java.time?��?���? �??�� ?��?��
		 * (1) temporal�? chrono?�� ?��미�? 모두 ?���?(time)?��?��?��, time???�� 굳이 ?��?�� ?��?��?�� ?��?���? ?�� ?��?��?��
		 * '?��분초'?�� ?��간과 '?��?��?��?��분초'?�� ?��간을 구분?���? ?��?��?��?��?��.
		 * 
		 * (2) TemporalUnit : ?��짜�? ?��간의 ?��?���? ?��?��?�� ?��?? ?��?��?��?��?�� --> ChronoUnit 구현?��?��?��
		 * 
		 * (3) TemporalField : ?��, ?��, ?�� ?�� ?��짜�? ?��간의 ?��?���? ?��?��?�� ?��?? ?��?��?��?��?�� --> ChronoField 구현?��?��?��
		 * 
		 */
	}
	
}
