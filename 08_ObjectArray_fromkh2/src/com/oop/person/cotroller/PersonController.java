package com.oop.person.cotroller;

import java.util.Scanner;

import com.oop.person.model.Person;

public class PersonController {
	
	private final int MAX = 3;
	private Person[] arr = new Person[MAX];
	
	private Scanner sc = new Scanner(System.in);
	
	/**
	 * 입력메소드
	 */
	public void insertPerson() {
		System.out.println("---- 개인정보 입력(3명) ----");
		for(int i = 0; i < arr.length; i++) {
			System.out.println("---- 개인(" + (i + 1) + ") ----");
			
			Person p = new Person();
			System.out.print("이름 : ");
			p.setName(sc.next());
			System.out.print("나이 : ");
			p.setAge(sc.nextInt());
			System.out.print("키 : ");
			p.setHeight(sc.nextDouble());
			System.out.print("몸무게 : ");
			p.setWeight(sc.nextDouble());
			System.out.print("재산(만원) : ");
			p.setWealth(sc.nextLong());
			
			arr[i] = p;
		}
	}
	
	/**
	 * 출력메소드
	 */
	public void printPerson() {
		
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i].information()); //Person
	}
	
	/**
	 * 평균 구하는 메소드
	 * 
	 * 평균 = 합 / 개수
	 * 
	 */
	public void getPersonAvg() {
		System.out.println("---------- 평균 출력 ----------");
		double[] sumArr = new double[4];
		//0 : 나이, 1 : 키, 2 : 몸무게, 3 : 재산
		for(int i = 0; i < arr.length; i++) {
			Person p = arr[i];
			sumArr[0] += p.getAge();
			sumArr[1] += p.getHeight();
			sumArr[2] += p.getWeight();
			sumArr[3] += p.getWealth();
		}
		
		System.out.println("평균 나이 : " + (sumArr[0] / arr.length));
		System.out.println("평균 키 : " + (sumArr[1] / arr.length));
		System.out.println("평균 몸무게 : " + (sumArr[2] / arr.length));
		System.out.println("평균 재산 : " + (sumArr[3] / arr.length));
		
		
	}
}
