package com.kh.test;

import java.util.Scanner;

public class Test1 {// 소수 1과 자기자신밖에 없는것

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 100 사이의 정수를 입력하세요 :");
		int num = sc.nextInt();
		
		if(num >=1 && num <= 100) {
			System.out.println("1");
			//프린트문 출력문 찍어보기 1 어디까지 식이 진행됬나 확인하기위하여
			if(num == 1) {
				System.out.println('a');
				//출력문 임의로 a
				System.out.println("1은 소수가 아닙니다.");
			}
			else {
				System.out.println('b');
			
				for (int i = 2; i < num; i++) {
					//출력문 찍어보기 b
					if(num % i == 0) {
						System.out.print(i + " : ");
						System.out.println(num + "은(는) 소수가 아닙니다.");
						return;
					}
				}
				System.out.println(num + "은(는) 소수입니다.");
			}
			
			
		}
		else {
			System.out.println(2);
			//프린트문 출력문 찍어보기2
			System.out.println("1부터 100사이의 정수를 입력하세요!");
		}
		
	}
}
