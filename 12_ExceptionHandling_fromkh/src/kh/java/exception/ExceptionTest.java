package kh.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception을 try~catch구문을 이용해서 처리
 * -> 프로그램 비정상종료를 방지
 *
 */
public class ExceptionTest {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ExceptionTest e = new ExceptionTest();
//		e.test1();
//		e.test2();
//		e.test3();
//		e.test4();
//		e.test5();
		e.test6();
		
		System.out.println("=== 프로그램 정상 종료 ===");
	}
	
	/**
	 * CheckedException
	 * 예외처리  강제화
	 */
	public void test6() {
		String fileName = "test.txt";
		
		try {
			FileReader fr = new FileReader(fileName);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @실습문제: 사용자에게 두 정수를 입력받고, 
	 * 두수의 합, 차, 곱, 나누기, 나머지를 출력
	 * 이를 반복제공할 것.
	 * 
	 * 정수1: 7
	 * 정수2: 3
	 * -> 합:10, 차:4, 곱:21, 몫:2, 나머지:1
	 * -> 계속 하시겠습니까?(y/n):y
	 * 
	 */
	public void test5() {
		while(true) {
			try {
				System.out.print("정수1:");
				int a = sc.nextInt();
				System.out.print("정수2:");
				int b = sc.nextInt();
				
				if(a < 0 || b < 0) {
					System.out.println("음수를 입력할 수 없습니다.");
					continue;
//					throw new RuntimeException("음수입력");
				}
				
				System.out.printf("합 : %d, 차 : %d, 곱 : %d, 몫 : %d, 나머지 : %d%n",
						a + b,
						a - b,
						a * b,
						a / b,
						a % b
						);
				System.out.print("계속 하시겠습니까?(y/n) : ");
				char yn = sc.next().toLowerCase().charAt(0);
				if(yn == 'n')
					break;
			} catch(InputMismatchException e) {
				System.out.println("올바른 정수를 입력하세요.");
				sc.next();//잘못입력값 버퍼에서 지우기
			} catch(Exception e) {
				System.out.println("처리중 오류가 발생했습니다. 다시 시작합니다.");
			}
			
		}
		
	}
	
	/**
	 * try~catch블럭에서 변수선언
	 */
	public void test4() {
		int x = 0;
		
		while(true) {
			try {
				System.out.print("정수 입력 : ");
				x = sc.nextInt();
				break;
			} catch(Exception e) {
				System.out.println("유효한 정수를 입력해주세요.");
	//			e.printStackTrace();
				
				//버퍼비우기용
				sc.next();
			}
		}
		
		if(x % 2 == 0)
			System.out.println("짝수 입니다.");
		else 
			System.out.println("홀수 입니다.");
		
	}
	
	/**
	 * finally
	 * 예외가 발생하든 안하든 무조건 실행되는 구문.
	 * 사용한 자원 반납 용도로 사용
	 * try절안에서 return(조기리턴)사용시에도 실행된다.
	 */
	public void test3() {
		System.out.println(1);
		try {
			System.out.println(2);
			
			String s = null;
//			System.out.println(s.length());
			
			if(true)
				return;//조기리턴
			
			System.out.println(3);
		} catch(Exception e) {
			System.out.println(4);
		} finally {
			//예외가 발생하든 안하든 무조건 실행되는 구문.
			System.out.println("finally");
		}
		System.out.println(5);
	}
	
	/**
	 * catch절 작성요령
	 * 1. 상속관계가 없다면 순서는 상관없다.
	 * 2. 상속관계가 있다면, 자식-부모클래스 순으로 작성
	 * 3. 다형성이 적용되므로, 부모예외클래스 catch절에서 자식예외객체를 처리할 수 있다.
	 */
	public void test2() {
		System.out.println(1);
		try {
			System.out.println(2);
			
			int[] arr = new int[3];
			System.out.println(arr[3]);

			String s = null;
			System.out.println(s.length());
			
			System.out.println(3);
			
		
			
//		} catch(NullPointerException e) {
//			System.out.println(4);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(5);
//		} catch(RuntimeException e) {
//			
		} catch(Exception e) {
			
		}
		
		System.out.println(6);
	}
	
	public void test1() {
		
		try {
			//예외가 발생할 수 있는 코드 작성
			System.out.print("정수1 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 입력 : ");
			int num2 = sc.nextInt();
			
			System.out.printf("%d / %d => %d%n", num1, num2, num1 / num2);
			//java.lang.ArithmeticException: / by zero
			
		} catch(ArithmeticException e) {
			//해당예외가 발생했을 경우 처리구문
			System.out.println("ArithmeticException이 발생!");
			System.out.println("정수2는 0일 수 없습니다.");
			System.out.println("message : " +  e.getMessage());
			e.printStackTrace();
			
		} catch(InputMismatchException e) {
			//해당예외가 발생했을 경우 처리구문
			System.out.println("유효한 정수를 입력하셔야 합니다 ");
			System.out.println("message : " +  e.getMessage());
		} 
 		
		
	}

}
