package tmp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UsageDateTimeFormatter {

	public static void main(String[] args) {
		
		//?��?��?? 같이 DateTimeFormatter?��?�� ?��?���? ?��?��?�� ?��?�� ?��?��?��?�� ?��?��.
		DateTimeFormatter example = DateTimeFormatter.ISO_LOCAL_DATE;
		
		LocalDateTime now = LocalDateTime.now();
		
		String yyyymmdd = example.format(now);
		System.out.println(yyyymmdd);
		
		//출력?��?�� 직접 ?��?��
		DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("yyyy?�� MM?�� dd?��");
		
		String result = customFormat.format(now);
		System.out.println(result);
	}
}
