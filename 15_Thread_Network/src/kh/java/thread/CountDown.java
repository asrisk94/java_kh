package kh.java.thread;

public class CountDown implements Runnable {
	
	

	@Override
	public void run() {
		for(int i=10; i>=0; i--) {
			System.out.print(Thread.currentThread().getName() + " : ");
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
//				e.printStackTrace();
				System.out.println("카운트다운 중지");	// interrupt 처리시의 방식의 예
				return;
			}
		}
	}

}
