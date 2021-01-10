package member.controller;

import member.model.vo.Buyable;
import member.model.vo.Member;
import member.model.vo.Silver;

/**
 * 
 * 다형성이란?
 * 부모타입의 참조변수에 자식객체를 담아 제어하는 것
 * 
 * Silver s = new Silver();
 * Member m = s;
 * Object o = s;
 * 
 * Member[] marr = new Member[10];
 * marr[0] = s;
 * 
 * 1. 변수에 대입, 배열에 대입
 * 2. 매개변수
 * 3. 리턴값
 * 
 * @author user1
 *
 */
public class MemberManager {
	
	private Member[] m = new Member[40];
	private int memberIndex = 0;

	//다형성 
	public void insertMember(Member m){
		this.m[memberIndex++] = m;
	}
	
	public void printData() {
		System.out.println("-----------정보출력-------------");
		System.out.printf("%-15s %-15s %-15s %-15s\n", "이름","등급","포인트","이자포인트");
		for(int i=0; i<memberIndex; i++){
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", m[i].getName(), m[i].getGrade(), m[i].getPoint(), m[i].getEjapoint());
		}
	}
	
	/**
	 *  Silver등급회원 홍길동는 10000원 상품을 9800원에 구매합니다.
	 */
	public void printBuyInfo(int price) {
		//Silver객체, Gold객체, Vip객체, VVip객체 -> buy오버라이딩
		for(Member m : this.m) {
			if(m == null)
				break;
			
			System.out.printf(
					"%s등급회원 %s는 %d원 상품을 %d원에 구매합니다.%n",
					m.getGrade(),
					m.getName(),
					price,
//					((Buyable)m).buy(price)
					m.buy(price) //Member가 직접 Buyable을 구현하므로 buy메소드 접근 가능
				);
		}
	}
}
