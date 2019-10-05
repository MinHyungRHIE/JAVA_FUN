package thread._02.controlThread;

/**
 * 데몬 쓰레드는 데몬 쓰레드가 아닌 쓰레드의 작업을 돕는 보조적인 쓰레드
 * 일반 쓰레드가 모두 종료되면 데몬 쓰레드는 강제로 종료된다.
 */
public class Daemon extends Thread{
	
	static boolean autoSave = false;
	
	@Override
	public void run() {
		while(true) {
			try{Thread.sleep(3000);}catch(Exception e) {}
			if(autoSave) {
				autoSave();
			}
		}
	}
	
	public void autoSave() {
		System.out.println("자동 저장 완료");
	}
	
	public static void main(String[] args) {
		Thread t = new Daemon();
		t.setDaemon(true); //start() 이전, 이 작업이 없으면 무한루프됨
		t.start();
		
		for(int i=1;i<=10;i++) {
			try {Thread.sleep(1000);}catch(Exception e) {}
			System.out.println(i);
			if(i == 5) {
				autoSave = true;
			}
		}
		System.out.println("프로그램 종료");
	}
}
