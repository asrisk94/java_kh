package kh.java.oop.field;

public class KHStudentMain {

	public static void main(String[] args) {
		KHStudent kh1 = new KHStudent();
		//값대입
		kh1.setName("홍길동");
		kh1.setClassName('M');
		kh1.setPhoneNumber("01012341234");

		KHStudent kh2 = new KHStudent();
		//값대입
		kh2.setName("세종대왕");
		kh2.setClassName('A');
		kh2.setPhoneNumber("01011112222");
		
		//출력
		kh1.printInfo();
		kh2.printInfo();
	}
}
