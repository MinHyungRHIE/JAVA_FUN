package javaLec.abstracts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenericServletImpl2 extends GenericServlet {
	@Override
	public void service() throws IOException {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("?��무거?�� ?��?��?�� 주세?��~ 종료?��?��?���? \'/terminate\'?�� ?��?��?��?��?��");
			String msg = keyboard.readLine();
			if(msg.equals("/quit")) {
				break;
			}
			System.out.println(msg);
		}
	}
	
	public static void main(String[] args) throws IOException {
		GenericServletImpl2 useServlet = new GenericServletImpl2();
		useServlet.init();
		useServlet.service();
		useServlet.destroy();
	}
}
