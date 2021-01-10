package kh.java.cast;

/**
 * 컴퓨터의 작동원리
 * 
 * 1. 같은 자료형사이에서 연산할 수 있다.
 * 2. 리터럴은 같은 자료형의 변수에만 대입할 수 있다.
 * 3. 같은 자료형의 연산결과는 동일한 자료형이다. int + int -> int
 *
 */
public class Casting {

	public static void main(String[] args) {

		Casting c = new Casting();
//		c.test1();
//		c.test2();
//		c.test3();
		c.test4();
		
	}
	
	public void test4() {
		System.out.println('A' + 1);//66
		//char + int -> int + int
		
		System.out.println('0' + 1);//49
		//char + int -> int + int
		
		System.out.println((char)99);//알파벳 c가 출력되려면?
		
		System.out.println(2.0 == (5 / 2));
		//2.0 == (int / int) -> 2.0 == 2 
		//-> double == int -> double == double
		
		System.out.println('C' == 67);
		//char == int -> int == int
		
		System.out.println('A' == ('B' - 1));
		//'A' == char - int -> 'A' == 65
		
		System.out.println('a' != 97);
		//char != int -> int != int -> 97 != 97
	}
	
	
	
	/**
	 * int보다 작은 타입간 연산시 주의사항
	 * byte, short, char타입은 오칙연산(+ - * / %)의 피연산자로 사용되면
	 * int로 자동형변환 되어 처리된다.
	 * 
	 */
	public void test3() {
		byte b1 = 100;
		byte b2 = 10;
		byte result = (byte)(b1 + b2);//byte + byte -> int + int -> int
		System.out.println(result);
		
		char a = 97;
		System.out.println(a);
		
	}
	
	
	/**
	 * 2. 명시적 형변환
	 *  - 데이터손실이 있을수 있으므로 주의해서 사용
	 * 
	 */
	public void test2() {
		//1.크기가 작은 타입으로 변환(데이터손실 있음)
		int num = (int)3.7; // int = double
		System.out.println(num);
		
		num = 290;
		byte b = (byte)num;
		System.out.println(b); //34
		
		//2.크기가 큰 타입으로 변환 (데이터손실 없음)
		int k = 10;
		int m = 4;
		System.out.println((double)k / m); // (double)int / int
		//double / int -> double / double -> double
		
		//결과로 2147483648 출력하려면?
		int i = Integer.MAX_VALUE;
		System.out.println((long)i + 1); // long + int -> long + long -> long
		System.out.println(i + 1L);
		
	}
	
	/**
	 * 1. 암묵적 형변환(자동형변환)
	 * 	- 데이터 손실이 없는 경우
	 *  - 승격
	 *  - byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
	 *  		  -> char(2)
	 *   
	 */
	public void test1() {
		//1. 자료형이 다른 값의 연산
		int a = 3;
		double b = 2.7;
		System.out.println(a + b);	// 3 + 2.7 -> 3.0 + 2.7 = 5.7
		
		//2. 리터럴이 다른 자료형의 변수에 대입될때.
		int c = 5;
		float d = c; // d = 5 -> d = 5.0
		System.out.println(d);
		
		char e = 'e'; 
		int f = e;
		System.out.println(f);
		
		System.out.println('B' + 100); // char + int -> int + int
		// 66 + 100
		
		//3. 연산결과는 동일한 자료형
		int k = 10;
		int m = 3;
		float n = 3;
		System.out.println(k / m);
		System.out.println(k / n); // 10.0 / 3.0 -> float / float -> float
		
	}
	
}





