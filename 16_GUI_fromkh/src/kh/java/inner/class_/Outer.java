package kh.java.inner.class_;

/**
 * 
 * 내부클래스 inner class
 * - 외부클래스 안에서만 사용할 목적으로 작성
 * - 외부클래스의 자원(필드/메소드)에 접근이 자유롭다. private도 접근 가능
 * 
 * 종류
 * - 전역 내부클래스
 * 		- 인스턴스 내부클래스(non-static)
 * 		- 클래스 내부클래스(static)
 * - 지역 내부클래스 : 메소드 안에 선언
 * 
 */
public class Outer {
	
	private static int snum = 99;
	private int num = 999;
	
	/**
	 * 인스턴스 내부 클래스
	 * non-static 내부 클래스
	 */
	public class A {
		
		public void a() {
			System.out.println(num);
		}
		
	}
	
	/**
	 * static 내부 클래스
	 * @author user1
	 *
	 */
	public static class B {
		
		public void b() {
			//static자원은 static자원 참조 가능하다.
//			System.out.println(num);
			System.out.println(snum);
		}
		
	}
	
	/**
	 * 메소드
	 */
	public void foo() {
		
		
		
		/**
		 * 지역 내부 클래스
		 * 접근제한자 사용 불가
		 */
		class C {
			
			public void c() {
				System.out.println(num);
				System.out.println(snum);
			}
			
		}
		
		C c = new C();
		c.c();
		
		
	}
	
	public void test() {
		
		A a = new A();
		a.a();
		
		B b = new B();
		b.b();
		
		//지역내부 클래스는 메소드 밖에서 접근할 수 없다.
//		C c = new C();
		foo();
		
	}
	
	
}
