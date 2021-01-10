package com.oop.book.model;

/**
 * 실습예제2
 * 
 * 1단계: 속성, 기본생성자, 4개필드를 가진생성자, bookInformation()
 * 2단계: 속성별 setter추가
 * 3단계: 속성별 getter추가
 * @author shqkel1863
 *
 */
public class Book {
	private String title;					//책제목
	private int price;						//가격
	private double discountRate;	//할인율
	private String author;				//저자명
	
	//기본생성자
	public Book(){
		
	}
	
	//전체필드 초기화하는 생성자
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	//출력메소드
	public void bookInfomation(){
		String info = title+"\t"+price+"\t"+discountRate+"\t"+author;
		System.out.println(info);
	}

	//2단계 : setter추가
	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	//3단계 : getter추가
	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public String getAuthor() {
		return author;
	}
	
	
	
}
