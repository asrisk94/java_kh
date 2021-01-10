package kh.java.polymorphism.animal;

public class Eagle extends Animal implements Flyable {

	@Override
	public void say() {
		System.out.println("안녕하세요, 이글이글입니다.");
	}
	
	@Override
	public void fly() {
		System.out.println("이글이글이 " + NUM_OF_WINGS + "날개로 시속128km로 납니다.");
	}
}
