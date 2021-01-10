package com.kh.test.nested.loop;

import java.util.Scanner;

/*
	정수하나 입력받아, 그 수가 양수일때만 입력된 
	수를 줄 수로 적용하여 다음과 같이 출력되게 하는 
	프로그램을 만들어보자.
		출력예)
	  정수 입력 : 5
	
	     *
	     **
	     ***
	     ****
	     *****
	      ****
	       ***
	        **
	         *

 */
public class Test2 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.test1();
	}

	private void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의정수를 하나 입력하세요 ==> ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("양의정수가 아닙니다.");
			return;
		}
		
		// 4입력시, i : 0 1 2 3 4 5 6 (7행)
		// 5입력시, i : 0 1 2 3 4 5 6 7 8(9행)
		for (int i = 0; i < (num * 2 - 1); i++) {
			
			// i : 0 1 2 3 4
			if (i < num) {
				//j<=1 등호 주의!!
				for (int j = 0; j <= i; j++) {
				 	System.out.print("*");
				}
			}
			// i : 5 6 7 8
			else {
				// 5열 j : 0 1 2 3 4
				// 5: 1 4 -> j <= 0 공백 0
				// 6: 2 3 -> j <= 1 공백 0 1
				// 7: 3 2 -> j <= 2 공백 0 1 2
				// 8: 4 1 -> j <= 3 공백 0 1 2 3
				for (int j = 0; j < num; j++) {

					if (j <= (i - num))
						System.out.print(" ");
					else 
						System.out.print("*");
					
				}
			}
			System.out.println();
		}
	}
	
	
	public void test1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 0; a < input; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print(" ");
            }
            for (int c = input; c > a; c--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

}
