package javaLec.abstracts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
getServletInfo()
getServletConfig()
init()
service()
destroy()

?��중에?�� ?��리�? 직접 구현?��?�� �?분�? service()밖에 ?��?��...
?���?�? Servlet ?��?��?��?��?���? ?��?��?�� ?��마다 ?��머�? 메소?���? 구현?��?��?��?�� 번거?��???�� ?��긴다.
-->추상?��?��?��
 */

public class ServletImpl implements Servlet{

	@Override
	public String getServletConfig() {
		return "Servlet ?��?��";
	}

	@Override
	public String getServletInfo() {
		return "Servlet ?��?�� ?���? 출력";
	}

	@Override
	public void init() {
		System.out.println("초기?��");
	}

	@Override
	public void service() throws IOException {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("?��무거?�� ?��?��?�� 주세?��~ 종료?��?��?���? \'/quit\'?�� ?��?��?��?��?��");
//			Scanner sc = new Scanner(System.in);
			String msg = keyboard.readLine();
			if(msg.equals("/quit")) {
				break;
			}
			System.out.println(msg);
		}
	}

	@Override
	public void destroy() {
		System.out.println("종료");
	}
	
	public static void main(String[] args) throws IOException {
		ServletImpl useServlet = new ServletImpl();
		useServlet.init();
		useServlet.service();
		useServlet.destroy();
	}
}
