package com.oop.salary.model;

public class Salary extends Calculate implements Output {
	private String name;			//이름
	private long basePay;		//기본급
	private long familiyPay;		//가족수당
	private long overtimePay; 	//시간외수당.
	private long incentivePay;		//성과금
	private long tax;					//세금
	private long totalPay;			//실수령액
	private int family;				//가족수
	private int overtime;			//초과근무시간

	public static int count = 0;				//총인원 - 초기값(5)
	
	public Salary(){}
	
	public Salary(String name, long basePay, int family, int overtime) {
		this.name = name;
		this.basePay = basePay;
		this.family = family;
		this.overtime = overtime;
		
		//나머지 필드 계산.
		calc();
		
		//객체생성시마다 1증가.
		count++;
	}
	
	
	@Override
	public void calc() {
		//가족수당
		this.familiyPay = family >=3?60000:family*20000; 
		//시간외수당
		overtimePay = overtime*5000;
		//세금
		tax = (long)(basePay*0.1);
		//성과금
		//incentive는 Calculate추상클래스의 스태틱변수이다.
		incentivePay =  (long)(incentive*basePay);
		//실수령액
		totalPay = basePay+familiyPay+incentivePay+overtimePay-tax;
		
	}
	
	@Override
	public void output() {
		//[[2]] 
		calc();
		
		System.out.printf("%-10s %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10d\n",
				name, basePay, family, familiyPay, overtime, overtimePay, tax, (int)(incentive*100), incentivePay, totalPay);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBasePay() {
		return basePay;
	}

	public void setBasePay(long basePay) {
		this.basePay = basePay;
	}

	public long getFamiliyPay() {
		return familiyPay;
	}

	public void setFamiliyPay(long familiyPay) {
		this.familiyPay = familiyPay;
	}

	public long getOvertimePay() {
		return overtimePay;
	}

	public void setOvertimePay(long overtimePay) {
		this.overtimePay = overtimePay;
	}

	public long getIncentPay() {
		return incentivePay;
	}

	public void setIncentPay(long incentPay) {
		this.incentivePay = incentPay;
	}

	public long getTax() {
		return tax;
	}

	public void setTax(long tax) {
		this.tax = tax;
	}

	public long getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(long totalPay) {
		this.totalPay = totalPay;
	}

	public int getFamily() {
		return family;
	}

	public void setFamily(int family) {
		this.family = family;
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public static float getIncentive() {
		return incentive;
	}

	public static void setIncentive(float incentive) {
		Salary.incentive = incentive;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Salary.count = count;
	}

	

	
}
