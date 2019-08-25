package javaLec.enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Commander{
	String ONE ="1", TWO="2", THREE="3", FOUR="4", QUIT="/quit";
}

public class Intro {
	
	public static void main(String[] args) throws IOException {

		boolean isQuit = false;
		
		while(true) {
			String msg = new BufferedReader(new InputStreamReader(System.in)).readLine();

			switch(msg) {
			case Commander.ONE:
				System.out.println("1?�� ?��?��?��?��?��?��?��.");
				break;
			case Commander.TWO:
				System.out.println("2�? ?��?��?��?��?��?��?��.");
				break;
			case Commander.THREE:
				System.out.println("3?�� ?��?��?��?��?��?��?��.");
				break;
			case Commander.FOUR:
				System.out.println("4�? ?��?��?��?��?��?��?��.");
				break;
			case Commander.QUIT:
				isQuit = true;
				break;
			default:
				System.out.println("1~4?��?��?�� ?��?���? ?��?��?��주세?��");
				System.out.println("종료?��?��?���? /quit?�� ?��?��?��?��?��");
			}
			
			if(isQuit) {
				System.out.println("?��로그?�� 종료");
				break;
			}
		}



	}
}
