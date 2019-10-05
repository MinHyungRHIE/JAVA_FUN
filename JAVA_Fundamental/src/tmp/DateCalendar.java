package tmp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ?��짜�? ?��간을 ?��???��?�� Java ?��?��?���? ?��?��보자.
 * 
 * [?��?��]
 * JDK 1.0 : Date --> JDK 1.1 : Calendar --> JDK 1.8 : java.time
 * 
 *  ?��?�� Date?�� ??�?분의 메서?��?�� Deprecated ?��?��. ?��?��?�� 권장?���??�� ?��?��?��.
 *  
 */
public class DateCalendar {
	
	public static void main(String[] args) {
		
		//intro
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();

		/*SimpleDateFormat ?���? ?��?��?���? ?��?��?�� ?��?���? ?��?��?���? 출력?���?
		 * DateFormat 추상?��?��?�� --> SimpleDateFormat 구현?��?��?��
		 * G : AD, BC - ?��??
		 * y : 2019 - ?��?��
		 * M : 10 | 10?�� | OCT - ?��
		 * w : 1~53 - ?��?�� �? 번째 �?
		 * W : 1~5 - ?��?�� �? 번째 �?
		 * D : 1~366 - ?��?�� �? 번째 ?��
		 * d : 1~31 - ?��?�� �? 번째 ?��
		 * E : ?��~?�� - ?��?��
		 * a : ?��?��/?��?�� | AM/PM
		 * H : 0~23 - ?���?
		 * h : 1~12 - ?���?
		 * m : 0~59 - �?
		 * s : 0~59 - �?
		 * ` : escape문자(?��?��문자�? ?��?��?�� ?�� ?��?��)
		 * z : Time zone, General time zone
		 * Z : Time zone, RFC 822 time zone
		 */
		
		//기본 ?��?���?
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String result = df.format(today);
		System.out.println(result);
		
		//Date ?��?��?��?���? format메서?��?�� ?��?��?�� ?�� ?��?��
		Calendar cal = Calendar.getInstance();
		cal.set(2005,9,3);
		Date day = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss  E?��?��");
		System.out.println(sdf.format(day));
		
	}
}
