package kh.java.array;

/**
 * 변수 : 하나의 자료형, 한가지 값을 보관
 * 
 * 배열 : 하나의 자료형, 여러가지 값을 보관
 *
 */
public class ArrayTest {

	public static void main(String[] args) {
		
		ArrayTest a = new ArrayTest();
//		a.test1();
//		a.test2();
//		a.test3();
//		a.test4();
//		a.test5();
//		a.test6();
		a.test7();
	}
	
	/**
	 * 배열 초기화
	 *  - 배열 할당 및 값대입
	 */
	public void test7() {
//		int[] arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		
		int[] arr = {1,2,3,4,5};
		int[] arr1 = new int[]{1,3,5}; //배열 크기 지정하지 말것.
		
	}
	
	
	
	/**
	 * 배열의 특징
	 * 
	 * - 배열의 크기는 변경할 수 없다.
	 * - 배열의 삭제는 참조형변수에 null을 대입해서 처리
	 */
	public void test6() {
		int[] arr1 = new int[5];
		System.out.println(arr1.length);
		//hashCode : 객체가 가진 고유값(주소값은 아니다.)
		System.out.println(arr1.hashCode());
		
		//새로운 배열을 할당
		arr1 = new int[10];
		System.out.println(arr1.length);
		System.out.println(arr1.hashCode());
		
		//배열 삭제
		arr1 = null;
		
		//참조형변수가 heap에 가리키는 객체가 없을때(null인 경우)
		//메소드, 속성등을 참조하면 NullPointerException 예외 발생
//		System.out.println(arr1.length);
		System.out.println(arr1.hashCode());
		
		System.out.println("--- 프로그램 종료 ---");
		
	}
	
	/**
	 * @실습문제 : 알파벳 소문자배열을 만들고, 모든요소를 한줄로 출력
	 * 
	 * a, b, c, d, e, .....z
	 * 
	 */
	public void test5() {
		
		//1. 배열생성
		char[] alphabet = new char[26];
		
		//2. 요소 값대입
		//3. 요소 값출력
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char)('a' + i);
			
			System.out.print(alphabet[i]);
			System.out.print((i < alphabet.length - 1) ? 
										", " : 
											"");
			
		}
		
		
	}
	
	public void test4() {
		//1.배열선언 및 할당
		int[] numArr = new int[8];
		
		//2. 요소의 값대입
		//규칙이 있는 경우
		// 3, 10, 38, 6, 28, 10
		for(int i = 0; i < numArr.length; i++) {
			
//			numArr[i] = (i + 1); // 1 2 3 4 5 6 7 8
//			numArr[i] = (i + 1) * 10; // 10 20 30 40 50 60 70 80
			numArr[i] = i * 2 + 2; // 2 4 6 8 10 12 14 16
			
		}
		
		//3. 요소 값사용 
		// 2,4,6,8,10,12,14,16
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
			if(i != numArr.length - 1) //배열길이 - 1 -> 마지막 인덱스
				System.out.print(",");
		}
		
	}
	
	
	public void test3() {
		
		String[] strArr = new String[10];
		strArr[0] = "홍길동";
		strArr[1] = "둘리";
		strArr[2] = "도우너";
		
//		System.out.println(strArr[0]);
//		System.out.println(strArr[1]);
//		System.out.println(strArr[2]);
		
//		System.out.println(strArr[10]); // ArrayIndexOutOfBoundsException:
		
		System.out.println(strArr.length);
		//배열(객체)는 length 속성이 있다.
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
	}
	
	/**
	 * @실습문제: 문자배열을 이름길이로 생성하고, 각 인덱스에 이름을 대입후 출력할 것.
	 */
	public void test2() {
		//1. 배열선언
//		char[] nameArr;
		
		//2. heap에 배열할당
//		nameArr = new char[3];
		
		char[] nameArr = new char[3];
		System.out.println("[" + nameArr[0] + "]");
		System.out.println("[" + nameArr[1] + "]");
		System.out.println("[" + nameArr[2] + "]");
		
		//3. 요소에 값대입
		nameArr[0] = '홍';
		nameArr[1] = '길';
		nameArr[2] = '동';
		
		//4. 출력
		System.out.println(nameArr[0]);
		System.out.println(nameArr[1]);
		System.out.println(nameArr[2]);
	}
	
	public void test1() {
		//변수공간은 초기화되지 않고, 쓰레기값이 들어있다.
		int kor;
		int eng;
		int math;
		
		//callstck의 변수는 초기화(값대입) 하지 않고는 사용할 수 없다.
//		System.out.println(kor);
//		System.out.println(eng);
//		System.out.println(math);

		kor = 80;
		eng = 100;
		math = 90;
		
		
		//1. 배열변수 선언
		int[] arr;
		
		//2. 배열 할당(heap영역에 확보)
		//배열크기를 반드시 지정할 것.
		//heap은 자료형별 기본값으로 초기화된다.
		//int : 0, double : 0.0, boolean : false, char : ' '
		//참조형 : null
		arr = new int[3];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//배열 요소 값대입
		arr[0] = 80;
		arr[1] = 100;
		arr[2] = 90;
		
		//배열 요소 값 확인
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		
	}
	
	
}
