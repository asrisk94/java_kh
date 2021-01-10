package kh.java.thread;

public class SynchronizationTest {

	public static void main(String[] args) {
		
		SynchronizationTest sct = new SynchronizationTest();
		
		sct.test();
	}
	
	
	public void test() {
		// 계좌 객체
		Account acc = new Account(1000);
		
		// ATM 객체(쓰레드)
		Thread atm1 = new Thread(new ATM(acc));
		Thread atm2 = new Thread(new ATM(acc));
		
		atm1.setName("atm1");
		atm2.setName("atm2");
		
		atm1.start();
		atm2.start();
	}

}
