package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

public class CoffeeManager {
	
	Scanner sc = new Scanner(System.in);
	final int LENGTH = 3;
	Coffee[] top3 = new Coffee[LENGTH];
	
	public void insertCoffeeData() {
		for(int i = 0; i < top3.length; i++) {
			//Coffee객체 생성
			Coffee c = new Coffee();
			System.out.print("커피원산지(국가) 입력 : ");
			c.setOrigin(sc.next());
			System.out.print("생산지역 입력 : ");
			c.setLocation(sc.next());
			
			//객체배열에 추가
			top3[i] = c;
		}
	}
	
	public void printCoffeeData() {
		for(int i=0; i<top3.length; i++) {
			//manager클래스에서 별도의 메소드로 처리
			printCoffeeDetail(top3[i]);
			
			//Coffee getter를 이용해 직접 가져오기
//			System.out.println(top3[i].getOrigin() + top3[i].getLocation());

			//Coffee에 필드 정보메소드
//			System.out.println(top3[i].information());
		}
	}
	
	public void printCoffeeDetail(Coffee c) {
		System.out.println(c.getOrigin() + ", " + c.getLocation());
	}
}
