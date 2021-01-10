package kh.java.exception;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

/**
 * 
 * 0.리턴타입, 메소드명, 매개변수 선언부가 완전 동일할 것.
 * 1.접근제한자는 부모메소드보다 넓게 설정할 수 있다.
 * 	- default -> protected -> public
 * 2.부모메소드에서 던지는 예외는 오버라이딩시에 개수는 더 적게, 
 * 	  혹은 자식클래스로 변환 가능.
 * 	
 * 
 */
public class OverridingTest {

	public static void main(String[] args) {

	}

}

class Parent {
	public void overrideMe() throws SQLException, IOException {
		
	}
}

class Child extends Parent {

	@Override
	public void overrideMe() {}
//	public void overrideMe() throws SQLException {}
//	public void overrideMe() throws SQLSyntaxErrorException{}
//	public void overrideMe() throws Exception {} //부모타입 변환은 불가
}







