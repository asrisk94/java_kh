package kh.java;
/*
 * package는 모두 소문자로 작성
 * 단어별로 끊어서 작성한다. korea.seoul.gangnam
 * 
 * class명은 반드시 대문자로 시작한다.
 * 단어가 연결될때는 연결된 단어의 첫글자는 대문자로 시작한다.
 * CamelCasing
 * 
 * 
 * kh.java.HelloJava
 * 
 * java.lang.String
 * java.io.File
 * java.util.collection.Collection
 * 
 */


import kh.java.other.HongGildong;
import java.util.Date;


public class HelloJava {

	/*
	 * 자바는 메소드 단위로 호출하면서 프로그램이 진행된다. 
	 * 실행코드는 반드시 메소드안에 작성해야한다.-
	 */
	public static void main(String[] args) {

		//객체 레시피
		//클래스를 객체로 만들어주는 문법
		//클래스명 이름 = new 클래스명(); 
		// = 같다는 의미가 아니라 우항의 값을 좌항에 대입하라는 뜻.
		HelloJava hello = new HelloJava();
		hello.test(); // 메소드 호출
		
		HelloJava helloo = new HelloJava();
		helloo.callMyName();
		
		//HelloKH의 welcome메소드 호출하기
		HelloKH kh = new HelloKH();
		kh.welcome();
		
		//다른 패키지의 클래스를 사용하려면,
		//import문을 반드시 작성해야 한다.
		//kh.java.other.HongGildong.say 메소드 호출
		HongGildong hong = new HongGildong();
		hong.say();
		
		//jdk가 제공하는 클래스 가져다 쓰기
		//java.util.Date
		Date today = new Date();
		System.out.println(today);
		
		//java.lang.String
		//java.lang은 import없이 쓸수 있는 유일한 패키지.
		String name = new String("신사임당");
		System.out.println(name);
		
		
	}
	
	public void test() {
		System.out.println("안늉~~~~");
	}
	
	/*
	 * 메소드명은 소문자로 시작
	 * 동사로 메소드의 내용을 간단히 설명할수 있어야 한다.
	 * 연결된 단어의 첫글자는 대문자로 작성
	 * 
	 * public void kh.java.HelloJava.callMyName
	 *  
	 */
	public void callMyName() {
		System.out.println("홍길동!!!!");
	}

	
}







