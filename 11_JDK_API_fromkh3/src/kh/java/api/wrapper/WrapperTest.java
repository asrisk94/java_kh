package kh.java.api.wrapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * WrapperClass
 * - 기본형의 값을 감싸고 있는 클래스로 기본형을 객체로 사용할수 있다.
 * 
 * byte -> Byte
 * short -> Short
 * int -> Integer
 * long -> Long
 *
 * float -> Float
 * double -> Double
 * 
 * boolean -> Boolean
 *
 * char -> Character
 * 
 */
public class WrapperTest {

	public static void main(String[] args) {
		WrapperTest wt = new WrapperTest();
//		wt.test1();
//		wt.test2();
//		wt.test3();
		wt.test4();
	}
	
	/**
	 * @See <a href="https://jsonobject.tistory.com/466"> Java, BigDecimal 사용법 정리 </a>
	 * 
	 */
	public void test4() {
		String data = "3.5000010000100001, 4.4, 1.89";
		BigDecimal sum = new BigDecimal("0");//0을 전달하면 오차발생
		String[] arr = data.split(", ");
		for(String s : arr) {
			BigDecimal bd = new BigDecimal(s);
			sum = sum.add(bd);//add는 BigDecimal객체를 리턴한다.
		}
		System.out.println(sum);
		
	}
	/**
	 * csv데이터의 합을 구하기
	 */
	public void test3() {
		String data = "3.500000000000000, 4.4, 1.89";
		double sum = 0;
		
		//1. csv데이터 -> 문자열 배열
//		String[] arr = data.split(", ");
//		for(String s : arr) {
////			System.out.println(s);
//			//2. 문자열 -> double 형변환
//			double d = Double.parseDouble(s);
//			sum += d;
//		}
		
		StringTokenizer tokenizer = new StringTokenizer(data, ", ");
		while(tokenizer.hasMoreTokens()) {
			String s = tokenizer.nextToken();
			double d = Double.parseDouble(s);
			sum += d;
		}
		
		System.out.println(sum);
	}
	
	/**
	 * 문자열 데이터를 해당 타입으로 변환
	 */
	public void test2() {
		String data = "345";
		int num = Integer.parseInt(data);
		System.out.println(num + 10);
		
		data = "34.567";
		double dnum = Double.parseDouble(data);
		System.out.println(dnum * 10);
	}
	
	/**
	 * 기본형 -> Wrapper객체 : auto-boxing
	 * Wrapper객체 -> 기본형 : auto-unboxing
	 */
	public void test1() {
		
		int i = 100;
		Integer j = new Integer(100);
		
		//auto-unboxing
		System.out.println(i + j);
		System.out.println(i + j.intValue());//값 + 값
		
		//auto-boxing
		Integer k = 100;
//		Integer k = new Integer(100);
		
		//generic 사용시,  기본형 사용할 수 없다.
		List<Integer> list = new ArrayList<Integer>();
//		List<int> list = new ArrayList<int>(); //compile error
		
	}

}



