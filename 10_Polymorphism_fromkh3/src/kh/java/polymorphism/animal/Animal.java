package kh.java.polymorphism.animal;

/**
 * 추상클래스와 인터페이스 interface
 * 1. 공통점
 * 		- 객체화 할 수 없다.
 * 		- 추상메소드를 가질 수 있다.
 * 
 * 2. 차이점
 * 
 * 	a. 추상클래스
 * 		- 추상메소드를 0개이상 가지고 있는 경우(객체화 방지 목적으로 사용)
 * 		- 추상메소드를 하나이상 가지고 있다면, 해당클래스는 반드시 추상클래스여야 한다. 
 * 		- 일반클래스 : 일반 필드, 일반메소드를 가질 수 있다.
 * 
 *  b. 인터페이스
 *  	- 일반클래스가 아닌 자식클래스의 규격화만을 위한 목적
 *  	- 일반 필드, 일반 메소드를 가질 수 없다.
 *  	- 상수 필드, 추상메소드만 가질 수 있다.
 *
 *
 */
public abstract class Animal {
	
	//일반 필드, 메소드를 가질 수 있다.
	String name;
	
	public void eat() {
		System.out.println("밥을 냠냠!");
	}

//	public void say() {
//		System.out.println("안녕하세요, 저는 동물입니다.");
//	}
	
	/**
	 * 추상메소드(미완성)
	 * - 메소드 몸통부 없다.
	 * - abstract키워드 사용
	 * - 접근제한자, 리턴타입, 메소드명, 매개변수선언부 작성
	 * 
	 */
	public abstract void say();
}




