package kh.java.oop.field;

public class FieldTest {

	static int s = 99;
	int a = 100;
	
	/**
	 * f.test3()
	 * test3안의 this는 f와 같은 객체를 가리킨다.
	 * 
	 * @param k
	 */
	public void test3(FieldTest k) {
		k.a = 1;
		this.a = 200;
		
		System.out.println("this@test3 : " + this.hashCode());
		System.out.println("k@test3 : " + k.hashCode());
	}
	
	/**
	 * f.test2() 인  경우,
	 * test2메소드 안의 this는 f가 가리키는 객체이다.
	 */
	public void test2() {
		FieldTest t = new FieldTest();
		t.a = 300;
		
		System.out.println(a);
	}
	
	/**
	 * this는 현재객체를 가리키는 메소드 안의 숨은 참조변수
	 */
	public void test1() {
		int s = 5;
		int a = 8;
		System.out.println(s);
		System.out.println(a);
		
		System.out.println(FieldTest.s);
		System.out.println(this.a);
	}
	
}
