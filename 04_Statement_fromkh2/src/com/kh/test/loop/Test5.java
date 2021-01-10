package com.kh.test.loop;

import java.util.Scanner;

/*
	5명의 회원정보를 입력 받아 저장하고 출력하는 
	프로그램을 만드세요
	 입력 : 이름, 나이, 주소, 키, 몸무게, 연락처
	
	출력 예) 
	================ 저장회원===============
	1 홍길동 19세 서울시 강남구 170cm 68kg 01012345678
	2 임걱정 20세 경기도 수원시 180cm 75kg 01012345678

	                           
	//기능추가1
	//출력결과 마지막행에 다음 항목에 대한 평균을 구하시오.
	============================================
	평균나이 00세 / 평균 키 : 00CM / 평균 몸무게 : 00kg
.                 .

 */
public class Test5 {

	public static void main(String[] args) {
		Test5 t = new Test5();
		t.test();
	}

	private void test() {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		String addr = "";
		int height = 0;
		int weight = 0;
		String phone = "";
		
		//회원수
		int memberCnt = 3;
		
		String result = "=================== 저장회원 ==================\n";
		
		
		//기능추가
		int sumAge = 0;
		int sumHeight = 0;
		int sumWeight = 0;		
		
		double avgAge = 0;
		double avgHeight = 0;
		double avgWeight = 0;
		
		for (int i = 0; i < memberCnt; i++) {
			System.out.println("-------------- "+(i+1)+" -----------------");

			System.out.print("이름을 입력하세요 : ");
			name = sc.next();
			
			System.out.print("나이를 입력하세요 : ");
			age = sc.nextInt();
			
			sc.nextLine();
			System.out.print("주소를 입력하세요 : ");
			addr  = sc.nextLine();
			
			System.out.print("키를 입력하세요 : ");
			height = sc.nextInt();
			
			System.out.print("몸무게를 입력하세요 : ");
			weight = sc.nextInt();
			
			
			System.out.print("연락처를 입력하세요 : ");
			phone = sc.next();
			
			result += (i+1)+"\t"+name+"\t"+age+"\t"+addr+"\t"+height+"cm\t"+weight+"kg\t"+phone+"\n";
			
			//기능추가
			sumAge += age;
			sumHeight += height;
			sumWeight += weight;
		}
		
		avgAge = (int)((sumAge*1.0/memberCnt)*10)/10.0;
		avgHeight = (int)((sumHeight*1.0/memberCnt)*10)/10.0;
		avgWeight = (int)((sumWeight*1.0/memberCnt)*10)/10.0;
		
		//refactoring
//		avgAge = (int)(sumAge*10.0/memberCnt)/10.0;
//		avgHeight = (int)(sumHeight*10.0/memberCnt)/10.0;
//		avgWeight = (int)(sumWeight*10.0/memberCnt)/10.0;
		
		
		result += "===========================================\n";
		result += "평균나이 : "+avgAge+"세 | 평균신장 : "+avgHeight+"cm | 평균몸무게 : "+avgWeight+"kg";
		
		System.out.println(result);
		
	}

}
