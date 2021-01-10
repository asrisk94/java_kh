package kh.java.exception;

/**
 * 커스텀 예외클래스
 * 1.Checked Exception : Exception상속
 * 2.Unchecked Exception : RuntimeException상속
 */
public class UnderAgeException extends Exception {
	
	public UnderAgeException() {
		
	}
	
	public UnderAgeException(String message) {
		super(message);
	}
	
	public UnderAgeException(Throwable cause) {
		super(cause);
	}
	
	public UnderAgeException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
}
