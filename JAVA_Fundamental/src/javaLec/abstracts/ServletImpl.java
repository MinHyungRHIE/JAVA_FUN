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

?´ì¤‘ì—?„œ ?š°ë¦¬ê? ì§ì ‘ êµ¬í˜„?•˜?Š” ë¶?ë¶„ì? service()ë°–ì— ?—†?‹¤...
?•˜ì§?ë§? Servlet ?¸?„°?˜?´?Š¤ë¥? ?‚¬?š©?•  ?•Œë§ˆë‹¤ ?‚˜ë¨¸ì? ë©”ì†Œ?“œë¥? êµ¬í˜„?•´?•¼?•˜?Š” ë²ˆê±°?Ÿ¬???´ ?ƒê¸´ë‹¤.
-->ì¶”ìƒ?´?˜?Š¤
 */

public class ServletImpl implements Servlet{

	@Override
	public String getServletConfig() {
		return "Servlet ?„¤? •";
	}

	@Override
	public String getServletInfo() {
		return "Servlet ?„¤? • ? •ë³? ì¶œë ¥";
	}

	@Override
	public void init() {
		System.out.println("ì´ˆê¸°?™”");
	}

	@Override
	public void service() throws IOException {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("?•„ë¬´ê±°?‚˜ ?…? ¥?•´ ì£¼ì„¸?š”~ ì¢…ë£Œ?•˜?‹œ? ¤ë©? \'/quit\'?„ ?…? ¥?•˜?„¸?š”");
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
		System.out.println("ì¢…ë£Œ");
	}
	
	public static void main(String[] args) throws IOException {
		ServletImpl useServlet = new ServletImpl();
		useServlet.init();
		useServlet.service();
		useServlet.destroy();
	}
}
