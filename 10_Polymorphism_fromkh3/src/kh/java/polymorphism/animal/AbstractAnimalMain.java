package kh.java.polymorphism.animal;

/**
 * 부모클래스의 메소드 오버라이딩 강제화
 * - 부모클래스 추상메소드(미완성메소드)
 * 
 * 추상메소드를 하나라도 가지고 있다면, 추상클래스가 된다.
 * - 객체화할 수 없다.
 *
 * 자식클래스마다 달라져야 하는 필수적인 기능이 있다면,
 * 추상메소드 사용을 권장한다.
 *
 */
public class AbstractAnimalMain {

	public static void main(String[] args) {
		AbstractAnimalMain aam = new AbstractAnimalMain();
//		aam.test1();
		
//		aam.test2();
		
//		aam.test3();
		
		aam.test4();
	}
	
	/**
	 * @실습문제 : Animal클래스를 상속하고, 
	 * Flyable인터페이스를 구현한 Eagle클래스를 작성하세요.
	 * 
	 * Flyable인터페이스 
		    추상메소드 : void fly()
		    상수필드 : int NUM_OF_WINGS = 2
		 
 		출력 : "안녕하세요, 이글이글입니다."
 			  "독수리가 2날개로 시속128km로 납니다."
	 */
	public void test4() {
		Eagle eagle = new Eagle();
		eagle.say();
		eagle.fly();
		
		Flyable fEagle = new Eagle();
		((Animal)fEagle).say();
		fEagle.fly();
		
	}
	
	
	public void test3() {
//		System.out.println(Runnable.NUM_OF_LEGS);
		
		Runnable rTiger = new Tiger();
		rTiger.run();
		
		Runnable rLion = new Lion();
		rLion.run();
		
		Runnable[] arr = new Runnable[3];
		arr[0] = rTiger;
		arr[1] = rLion;
		
		for(Runnable r : arr) {
			if(r != null)
				r.run();
		}
		
	}
	
	/**
	 * 인터페이스
	 */
	public void test2() {
//		Barkable b = new Barkable();
		Barkable bLion = new Lion();
		bLion.bark();
		
		Barkable bTiger = new Tiger();
		bTiger.bark();
		
		Barkable[] arr = new Barkable[2];
		arr[0] = bLion;
		arr[1] = bTiger;
		
		for(Barkable b : arr)
			b.bark();
		
		//주의점
		//Barkable타입 참조변수에 담기면 
		//Barkable인터페이스가 가진 메소드만 사용가능
//		bLion.say();
		((Lion)bLion).say();
		((Animal)bLion).say();
		
	}
	
	public void test1() {
		//추상클래스는 객체화 할수 없다.
//		Animal a = new Animal();
		
	}

}
