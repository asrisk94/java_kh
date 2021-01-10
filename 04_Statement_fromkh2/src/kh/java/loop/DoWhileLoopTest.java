package kh.java.loop;

import java.util.Scanner;

/**
 * while 초기식 -> 조건식 -> (반복실행구문 -> 증감식) .....
 * do..while 초기식 -> (반복실행구문 -> 증감식) -> 조건식 
 *
 */
public class DoWhileLoopTest {

	public static void main(String[] args) {
	
		DoWhileLoopTest d = new DoWhileLoopTest();
//		d.test1();
//		d.test2();
//		d.test3();
//		
		d.test4();
//		d.test5();
	}
	
	/**
	 * @실습문제:
	 * 사용자에게 단수를 입력받아 해당 단의 구구단 출력
	 * 계속 여부를 입력 진행할 것
	 * 
	 * 출력할 구구단 입력 (2 ~ 9) : 3
	 * 3 * 1 = 3
	 * 3 * 2 = 6
	 * ...
	 * 3 * 9 = 27
	 * 계속 하시겠습니까?(y/n) : y
	 * 
	 * 출력할 구구단 입력 (2 ~ 9) :
	 * 
	 * 계속 하시겠습니까?(y/n) : n
	 * 이용해 주셔서 감사합니다.
	 * 
	 */
	public void test5() {
		Scanner sc = new Scanner(System.in);
		char yn = 'y';
		
		do {
			System.out.print("구구단수 입력(2 ~ 9) : ");
			int dan = sc.nextInt();
			int i = 1;
			while(i <= 9) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
				i++;
			}
			
			System.out.print("계속 하시겠습니까(y/n) : ");
			yn = sc.next().toLowerCase().charAt(0); //YN -> yn
			
		} while(yn == 'y');
		
		System.out.println("이용해주셔서 감사합니다.");
		
	}
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		char yn = 'y';
		
		do {
			calcWaterFee();
			
			System.out.print("계속 하시겠습니까(y/n) : ");
			yn = sc.next().toLowerCase().charAt(0); //YN -> yn
			
		} while(yn == 'y');
		
		System.out.println("이용해주셔서 감사합니다.");
	}
	
	
	/**
	 * @실습문제: 수도세 계산 프로그램
	 * 사용자에게 용도와 물사용량을 입력받아서, 수도세를 계산할것.
	 *  - 사용요금 : 용도별 가격  * 사용량
	 *  - 수도세 : 사용요금 5%
	 *  - 총 납부금액 : 사용요금 + 수도세
	 *  
	 *  용도별가격
	 *  1. 가정용 50원/liter
	 *  2. 상업용 45원/liter
	 *  3. 공업용 30원/liter
	 *  
	 *  상업용, 250liter사용시
	 *  
	 *  출력결과 :
	 *  --- 총 사용요금 ---
	 *  - 상업용을 사용하고 계십니다.
	 *  - 사용요금 : 11250원
	 *  - 수도세 : 562원
	 *  - 총납부금액 : 11812원
	 * 
	 */
	public void calcWaterFee() {
		Scanner sc = new Scanner(System.in);
		String menu = "-------------------\n" + 
					  "1. 가정용 50원/liter\n" + 
					  "2. 상업용 45원/liter\n" + 
					  "3. 공업용 30원/liter\n" +
					  "--------------------\n" +
					  "용도 선택 > ";
		System.out.print(menu);
		int choice = sc.nextInt();
		System.out.print("사용량 입력(liter) > ");
		int used = sc.nextInt();
		
		int price = 0;
		double tax = 0;
		int total = 0;
		String type = "";
		
		switch(choice) {
		case 1 : 
			price = 50 * used;
			type = "가정용";
			break;
		case 2 : 
			price = 45 * used;
			type = "상업용";
			break;
		case 3 : 
			price = 30 * used;
			type = "공업용";
			break;
		default : 
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		tax = price * 0.05;
		total = (int)(price + tax);
		
		//결과출력
		System.out.println("--- 총 사용요금 ---\r\n" + 
						   "- " + type + "을 사용하고 계십니다.\r\n" + 
						   "- 사용요금 : " + price + "원\r\n" + 
						   "- 수도세 : " + tax + "원\r\n" + 
						   "- 총납부금액 : " + total + "원");
		
	}
	
	/** 
	 * 메뉴 가격 계산기
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		String menu = "===============\n"
					+ "1.참치김밥(3,000)\n"
					+ "2.멸치김밥(2,500)\n"
					+ "3.라뽁기(3,500)\n"
					+ "---------------\n"
					+ "선택 : ";
		char yn = 'n';	//추가주문 여부
		int choice = 0;	//사용자 메뉴 선택
		int sum = 0; //누적합
		
		do {
			//메뉴출력 및 사용자 선택
			System.out.print(menu);
			choice = sc.nextInt();
//			System.out.println(choice);
			
			//누적합 계산
			switch(choice) {
			case 1: sum += 3000; break;
			case 2: sum += 2500; break;
			case 3: sum += 3500; break;
			default: System.out.println("잘못 입력하셨습니다.");
			}
			
			//추가주문 여부
			System.out.print("더 주문하시겠습니까?(y/n) : ");
			yn = sc.next().charAt(0);
			
		} while(yn == 'y');
		
		//최종금액 출력
		System.out.println("결제금액 : " + sum + "원");
		System.out.println("--- 이용해 주셔서 감사합니다. ---");
		
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		char yn = 'y'; //do~while 조건식에 사용될 변수는 블럭 바깥에 선언할 것
		
		do {
			System.out.println("--- 게임 시작 ---");
			System.out.println("얍~ 뺙 ~ 쿵 ~ 와~");
			System.out.println("--- 게임 오버 ---");
			System.out.print("한판 더 하시겠습니까?(y/n) : ");
			yn = sc.next().charAt(0);
			
		} while(yn == 'y');
		
		System.out.println("=== 이용해 주셔서 감사합니다. ===");
		
	}
	
	public void test1() {
		int i = 0;
		do {
			System.out.println("안녕");
			i--;
		} while(i > 0);
		
		System.out.println("--- 끝 ---");
	}
	
	
}
