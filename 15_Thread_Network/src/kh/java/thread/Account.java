package kh.java.thread;

public class Account {
	
	private int balance;
	
	public Account() {}
	public Account(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}

	
	
	// 출금 메소드
	public void withdraw(int money) {
//	public synchronized void withdraw(int money) {	// 싱크로나이즈드를 붙여 동기화
		
		String name = Thread.currentThread().getName();
		
		
		synchronized(this) {	// 메소드에 붙이는게 아니라 블록 지정
			
			System.out.println(name + " >> 현재잔액 : " + balance + "원");
			if(money > balance) {
				System.out.println(name + " >> 잔액이 부족합니다.");
			}
			else {
				balance -= money;
				System.out.println(name + " >> 출금 : " + money + "원, 잔액 : " + balance + "원");
			}
		}
		
	}
	
}
