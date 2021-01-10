package kh.java.math;

public class MathTest {

	public static void main(String[] args) {
		
		MathTest m = new MathTest();
		m.test1();
		m.test2();
	}
	
	/**
	 * 반올림
	 * 정수형 long을 리턴
	 */
	public void test2() {
		double num = 94.53;
		long result = Math.round(num);
		System.out.println(result);
		
		//94.53 * 10 -> 945.3 -> 945 / 10.0 -> 94.5
		double dResult = Math.round(num * 10) / 10.0;
		System.out.println(dResult);
		
		//@실습문제 : 123.456 -> 반올림처리해서 소수점이하 둘째자리까지
		// 123.46
		num = 123.456;
		//12346.0 / 100
		dResult = (double)Math.round(num * 100) / 100;
		System.out.println(dResult);
	}
	
	/**
	 * 올림 / 버림
	 */
	public void test1() {
		double num = 7.8;
		double result = Math.ceil(num);
		System.out.println(result);
		
		result = Math.floor(num);
		System.out.println(result);
		
		//부동소수점 방식처리
		num = 4.567; // 4.6
		// 4.567 * 10 -> 45.67 -> 46.0 / 10 -> 4.6
		result = Math.ceil(num * 10) / 10;
		System.out.println(result);
		
		//버림 소수점이하 둘째자리까지 표현 4.56
		//4.567 * 100 -> 456.7 -> 456.0 / 100 -> 4.56
		result = Math.floor(num * 100) / 100;
		System.out.println(result);
		
	}
}





