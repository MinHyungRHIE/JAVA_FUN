package javaLec.abstracts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenericServletImpl extends GenericServlet{

	@Override
	public void service() throws IOException {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("?•„ë¬´ê±°?‚˜ ?…? ¥?•´ ì£¼ì„¸?š”~ ì¢…ë£Œ?•˜?‹œ? ¤ë©? \'/quit\'?„ ?…? ¥?•˜?„¸?š”");
			String msg = keyboard.readLine();
			if(msg.equals("/quit")) {
				break;
			}
			System.out.println(msg);
		}
	}
	
	public static void main(String[] args) throws IOException {
		GenericServletImpl useServlet = new GenericServletImpl();
		useServlet.init();
		useServlet.service();
		useServlet.destroy();
	}
	
}
