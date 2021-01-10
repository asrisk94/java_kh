package kh.java;
// package는 보통 domain을 거꾸로 작성한다. kr.or.iei

/**
 * javadoc 주석 
 * (클래스 레벨)
 * 
 * HelloWorld는 우리가 이클립스에서 처음 만든 클래스 입니다.
 * 
 * @author user1
 *
 */
public class HelloWorld {

	/**
	 * (메소드레벨)
	 * 
	 * main메소드는 프로그램을 실행하는 첫 메소드입니다.
	 * main메소드 없이는 프로그램을 시작할 수 없습니다.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//단일행주석 : jvm에 의해서 해석되지 않는다.
		
		/*
		  여러줄주석
		 a
		 b
		 c
		 d
		 
		 */
		System.out.println("Hello world~");
		System.out.println("안녕!!");
	
	}
}
