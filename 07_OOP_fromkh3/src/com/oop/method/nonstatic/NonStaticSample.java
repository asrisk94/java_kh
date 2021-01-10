package com.oop.method.nonstatic;

import java.util.Arrays;

public class NonStaticSample {
	
	//1. 반환값 없고 매개변수 없는 메소드
	//실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
	//메소드명 : printLottoNumbers
	public void printLottoNumbers(){
		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			arr[i] = num;
			//중복검사
			for (int j = 0; j < i; j++) {
				//중복된 수가 있다면, 해당번지수의 난수를 다시뽑기위해
				//미리 1을 감산한다. 이후 바깥반복문 i++을 통해 같은 번지를 가리키게 된다.
				if(num==arr[j]) i--;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	//2. 반환값 없고 매개변수 있는 메소드
	//실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
	//메소드명 : outputChar
	public void outputChar(int len, char ch){
		String result = "";
		for (int i = 0; i < len; i++) {
			result += ch;
		}
		System.out.println(result);
	}
	
	//3. 반환값 있고 매개변수 없는 메소드
	//실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
	//메소드명 : alphabette
	public char alphabet(){
		//대소문자에 해당하는 임의의 숫자선정
		//26가지 경우의 수를 가지고, 
		//0이면 대문자 65~90
		//1이면 소문자 97~122
		//으로 최초값을 설정한다.
		int num = (int)(Math.random()*26); 
		int upperOrLower = (int)(Math.random()*2) == 0 ? 65 : 97;
		
		return (char)(num + upperOrLower);
	}
	
	//4. 반환값 있고 매개변수 있는 메소드
	//실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
	//추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
	//메소드명 : mySubstring
	public String mySubstring(String str, int begin, int end){
		//null여부 검사 : NullPointerException
		if(str == null) return null;
	
		return str.substring(begin, end);
	}
}
