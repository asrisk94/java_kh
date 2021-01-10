package kh.java.thread;

import javax.swing.JOptionPane;

public class ThreadControlTest {
	
	/*
	 *  쓰레드 제어
	 *   - sleep()
	 *   - join()
	 *   = interrupt()
	 */
	public static void main(String[] args) {
		
		ThreadControlTest tct = new ThreadControlTest();
		
//		tct.test();
		tct.test2();
//		tct.test3();
		
		System.out.println(Thread.currentThread().getName() + " 종료!");
	}
	
	
	
	/*
	 * interrupt
	 *  - 해당 쓰레드에 interrupt를 호출해서 InterruptException 유발
	 *  - catch절에 처리구문 작성
	 *  
	 *  예전에는 바로 멈출 수 있는 stop()이 있었으나, 동기화 문제 등으로 제거됨.
	 *  interrupt()를 활용하여 우회적으로 정지함.
	 */
	
	public void test3() {
		Thread cd = new Thread(new CountDown());
		
		cd.setName("CounTDown");
		cd.start();
		
		// 중지
		if("exit".equals(JOptionPane.showInputDialog("중지하려면 exit를 입력하세요.")))
		cd.interrupt();
		
	}
	
	
	
	/*
	 * daemon Thread 
	 *   - 일반 쓰레드에 종속된 쓰레드 (백그라운드 쓰레드)
	 *   - 일반 쓰레드 종료시 자동 종료된다.
	 */
	public void test2() {
		
		Thread countDown = new Thread(new CountDown());
		countDown.setName("카운트다운 쓰레드");
//		countDown.setDaemon(true);			// 데몬쓰레드로 하겠다. 참
		countDown.start();
		
		// 사용자 입력값을 기다렸다가 출력
		String input = JOptionPane.showInputDialog("아무 문자열이나 입력하세요.");
		System.out.println(input);	// 하나의 작업이 남아있기 때문에 메인 쓰레드가 종료되지 않음.
		
		// join : 조인할 쓰레드에 대해 호출
		try {
			countDown.join();
			countDown.join(1000); 	// 1초 기다렸다 진행(밀리초) (아직 조인된 쓰레드 안끝났는데 시간이 다되면 오히려 빨리 끝날 수 있음) 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public void test() {
		Thread th1 = new Thread(new SleepThread('-', 100));
		Thread th2 = new Thread(new SleepThread('|', 200));
		
		th1.start();
		th2.start();
	}

}
