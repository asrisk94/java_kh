package kh.java.operator;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {		
		OperatorTest ot = new OperatorTest();
//		ot.test1();
//		
//		ot.test2();
//		ot.test3();
		
//		ot.test4();
		
		ot.test5();
		
	}
	
	/**
	 * 복합대입연산자
	 */
	public void test5() {
		int x = 15;
		x += 15; // x = x + 15
		System.out.println(x);
		
		x -= 15; // x = x - 15
		System.out.println(x);
		
		x *= 3;	// x = x * 3
		System.out.println(x);
		
		x /= 2; // x = x / 2
		System.out.println(x);
		
		x %= 10; // x = x % 10
		System.out.println(x);
	}
	
	/**
	 * 삼항 연산자
	 * (조건식)?(참일때 값):(거짓일때 값)
	 */
	public void test4() {
		int num = 50;
		String str = num > 50 ? "안녕" : "잘가";
		System.out.println(str);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		str = (num % 2 == 1) ? "홀수" : "짝수";
		str = (num % 2 != 0) ? "홀수" : "짝수";
		System.out.println(str + "를 입력하셨습니다.");
		
		int a = 5;
		int b = 7;
		int c = a > b ? a : (a == b ? 0 : b);
		System.out.println("c = " + c);
		
		
		
	}
	
	/**
	 * 논리비교연산자
	 * 
	 * - a && b(and) : a가 참이면서 b도 참인가 (둘 모두 참이어야 참)
	 * - a || b(or)  : a 혹은 b가 참인가(둘중 하나만 참이면 참)
	 */
	public void test3() {
		int m = 50;
		int n = 100;
		System.out.println((m < n) && (m * 3 == n)); // t && t 
		System.out.println((m < n) || (m * 3 == n)); // t || t
		
		System.out.println("---------------------");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("---------------------");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("=====================");
		
		int a = 1;
		int b = 1;
		//&& 좌항이 true일때
//		System.out.println(a > 0 && ++b > 0);
		//&& 좌항이 false일때
//		System.out.println(a < 0 && ++b > 0);
		//|| 좌항이 true일때
//		System.out.println(a > 0 || ++b > 0);
		//|| 좌항이 false일때
		System.out.println((a < 0) || (++b > 0));		
		
		System.out.printf("a = %d, b = %d%n", a, b);
	}
	
	/**
	 * 이항연산자
	 */
	public void test2() {
		int a = 3;
		int b = 50;
		int c = 11;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b); //asterisk
		System.out.println(b / c); // 몫
		System.out.println(b % c); // 나머지 연산자
		
		//짝홀구분 : 2로 나눈 나머지가 0이면 짝수, 아니면 홀수
		System.out.println(10 % 2 == 0); //짝수
		System.out.println(3 % 2 == 0);	//홀수
		
		
		//비교연산
		System.out.println(a == b); // f
		System.out.println(a != b);	// t
		
		System.out.println(a > b);	// greater than -> gt 
		System.out.println(a < b); 	// less than -> lt 
		System.out.println(a >= b); // greater than or equal to -> ge
		System.out.println(a <= b); // less than or equal to -> le
		
	}
	
	/**
	 * 단항연산자
	 */
	public void test1() {
		int a = +10;
		int b = -33;
		System.out.println(a + b);
		
		//증감연산자
		int c = 7;
		
		//해당 변수값을 1 증가/감소 시킨후에 다시 대입한다.
		c++; // c = c + 1;
		c--; // c = c - 1;
		
		System.out.println(c);
		
		//1.전위증감연산자 ++c : 먼저 1증감후에 인접연산 처리
		//2.후위증감연산자 c++ : 인접연산 처리후에 1증감.
		int d = 3;
		int k = d--;
		System.out.println("d = " + d);
		System.out.println("k = " + k);
		
		int m = 10;
		int n = 20;
		System.out.println(m++ + --n); //
		
		System.out.println("m = " + m); //
		System.out.println("n = " + n); // 
		
		
		//@실습문제
		int x = 10;
		int y = 10;
		int z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		z = y++;
		System.out.println("z = " + z);
		System.out.println("y = " + y);
		
		x = 20;
		z = x++ + --y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		int num = 20;
		int result = num++ + num;
		System.out.println("num = " + num);
		System.out.println("result = " + result);
		
		//논리부정 연산자 !
		boolean bool = true;
		bool = !bool;
		System.out.println("bool = " + bool);
		
	}
	
}





