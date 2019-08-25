package javaLec.abstracts;

public abstract class GenericServlet implements Servlet {

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
	public void destroy() {
		System.out.println("종료");
	}
	
}
