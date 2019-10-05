package javaFun.chapC.lecture17.usefulClasses;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

/**
 * Period : 날짜 - 날짜
 * Duration : 시간 - 시간
 * 
 * Duration과 Period는 TemporalAmount 인터페이스를 구현헀음
 */
public class PeriodDuration {
	
	public static void main(String[] args) {
		//두 날짜의 차이
		LocalDateTime datetime = LocalDateTime.now();
		
		System.out.println("기준 : " + datetime);
		
		LocalDate comparedDate = LocalDate.of(2018, 8, 8);
		Period period = Period.between(comparedDate, datetime.toLocalDate());
		System.out.println(comparedDate + "와 비교 --> " + period);
		
		LocalTime comparedTime = LocalTime.of(5, 10, 30);
		Duration duration =Duration.between(comparedTime, datetime.toLocalTime());
		System.out.println(comparedTime + "과 비교 --> " + duration);
	
		//get을 통해 특정 값을 얻을 수 있다. ex) ChronoUnit.YEARS
		
		/*java.time패키지 관련 상식
		 * (1) temporal과 chrono의 의미가 모두 시간(time)인데도, time대신 굳이 이런 어려운 용어를 쓴 이유는
		 * '시분초'의 시간과 '년월일시분초'의 시간을 구분하기 위해서이다.
		 * 
		 * (2) TemporalUnit : 날짜와 시간의 단위를 정의해 놓은 인터페이스 --> ChronoUnit 구현클래스
		 * 
		 * (3) TemporalField : 년, 월, 일 등 날짜와 시간의 필드를 정의해 놓은 인터페이스 --> ChronoField 구현클래스
		 * 
		 */
	}
	
}
