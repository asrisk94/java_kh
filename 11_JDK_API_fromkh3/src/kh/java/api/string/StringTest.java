package kh.java.api.string;

import java.util.StringTokenizer;

/**
 * 
 * 
 * String 
 * 	- immutable(변경불가한)
 * 	- heap영역안에 Literal Pool에서 문자열Literal을 관리
 *  - 공유가능
 * 
 * StringBuilder
 * 	- mutable(변경가능한) 싱글쓰레드 작동
 * StringBuffer
 *  - mutable 멀티쓰레드 작동
 * 
 *
 */
public class StringTest {

	public static void main(String[] args) {
		StringTest st = new StringTest();
//		st.test1();
//		st.test2();
		
		//csv데이터 다루기
		st.test3();
	}
	
	/**
	 * csv
	 * Comma Seperated Value 콤마로 구분된 값
	 * "a/b/c/d" -> {"a", "b", "c", "d"}
	 * "홍길동,1,180,79" -> {"홍길동", "1", "180", "79"}
	 *  
	 *  1. String - split
	 *  2. StringTokenizer
	 */
	public void test3() {
		String data = "java,oracle, jdbc, html5 css3, javascript";
		//1. split
		String[] arr1 = data.split(", ");
		//정규표현식을 통해 문자단위 처리
		arr1 = data.split("[, ]");
		System.out.println(arr1.length);

		for(String s : arr1)
			System.out.println("[" + s + "]");
		
		
		System.out.println("--------------------------");
		//2. StringTokenizer delimiter
		//java.util.StringTokenizer.StringTokenizer(String str, String delim)
		StringTokenizer tokenizer = new StringTokenizer(data, ", ");
		//구분자파라미터를 문자단위로 parsing처리
		System.out.println(tokenizer.countTokens());
		
		while(tokenizer.hasMoreTokens()) {
			String s = tokenizer.nextToken();
			System.out.println("[" + s + "]");
		}
		
		
	}
	
	/**
	 * StringBuilder안에서 변경이 일어나고,
	 * hashCode도 동일하게 유지된다.
	 * 
	 * 문자열의 변경이 자주 일어나게 된다면, StringBuilder를 사용할것.
	 * 
	 */
	public void test2() {
		StringBuilder sb = new StringBuilder("자바");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.append("오라클");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
	}
	
	public void test1() {
		
		String s1 = "자바";
		String s2 = "자바";
		String s3 = new String("자바");
		String s4 = new String("자바");
		
		//== 
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		
		//equals : Object.equals를 오버라이딩해둠
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		//hashCode
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//문자열 : 더하기연산
		s2 += "오라클";
		s4 += "오라클";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
	}

}
