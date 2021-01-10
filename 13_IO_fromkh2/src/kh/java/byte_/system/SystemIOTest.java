package kh.java.byte_.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIOTest {

	public static void main(String[] args) {
		SystemIOTest s = new SystemIOTest();
//		s.test1();
		s.test2();
		
		
		
	}
	
	/**
	 * Scanner(jdk1.5)이전에는 
	 * - System.in 1byte
	 * - InputStreamReader byte to char : 브릿지스트림
	 * - BufferedReader 2byte : 라인단위로 처리가 가능한 readLine()메소드 제공
	 * 
	 * 
	 * 주스트림객체를 보조스트림객체에 전달하고,
	 * 보조스트림객체를 제어한다.
	 * 보조스트림만 반납하면, 주스트림도 함께 반납된다.
	 */
	private void test2() {
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		String line = "";
		
		try {
			int sum = 0;
			//읽어온 값이 없다면 null을 리턴
			while((line = br.readLine()) != null) {
				if("quit".equals(line))
					break;
				System.out.println("입력값 : " + line);
				sum += Integer.parseInt(line);
			}
			
			System.out.println("총합 : " + sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}



	/**
	 * System.in -> System의 클래스변수 in
	 * System.out -> System의 클래스변수 out
	 */
	private void test1() {
		//사용자의 키보드 입력 -> 입력버퍼 -> JVM
		//입력값이 없다면 read메소드는 -1을 리턴
		//종료 단축키(윈도우 : Ctrl + c, 맥  : Ctrl + d, 이클립스 : Ctrl + z)사용시에도 -1리턴
		int data = 0;
		try {
			while((data = System.in.read()) != -1) {
				System.out.println(data);
			}
		
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			//예외적으로 표준입출력은 닫지 않는다.
//			System.in.close();
//			System.out.close();
		}
		
	}

}
