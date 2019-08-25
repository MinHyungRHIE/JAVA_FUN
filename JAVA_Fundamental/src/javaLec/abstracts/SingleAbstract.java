package javaLec.abstracts;

public abstract class SingleAbstract {
	
	public abstract void service();
	
	public void init() {
		System.out.println("초기?��");
	}
	
	public void destroy() {
		System.out.println("종료");
	}
}
