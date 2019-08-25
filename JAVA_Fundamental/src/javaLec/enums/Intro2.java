package javaLec.enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intro2 {


	static final String ONE = "1";
	static final String TWO = "2";
	static final String THREE = "3";
	static final String FOUR = "4";
	static final String QUIT = "/quit";


	public static void main(String[] args) throws IOException {
		
		
		
		boolean isQuit = false;

		while(true) {
			String msg = new BufferedReader(new InputStreamReader(System.in)).readLine();

			switch(msg) {
			case ONE:
				System.out.println("1?„ ?…? ¥?•˜?…¨?Šµ?‹ˆ?‹¤.");
				break;
			case TWO:
				System.out.println("2ë¥? ?…? ¥?•˜?…¨?Šµ?‹ˆ?‹¤.");
				break;
			case THREE:
				System.out.println("3?„ ?…? ¥?•˜?…¨?Šµ?‹ˆ?‹¤.");
				break;
			case FOUR:
				System.out.println("4ë¥? ?…? ¥?•˜?…¨?Šµ?‹ˆ?‹¤.");
				break;
			case QUIT:
				isQuit = true;
				break;
			default:
				System.out.println("1~4?‚¬?´?˜ ?ˆ«?ë¥? ?…? ¥?•´ì£¼ì„¸?š”");
				System.out.println("ì¢…ë£Œ?•˜?‹œ? ¤ë©? /quit?„ ?…? ¥?•˜?„¸?š”");
			}

			if(isQuit) {
				System.out.println("?”„ë¡œê·¸?¨ ì¢…ë£Œ");
				break;
			}
		}
	}
}
