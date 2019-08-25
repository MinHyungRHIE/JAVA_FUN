package javaLec.abstracts;

import java.io.IOException;

//init() -> service() -> destroy()
public interface Servlet {
	
	public String getServletConfig(); //GenericServlet?��?�� 구현?��
	public String getServletInfo();//GenericServlet?��?�� 구현?��
	
	public void init();//GenericServlet?��?�� 구현?��
	public void service() throws IOException;
	public void destroy();//GenericServlet?��?�� 구현?��
	
}
