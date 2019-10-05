package tmp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UsageDateTimeFormatter {

	public static void main(String[] args) {
		
		//?•„?˜?? ê°™ì´ DateTimeFormatter?—?Š” ?ƒ?ˆ˜ë¡? ? •?˜?œ ?—¬?Ÿ¬ ?˜•?‹?“¤?´ ?ˆ?‹¤.
		DateTimeFormatter example = DateTimeFormatter.ISO_LOCAL_DATE;
		
		LocalDateTime now = LocalDateTime.now();
		
		String yyyymmdd = example.format(now);
		System.out.println(yyyymmdd);
		
		//ì¶œë ¥?˜•?‹ ì§ì ‘ ? •?˜
		DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("yyyy?…„ MM?›” dd?¼");
		
		String result = customFormat.format(now);
		System.out.println(result);
	}
}
