package com.oop.salary.model;

public class PayTable implements Output {
	private Salary[] salArr = new Salary[10];
	

	@Override
	public void output() {
		String header  = "\t\t\t\t\t**** 급여명세서 ****";
		String lineSeparator = "---------------------------------------------------------------------------------------------------";
		System.out.println(header);
		System.out.println(lineSeparator);
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
					"이름", "기본급", "가족수", "가족수당", "시간외근무", "시간외수당", "세금", "인센티브", "성과금", "실수령액");
		System.out.println(lineSeparator);
		
		//Salary객체배열에 저장된 내역 출력
		for(Salary s : salArr){
			//입력되지 않은 공간에 대한 null처리를 해줘야 한다.
			if(s!=null)
				s.output();
		}
		
		
		
		System.out.println(lineSeparator);
		System.out.println("인원수 : "+Salary.count+"명");
	}


	public void insertSalaryData(Salary salary) {
		//저장해야 할 index를 체크한다.
		//Salary객체가 생성될 때 이미 카운팅되므로, Salary.count - 1 이 저장되어야 할 인덱스이다.
		//최대크기를 넘으면, indexOutOfBoundsException이 발생하므로 객체배열 추가전 조건식을 만든다.
		if(Salary.count <=10)
			salArr[Salary.count-1] = salary;
		else
			System.out.println("최대크기를 초과했습니다. 더이상 추가할 수 없습니다.");
	}

	
	
}
