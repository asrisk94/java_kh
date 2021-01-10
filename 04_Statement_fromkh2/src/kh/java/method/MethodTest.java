package kh.java.method;

import java.util.Scanner;

/**
 * 메소드
 *  - 처리절차를 모아둔 곳 -> 반복적인 작업을 한번만 작성해서 처리
 *  
 *  - 매개변수 : 메소드 호출시에 전달된 값이 담기는 변수
 *  - 리턴값 : 메소드 호출 결과값. 없거나(void) 특정하나의 타입을 가진다.
 *  
 *
 */
public class MethodTest {

	public static void main(String[] args) {
		
		MethodTest m = new MethodTest();
//		m.test1();
		m.test2();
		
		System.out.println("프로그램 종료!");
		return;
	}
	
	/**
	 * 리턴값
	 */
	public void test2() {
		int a = inputNumber();
		System.out.printf("[%d]를 입력하셨습니다.%n", a);
		int b = inputNumber();
		System.out.printf("[%d]를 입력하셨습니다.%n", b);
		int c = inputNumber();
		System.out.printf("[%d]를 입력하셨습니다.%n", c);
		return;//메소드 호출부로 즉시 돌아가라.
	}
	
	public int inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		return num; // 메소드 호출부로 반환할 값
	}
	
	
	/**
	 * 매개변수 : 메소드 선언부에 정의된 변수
	 * 매개인자(인수) : 메소드 호출시 전달되는 값
	 */
	public void test1() {
		String name = "홍길동";
		int age = 30;
//		printName(name);
		printPerson(name, age);
		
		name = "신사임당";
		age = 50;
//		printName(name);
		printPerson(name, age);
		
	}
	
	/**
	 * 이름 나이 출력 메소드
	 */
	public void printPerson(String name, int age) {
		System.out.printf("제 이름은 %s이고, %d살입니다.%n", name, age);
	}
	
	
	public void printName(String name) {
		System.out.printf("안녕, 내이름은 %s야~ 반갑다!!%n", name);
	}
	
}







