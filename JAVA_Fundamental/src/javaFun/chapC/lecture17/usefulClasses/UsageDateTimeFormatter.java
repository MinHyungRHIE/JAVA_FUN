package javaFun.chapC.lecture17.usefulClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UsageDateTimeFormatter {

	public static void main(String[] args) {
		
		//아래와 같이 DateTimeFormatter에는 상수로 정의된 여러 형식들이 있다.
		DateTimeFormatter example = DateTimeFormatter.ISO_LOCAL_DATE;
		
		LocalDateTime now = LocalDateTime.now();
		
		String yyyymmdd = example.format(now);
		System.out.println(yyyymmdd);
		
		//출력형식 직접 정의
		DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		
		String result = customFormat.format(now);
		System.out.println(result);
	}
}
