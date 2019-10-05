package thread._01_intro;

class ThreadA extends Thread{
	
	@Override
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class StartAndRun {
	public static void main(String[] args) throws Exception{
		/* run()과 start()의 차이
		 *  main메서드에서 run()을 호출하는 것은 생성된 쓰레드를 실행
		 *  시키는 것이 아니라 단순히 클래스에 선언된 메서드를 호출하는 것
		 *  
		 *  start()는 새로운 쓰레드가 작업을 실행하는데 필요한 call stack을
		 *  생성한 다음에 run()을 call stack에 호출
		 */
		new ThreadA().start();
		System.out.println("=========================");
		ThreadA th = new ThreadA();
		th.start(); //main()쓰레드의 call stack과 다르다는 것을 확인 가능
		System.out.println("run thread가 예외처리로 종료되어도");
		System.out.println("call stack을 생성해서 처리하기 때문에 ");
		System.out.println("main thread는 살아있다.");
		System.out.println("그래서 여기까지 출력이 된다.");
		System.out.println("=========================");
		Thread.sleep(3000);
		th.run(); //main()쓰레드의 call stack에 있다는 것을 확인 가능
	}
}
