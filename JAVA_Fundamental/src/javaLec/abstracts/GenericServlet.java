package javaLec.abstracts;

public abstract class GenericServlet implements Servlet {

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
	public void destroy() {
		System.out.println("ì¢…ë£Œ");
	}
	
}
