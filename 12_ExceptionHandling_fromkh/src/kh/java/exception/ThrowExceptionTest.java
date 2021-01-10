package kh.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 
 * 1. try~catch 예외 직접 처리
 * 2. throws절을 메소드시그니쳐에 명시해서 예외처리를 호출부를 넘김.
 *
 */
public class ThrowExceptionTest {

	public static void main(String[] args) {
		
		ThrowExceptionTest t = new ThrowExceptionTest();
		t.start();
		
		System.err.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		
		System.out.println("프로그램 정상 종료!");
	}
	
	/**
	 * 던져진 예외는 흐름을 제어할 수 있는 메소드에서 예외처리해야한다.
	 * 
	 * @throws Exception
	 */
	public void start() {
		System.out.println("<start>");
		
		String fileName = "test.txt";
		try {
			
			a(fileName);
			
		} catch(Exception e) {
			e.printStackTrace();
			
			System.out.println("파일을 생성합니다.");
			b(fileName);
		}
		
		System.out.println("프로그램 진행.......");
	}
	/**
	 * 해당파일 생성 메소드
	 */
	public void b(String fileName) {
		System.out.println("<b>");
	}
	
	/**
	 * throws절은 메소드 또는 생성자에 작성 
	 * - 다형성 적용가능 FileNotFoundException -> IOException -> Exception
	 * - 던지는 예외클래스 개수 제한 없음.
	 * 		
	 * 
	 * @param fileName
	 * @throws Exception
	 */
	public void a(String fileName) throws FileNotFoundException, Exception  {
		System.out.println("<a>");
		//1. 직접 처리
//		try {
//			FileReader fr = new FileReader(fileName);
//		} catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		//2. 호출부로 예외처리 넘기
		try {
			
			FileReader fr = new FileReader(fileName);
			
		} catch(FileNotFoundException e) {
			//우선 예외처리후 사용자정의 예외객체 바꾸어서 던지기
			throw new TestFileNotFoundException("기본파일명 : " + fileName, e);
		}
		
		
	}
	
	

}
