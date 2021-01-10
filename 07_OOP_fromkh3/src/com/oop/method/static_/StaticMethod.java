package com.oop.method.static_;

public class StaticMethod {
	//Field
	private static String value;

	//value 필드 값 변경용 : 필드가 static이면 setter 도 static 이어야 함
	public static void setValue(String value) {
		StaticMethod.value = value;
	}
	
	//value 필드 값 조회용 : 필드가 static 이면 getter 도 static 이어야 함
	public static String getValue() {
		return value;
	}

	
	
	 /** 
	  * 필드가 모두 static 일 때는 메소드도 전부 static 이어야 함
	 * static method
	 * 
	 * 1. 반환값 없고 매개변수 없는 메소드
	 * value 필드 값을 모두 대문자로 바꾸는 static 메소드
	 * 메소드명 : toUpper
	 * 
	 */
	public static void toUpper(){
		String result = value.toUpperCase();
		System.out.println(result);
	}
	
	/**
	 * 2. 반환값 없고 매개변수 있는 메소드
	 * 인덱스와 문자를 전달받아
	 * value 필드에서 전달받은 인덱스 위치의 값을 전달받은 문자로 변경하는 static 메소드
	 * 메소드명 : setChar
	 * @param index
	 * @param ch
	 * 
	 * 
	 */
	public static void setChar(int index, char ch){
		char[] arr = value.toCharArray();
		arr[index] = ch;
		System.out.println(arr);//문자배열은 출력메소드에 사용시 문자열 출력됨.
		value = new String(arr); /*String 클래스 소스코드참조*/
		System.out.println(value);
		
	}
	
	/**
	 * 3. 반환값 있고 매개변수 없는 static 메소드
	 * value 필드에 기록된 글자갯수 리턴 처리
	 * 메소드명 : valueLength
	 * @return
	 */
	public static int valueLength(){
		return value.length();
	}
	
	
	/**
	 * 4. 반환값 있고 매개변수 있는 static 메소드
	 * 문자열값을 전달받아, value 필드값과 하나로 합쳐서 리턴 처리
	 * 메소드명 : valueConcat
	 * 
	 * @param str
	 * @return
	 */
	public static String valueConcat(String str){
		return value + str;
	}
}
