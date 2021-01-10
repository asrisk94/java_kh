package kh.java.thread;

public class SleepThread implements Runnable {
	
	private char c;
	private long millis;
	
	public SleepThread(char c, long millis) {
		this.c = c;
		this.millis = millis;
	}

	@Override
	public void run() {
		
		for(int i=0; i<100; i++) {
			System.out.print(c);
			
			// 현재 쓰레드를 해당 밀리초 중지 (밀리초 단위)
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
