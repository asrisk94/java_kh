package kh.java.loop;

import java.util.Scanner;

/**
 * for
 * 
 * while
 * 
 * do ~ while
 */
public class ForLoopTest {

	public static void main(String[] args) {
	
		ForLoopTest f = new ForLoopTest();
//		f.test1();
//		f.test2();
//		f.test3();
		f.test4();
		
	}
	
	/**
	 * 블럭 스코프
	 */
	public void test4() {
		int sum = 0;	
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		for(int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i
		}
		System.out.println(sum);
		
		//1부터 사용자가 입력한 양수까지의 합을 구하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 입력 : ");
		int n = sc.nextInt();
		sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
	}
	
	/**
	 * 이름을 반복 출력해드립니다.
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("반복 횟수 : ");
		int num = sc.nextInt();//3
		
		for(int i = 0; i < num; i++) {
			System.out.println((i + 1) + name);
		}
		
		
	}
	
	/**
	 * @실습문제 : 구구단 2단
	 * 
	 * 2 * 1 = 2
	 * 2 * 2 = 4
	 * 2 * 3 = 6
	 * 2 * 4 = 8
	 * 2 * 5 = 10
	 * 2 * 6 = 12
	 * 2 * 7 = 14
	 * 2 * 8 = 16
	 * 2 * 9 = 18
	 *  
	 */
	public void test2() {
		int dan = 5;
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	/**
	 for(초기식; 조건식; 증감식){
	 	//반복실행구문	 
	 }
	
	 - 초기식 : for문실행시 최초 1회만 실행. 증감변수를 선언.
	 - 조건식 : 매턴마다 검사해서 true면 반복구문 실행, false면 반복문 종료
	 - 증감식 : 매턴마다 증감변수 처리
	 
	 처리순서
	 1. 초기식 
	 2. 조건식
	 3. 반복구문 실행
	 4. 증감식
	 
	 5. 조건식
	 6. 반복구문 실행
	 7. 증감식
	 ...
	 8. 조건식 false이면 반복문 중지
	 
	 
	 - 몇 번 반복할 것인가? 10
	 - 증감변수는 어떻게 변화하는가? 11 ... 20
	 
	 */
	public void test1() {
		
//		for(int i = 1; i <= 10; i += 1) {			
//			System.out.println((i + 10) + " Hello World~");
//		}
		
		//10 ~ 1
//		for(int i = 10; i >= 1; i--) {
//			System.out.println(i);
//		}
		
		//1부터 20사이의 홀수를 출력
		// 1 3 5 7 9 11 13 15 17 19
//		for(int i = 1; i < 20; i += 2) {
//			System.out.print(i + " ");
//		}
		System.out.println();
		
		//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//		for(int i = 1; i < 20; i++) {
//			if(i % 2 != 0) {
//				System.out.print(i + " ");	
//			}
//		}
		
		System.out.println();
		
		//20 18 16 14 12 10 8 6 4 2
		for(int i = 20; i > 0; i -= 2) {			
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i = 20; i > 0; i--) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
	}
	
}
