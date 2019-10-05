package thread._01_intro;

import java.util.HashSet;

/**
 * Thread를 상속받은 Runnable을 구현하든 다 똑같음
 * 단지, Runnable을 구현한 클래스는 Thead 생성자에 인자로 넣어야 됨
 */
class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(getName());
		}
	}
}

class MyThread2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class ThreadAndRunnable {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		
		MyThread2 r = new MyThread2();
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();
	}
}
