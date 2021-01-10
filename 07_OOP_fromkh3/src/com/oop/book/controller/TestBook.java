package com.oop.book.controller;

import com.oop.book.model.Book;

public class TestBook {

	public static void main(String[] args) {
		//1.1북객체생성 - 기본생성자
		Book book1 = new Book();
		
		//1.2.북객체생성 - 필드포함
		Book book2 = new Book("뇌를 자극하는 JAVA", 20000, 0.2, "김윤영");
		
		//book1.bookInfomation();
		book2.bookInfomation();
		
		//2단계 : setter를 이용한 book2객체 수정
		book1.setTitle("자바의 정석");
		book1.setAuthor("윤상섭");
		book1.setPrice(35000);
		book1.setDiscountRate(0.1);
		book1.bookInfomation();
		
		System.out.println("------------------------------------");
		
		//3단계
		//getter사용.
		String title = book1.getTitle();
		int discountedPrice = book1.getPrice()-(int)(book1.getPrice()*book1.getDiscountRate());
		System.out.println("도서명 : "+title);
		System.out.println("할인가 : "+discountedPrice);
		
		System.out.println("------------------------------------");
		title = book2.getTitle();
		discountedPrice = book2.getPrice()-(int)(book2.getPrice()*book2.getDiscountRate());
		System.out.println("도서명 : "+title);
		System.out.println("할인가 : "+discountedPrice);
		
	}

}
