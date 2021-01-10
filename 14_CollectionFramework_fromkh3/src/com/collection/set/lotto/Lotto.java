package com.collection.set.lotto;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * <문제 1>
 * : Set 계열 클래스와 Random 사용
 * - 클래스명 : com.collection.set.lotto.Lotto.java
 * 	>> main() 메소드 포함
 * - 메소드 추가 : public static void lottoDisplay(){}
 * 	>> 구현내용
 * 	1. 1 ~ 45 사이의 정수를 중복되지 않게, 6개 발생시켜
 * 	2. 자동 오름차순정렬되게 처리하는 Set 계열에 보관하고 
 * 	3. Integer[]로 바꾸어 출력함.
 * 
 *
 * @author shqkel1863
 *
 */
public class Lotto {
	public static void main(String[] args){
		lottoDisplay();
		
	}

	public static void lottoDisplay() {
		//자동 오름차순 정렬되게 처리하는 Set계열 컬렉션은 TreeSet이다.
		Set<Integer> lottoSet = new TreeSet<>();

		while(lottoSet.size()<6){
			int num = (int)(Math.random()*45)+1;
			lottoSet.add(new Integer(num));
		}
		
		System.out.println(lottoSet);
		
		//Integer[]에 담아 출력하기
		Integer[] lottoArr = new Integer[lottoSet.size()]; 
		lottoSet.toArray(lottoArr);
		System.out.println(Arrays.toString(lottoArr));
	}
}
