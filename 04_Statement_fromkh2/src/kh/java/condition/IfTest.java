package kh.java.condition;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
	
		IfTest f = new IfTest();
//		f.test1();
//		f.test2();
//		f.test3();
//		f.test4();
		f.test5();
		
	}
	
	/**
	 * @실습문제 : 
	 * 두수를 입력받아서 그중 큰수와 작은수를 차례로 출력하세요.
	 * 같다면 "두수는 같습니다"
	 */
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int a = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(a + ", " + b);
		}
		else if(a < b) {
			System.out.println(b + ", " + a); 
			//10 20
			//20 + ", " + 10 -> "20, " + 10 -> "20, 10"
		}
		else {
			System.out.println("두수는 같습니다.");
		}
	}
	
	
	/**
	 * 여러개의 if문으로 구현
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int num = sc.nextInt();
		char grade = ' '; //공백문자
		
		if(num >= 90) {
			System.out.println('A');
			grade = 'A';
		}
		
		if(num >= 80 && num < 90) {
			System.out.println('B');
			grade = 'B';
		}
		
		if(num >= 70 && num < 80) {
			System.out.println('C');
			grade = 'C';
		}
		
		if(num >= 60 && num < 70) {
			System.out.println('D');
			grade = 'D';
		}
		
		if(num < 60){
			System.out.println('F');
			grade = 'F';
		}
		
		System.out.printf("점수 : %d%n학점 : %c%n", num, grade);
		
		
	}
	
	/**
	 * if ...
	 * else if ...
	 * [else]
	 * 
	 * 여러 조건식을 직렬화한다.
	 * 참인 조건식의 if문이 실행된다.
	 * if블럭 실행시 나머지블럭을 건너뛰고, 전체조건문을 빠져나간다.
	 * 
	 * 90 ~ 100 : A
	 * 80 ~ 89 : B
	 * 70 ~ 79 : C
	 * 60 ~ 69 : D
	 * 60미만 : F
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int num = sc.nextInt();
		char grade = ' '; //공백문자
		
		//유효성검사
		if(num >= 0 && num <= 100) {
			
			//정상입력
			if(num >= 90) {
				System.out.println('A');
				grade = 'A';
			}
			else if(num >= 80) {
				System.out.println('B');
				grade = 'B';
			}
			else if(num >= 70) {
				System.out.println('C');
				grade = 'C';
			}
			else if(num >= 60) {
				System.out.println('D');
				grade = 'D';
			}
			else {
				System.out.println('F');
				grade = 'F';
			}
			
			System.out.printf("점수 : %d%n학점 : %c%n", num, grade);
			
		}
		else {
			//입력값 오류
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		
		
	}
	
	/**
	 * if ... else
	 * 
	 * if절 또는 else절 중에 하나는 무조건 실행된다.
	 */
	public void test2() {
		int a = 8;
		
		//홀수인 경우에 true
		if(a % 2 != 0) {
			System.out.println("a는 홀수 입니다.");
		}
		else {
			System.out.println("a는 짝수 입니다.");
		}
		
		//@실습문제 : 사용자나이를 입력받고, 
		//20살이상인 경우만 성인인증되었습니다. 출력
		//20살미만이라면 성인인증에 실패했습니다. 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인인증되었습니다.");
		}
		else {
			System.out.println("성인인증 실패했습니다.");
		}
		
		
		
	}
	
	/**
	 * if
	 * 
	 * if절이 실행되지 않을수도 있다.
	 */
	public void test1() {
		int a = -10;
		//조건식 : 결과가 논리형
		if(a > 0) {
			System.out.println("a는 0보다 큽니다.");
		}
		
		System.out.println("--- 종료 ---");
	}
	
	
	
}
