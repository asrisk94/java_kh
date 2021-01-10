package kh.java.thread;

public class ThreadTest {

	public static void main(String[] args) {
		
		ThreadTest tt = new ThreadTest();
		
//		tt.test();
//		tt.test2();
		tt.test3();

	}
	
	// 멀티쓰레드 2번쨰 방법 : Runnable 클래스 구현
	public void test3() {
		Thread th1 = new Thread(new MyRunnable('-'));
		Thread th2 = new Thread(new MyRunnable('|'));
		
		th1.setPriority(Thread.MAX_PRIORITY);
		
		th1.start();
		th2.start();
	}
	
	
	
	// 멀티 쓰레드 1번방법 : Thread 클래스를 상속한 객체 만들기
		public void test2() {
			
			Thread th1 = new MyThread('-');
			Thread th2 = new MyThread('|');
		
			// 각 쓰레드 시작
			th1.start();
			th2.start();
			
		}
	
	
	
	// 싱글쓰레드
	public void test() {
		a('-');
		b('|');
		
		
	}
	
	private void a(char c) {
		for(int i=0; i<100; i++) {
			System.out.print(c);
		}
	}
	
	private void b(char c) {
		for(int i=0; i<100; i++) {
			System.out.print(c);
		}
	}
	
}
