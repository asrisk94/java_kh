package com.kh.test.loop;

import java.util.Scanner;

/**
	5개의 상품을 입력 받아 출력하는 프로그램을 만드세요
    입력 : 상품id, 종류, 상품명, 가격 

	출력 예) 
	====== 저장상품 ======
	 p001 핸드폰 노트8 120만원
	 p002 핸드폰 v10 98만원
	 c001 컴퓨터 엘지xnote 100만원
	 e001 가전 전자레인 30만원
	 e002 가전 세탁기 80만원
	 
	 기능추가1:
	 	저장할 상품의 개수를 입력 받고 그 개수만큼 상품을 입력 받아 출력하는 프로그램을 만드세요
	 	
	 기능추가2 : 
	상품리스트 마지막행에 상품들의 평균값을 구하고 출력하세요.  




 */
public class Test6 {

	public static void main(String[] args) {
		Test6 t = new Test6();
		t.test();
	}

	private void test() {
		Scanner sc = new Scanner(System.in);
		String pid = "";
		String category = "";
		String pname = "";
		int price = 0;
		
		//기능추가1
		System.out.print("몇개의 상품을 등록할까요? => ");
		int pCnt = sc.nextInt();
		
		//기능추가2
		int sum = 0;
		double avgPrice = 0;
		
		String result = "============ 저장상품 ===========\n";
		
		for (int i = 0; i < pCnt; i++) {
			System.out.println("-------------"+(i+1)+"---------------");
			System.out.print("상품아이디를 입력하세요 => ");
			pid = sc.next();
			
			System.out.print("상품종류를 입력하세요 => ");
			category = sc.next();
			
			System.out.print("상품명을 입력하세요 => ");
			pname = sc.next();
			
			System.out.print("상품가격을 입력하세요 => ");
			price = sc.nextInt();
			
			result += pid+"\t"+category+"\t"+pname+"\t"+price+"만원\n";
			
			//기능추가2
			sum += price;
			
			
		}//end of for (int i = 0; i < 5; i++)
		
		//기능추가2
		avgPrice = (int)(sum*1.0/pCnt*10)/10.0;
		
		result += "=========================================\n";
		result += "평균 상품가격 : "+avgPrice+"만원";
		
		System.out.println(result);
	}

}
