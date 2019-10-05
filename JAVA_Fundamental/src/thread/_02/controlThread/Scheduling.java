package thread._02.controlThread;

import javax.swing.JOptionPane;

/**
 *	쓰레드 제어를 위한 주요 메서드
 * sleep() : 일시정지
 * 
 * join() : 지정된 시간동안 쓰레드가 실행되도록 한다.
 * 
 * interrupt() : sleep()이나 join()에 의해 일시정지상태인 쓰레드를 깨워서 
 * 실행대기상태로 만든다. 해당 쓰레드에서는 interruptedException이 발생함으로
 * 일시정지상태를 벗어나게 된다.
 * 
 * suspend() : 쓰레드를 일시정지, resume()을 호출하면 다시 실행대기상태
 * 
 * yield() : 실행 중에 자신에게 주어진 실행시간을 다른 쓰레드에게 양보하고
 * 자신은 실행대기상태가 된다.
 * 
 *interrupt()와 interrupted()
 *interrupt()는 쓰레드에게 작업을 멈추라고 요청한다. 그러나 단지 
 *멈추라고 요청만 하는 것일 뿐 쓰레드를 강제로 종료시키지는 못한다.
 *interrupted()는 쓰레드에 interrupt()가 호출되었는지 알려준다.
 *그리고 isInterrupted()와 다르게 상태 반환 후 false로 변경된다.
 */
class ThreadEx extends Thread{
	public void run() {
		int i = 10;
		
		while(i !=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x<2500000000L;x++); // 시간 지연
		}
		
		System.out.println("카운트가 종료되었습니다.");
	}
}

/**
 * 클래스 설명: 예제
 *
 * <pre>
 * {@code
 * Listener pl = new PieListener(kitchen);
 * int n = pl.forty();
 * }
 * </pre>
 */
public class Scheduling {
	public static void main(String[] args) {
		ThreadEx th= new ThreadEx();
		th.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값 : " + input);
		th.interrupt();
		System.out.println("isInterrupted() : " + th.isInterrupted());
	}
	
	int main() {
		return 0;
	}
}
