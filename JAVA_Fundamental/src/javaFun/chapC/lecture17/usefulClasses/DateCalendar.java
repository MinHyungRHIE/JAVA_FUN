package javaFun.chapC.lecture17.usefulClasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 날짜와 시간을 나타내는 Java 클래스를 알아보자.
 * 
 * [역사]
 * JDK 1.0 : Date --> JDK 1.1 : Calendar --> JDK 1.8 : java.time
 * 
 *  현재 Date의 대부분의 메서드는 Deprecated 상태. 사용을 권장하지는 않는다.
 *  
 */
public class DateCalendar {
	
	public static void main(String[] args) {
		
		//intro
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();

		/*SimpleDateFormat 날짜 데이터를 원하는 형태로 다양하게 출력하기
		 * DateFormat 추상클래스 --> SimpleDateFormat 구현클래스
		 * G : AD, BC - 연대
		 * y : 2019 - 년도
		 * M : 10 | 10월 | OCT - 월
		 * w : 1~53 - 년의 몇 번째 주
		 * W : 1~5 - 월의 몇 번째 주
		 * D : 1~366 - 년의 몇 번째 일
		 * d : 1~31 - 월의 몇 번째 일
		 * E : 월~일 - 요일
		 * a : 오전/오후 | AM/PM
		 * H : 0~23 - 시간
		 * h : 1~12 - 시간
		 * m : 0~59 - 분
		 * s : 0~59 - 초
		 * ` : escape문자(특수문자를 표현할 때 사용)
		 * z : Time zone, General time zone
		 * Z : Time zone, RFC 822 time zone
		 */
		
		//기본 사용법
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String result = df.format(today);
		System.out.println(result);
		
		//Date 인스턴스만 format메서드에 사용될 수 있음
		Calendar cal = Calendar.getInstance();
		cal.set(2005,9,3);
		Date day = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss  E요일");
		System.out.println(sdf.format(day));
		
	}
}
