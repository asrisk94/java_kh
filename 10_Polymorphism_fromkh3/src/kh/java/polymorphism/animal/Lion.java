package kh.java.polymorphism.animal;

public class Lion extends Animal implements Barkable, Runnable {

	public void kick() {
		System.out.println("라이언 킥을 날립니다.");
	}
	
	@Override
	public void say() {
		System.out.println("안녕하세요, 라이언입니다.");
	}
	
	@Override
	public void bark() {
		System.out.println("라이언이 크아악!");
	}
	
	@Override
	public void run() {
		System.out.println("라이언이 " + NUM_OF_LEGS + "다리로 엄청 빨리 달립니다.");
	}
	
}
