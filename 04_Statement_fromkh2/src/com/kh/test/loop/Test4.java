package com.kh.test.loop;

import java.util.Scanner;

/*
 	문자열과 문자열에서 검색될 문자를 입력 받아 문 
	자열에 그 문자가 몇 개이었는지 개수를 확인하는 
	프로그램을 작성하세요. 
	또, 검색할 문자가 영문자가 아니면 "영문자가 아닙니다." 출력후
	프로그램을 종료하세요. 
	
	출력 예)
   	문자열 입력 : application
	검색할 문자 입력 : p
	'p'가 포함된 갯수 : 2 개
	
	
	문자열 입력 : apple_test123
	문자 입력 : ㄱ
	영문자가 아닙니다.
	
	
	
	사용자로 부터 문자열을 입력받는다.
	사용자로 부터 문자를 입력받는다.
	문자가 영문자인지 검사한다.
	
	문자열에서 문자가 몇개인지 검사한다
	
 */
public class Test4 {

	public static void main(String[] args) {
		Test4 t = new Test4();
//		t.test();
		t.test2();
	}

	private void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 문자열을 입력 : ");
		String str = sc.nextLine().toLowerCase();
		System.out.println("str = " + str);
		
		System.out.print("> 검색할 문자 입력 : ");
		char srchChar = sc.next().toLowerCase().charAt(0);
		System.out.println("srchChar = " + srchChar);
		
		// 2.문자 유효성 체크
		//조기리턴
		if(!(srchChar >= 'A' && srchChar <='Z') 
				&& !(srchChar >= 'a' && srchChar <='z')) {
			System.out.println("영문자가 아닙니다.");
			return;
		}
		
		int cnt = 0;
		int i = 0;
		while(i < str.length()) {
			char c = str.charAt(i);
			if(c == srchChar)
				cnt++;
			i++;
		}
		
			
		System.out.println("'"+srchChar+"'가 포함된 갯수 : "+cnt+"개");
		
	}
	private void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 문자열을 입력 : ");
		String str = sc.nextLine().toLowerCase();
		System.out.println("str = " + str);
		
		System.out.print("> 검색할 문자 입력 : ");
		char srchChar = sc.next().toLowerCase().charAt(0);
		System.out.println("srchChar = " + srchChar);
		
		// 2.문자 유효성 체크
		if((srchChar >= 'A' && srchChar <='Z') 
				|| (srchChar >= 'a' && srchChar <='z')) {
			// 1.개수보관할 변수
			int cnt = 0;
			
			System.out.println("length = " + str.length());
			
			for(int i=0; i<str.length(); i++){
				char c = str.charAt(i);
				if(c==srchChar) 
					cnt++;
			}
			
			System.out.println("'"+srchChar+"'가 포함된 갯수 : "+cnt+"개");
		}
		else {
			System.out.println("영문자가 아닙니다.");
		}
		
		
		
		
	}

}
