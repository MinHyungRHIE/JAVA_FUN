package javaLec.abstracts;

import java.io.IOException;

//init() -> service() -> destroy()
public interface Servlet {
	
	public String getServletConfig(); //GenericServlet?—?„œ êµ¬í˜„?¨
	public String getServletInfo();//GenericServlet?—?„œ êµ¬í˜„?¨
	
	public void init();//GenericServlet?—?„œ êµ¬í˜„?¨
	public void service() throws IOException;
	public void destroy();//GenericServlet?—?„œ êµ¬í˜„?¨
	
}
