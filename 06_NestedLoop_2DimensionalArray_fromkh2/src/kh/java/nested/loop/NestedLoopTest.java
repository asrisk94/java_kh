package kh.java.nested.loop;

import java.util.Scanner;

/**
 * 중첩반복문을 사용하면, 다차원적인 데이터를 처리할 수 있다.
 * 
 * - 행/열로 이루어진 테이블 표현이 가능
 *
 */
public class NestedLoopTest {

	public static void main(String[] args) {
		
		NestedLoopTest n = new NestedLoopTest();
//		n.test1();
//		n.test2();
//		n.test3();
//		n.test4();
//		n.test5();
//		n.test6();
		n.test7();
		n.test8();
	}
	/*
	 ♥
	 ♥♥
	 ♥♥♥
	 ♥♥
	 ♥
	 */
	/*
	 	i - 공백 - *
	 -----------------
	    0-4-1: 	    *
		1-2-3:    ***
		2-0-5:	*****
		3-2-3:    ***        
		4-4-1:      *  
	
	 */
	public void test8() {
		
		int total = 5;//5행, 5*
		int space = 4;//공백
		int mid = total/2;//가운데기준으로 i와 mid의 값을 비교해 space값을 변경한다.
		
		//i : 0 1 2 3 4 
		for(int i=0; i<total; i++) {
			//j : 0 1 2 3 4
			for(int j=0; j<total; j++) {
				System.out.print(j<space?" ":"*");
			}
			
			//space : 4 - 2 - 0 - 2 - 4
			if(i < mid) space -= 2;
			else space += 2;
			
			System.out.println();
		}
		
	}

	/*
	 ♥♥♥♥♥
	 ♥♥♥♥
	 ♥♥♥
	 ♥♥
	 ♥
	 */
	public void test7() {
		int total = 5;
		for (int i = 0; i < total; i++) {			
			for (int j = 0; j < total-i; j++) {
				System.out.print("*");				
			}
			System.out.println("");
		}
	}

	
	/**
	 * 구구단 출력
	 * 
	 * ---- 2단 ----
	 * 2 * 1 = 2
	 * 2 * 2 = 4
	 * 2 * 3 = 6
	 * ....
	 * 2 * 9 = 18
	 * 
	 * ---- 3단 ----
	 * 3 * 1 = 3
	 * 3 * 2 = 6
	 * ...
	 * 3 * 9 = 27
	 * 
	 * ---- 9단 ----
	 * 9 * 1 = 9
	 * 9 * 2 = 18
	 * ...
	 * 9 * 9 = 81
	 * 
	 */
	public void test6() {
		
		for(int dan = 2; dan <= 9; dan++) {
			
			System.out.println("---- " + dan + "단 ----");
			for(int n = 1; n <= 9; n++) {
				System.out.println(dan + " * " + n + " = " + (dan * n));
			}
			System.out.println();
		}
		
	}
	
	/*
	0 ○○○
	1 ○
	2 ○○○
	3 ○
	4 ○○○
	 */
	public void test5() {
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 3; j++) {
				System.out.print("○");
				if(i % 2 != 0)
					break;
			}
			System.out.println();
			
		}
		
	}
	
	/**
	  ★
	  ★★
	  ★★★
	  ★★★★
	  ★★★★★
	  
	 continue 
	 이하코드를 실행하지 않고, 
	 - for문 증감식
	 - while문 조건식으로 이동
	   
	 */
	public void test4() {
		
//		for(int i = 0; i < 5; i++) {
//			
//			for(int j = 0; j <= i; j++) {
//				System.out.print("★");
//			}
//			
//			System.out.println();
//		}
		
		//라벨을 사용한 break
//		outer:
//		for(int i = 0; ; i++) {
//			
//			for(int j = 0; j <= i; j++) {
//				
//				if(i >= 5) 
//					break outer;
//				
//				System.out.print("★");
//			}
//			System.out.println();
//		}
	
		//라벨을 사용한 continue
		outer:
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				System.out.print("★");
				if(i == j) {
					System.out.println();
					continue outer;
				}
			}
			
		}
		
	}
	
	/**
	 * @실습문제: 사용자가 원하는 크기의 별박스 출력
	 *  행 : 3
	 *  열 : 4
	 *  --------
	 *   ★★★★
	 *   ★★★★
	 *   ★★★★
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 : ");
		int row = sc.nextInt();
		System.out.print("열 : ");
		int column = sc.nextInt();
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
	}
	
	/**
	 * @실습문제 : 
	 *  (0,0)(0,1)(0,2)(0,3)(0,4)
	 *  (1,0)(1,1)(1,2)(1,3)(1,4)	
	 *  (2,0)(2,1)(2,2)(2,3)(2,4)
	 */
	public void test2() {
		//4행 3열로 변경하려면?
		//행 -> 바깥반복문
		//열 -> 안쪽반복문
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("★");
				//System.out.print("(" + i + "," + j + ")");
			}
			System.out.println();
		}
		
	}
	
	public void test1() {
		
		//outer
		for(int i = 0; i < 2; i++) {
			System.out.print(i + " : ");
			
			//inner
			for(int j = 0; j < 3; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();//개행
		}
		
		
		for(int i = 0; i < 2; i++) {
			
			for(int j = 0; j < 3; j++) {
				System.out.print("(" + i + "," + j + ")");
			}
			
			System.out.println();
		}
		
		
		
	}
	
}
