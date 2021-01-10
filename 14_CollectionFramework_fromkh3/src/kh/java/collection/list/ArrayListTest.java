package kh.java.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayListTest a = new ArrayListTest();
//		a.test0();
//		a.test1();
//		a.test2();
//		a.test3();
//		a.test4();
		a.test5();
	}
	
	
	private void test5() {
		
		List<Student> list = new ArrayList<>();
		
		
	}


	/**
	 * iterator
	 * 모든 요소를 열람하는 방법
	 * 
	 */
	private void test4() {
		//제네릭 타입 생략 가능
		List<String> list = new ArrayList<>();
		list.add("honggd");
		list.add("sinsa");
		list.add("sejong");
		
		//iterator
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
		
		
	}



	/**
	 * ArrayList 사용법
	 */
	private void test3() {
		List<Integer> list = new ArrayList<Integer>();
		
		//저장된 순서를 유지
		list.add(3);
		list.add(2);
		list.add(1);
		
		//중복을 허용
		list.add(2);
		list.add(3);
		
		//삭제 : 다음번지수를 하나씩 앞당겨 재배치
		list.remove(0);
		list.remove(new Integer(2));//동일한 요소를 제거
//		System.out.println(list.get(0));
		System.out.println(list);
		
		//수정 : 특정인덱스의 요소를 변경
		list.set(0, 300);
		
		//삽입 : 인덱스, 추가할 값
		list.add(1, 200);
		
		//다른 리스트의 요소를 통째로 추가
		List<Integer> another = new ArrayList<Integer>();
		another.add(999);
		another.add(99);
		another.add(9);
		
		list.addAll(another);
		
		//특정요소 포함여부 boolean
		boolean bool = list.contains(99);
		bool = list.contains(9999999);
		System.out.println(bool);
		
		//특정요소 포함여부 index(int)
		int index = list.indexOf(99);
		index = list.indexOf(9999999);
		
		list.add(5, 200);
		index = list.indexOf(200);
		System.out.println(index);
		index = list.lastIndexOf(200);
		System.out.println(index);
		
		
		
		
		//요소전체삭제
//		list.clear();
		
		//리스트에 요소가 없는가?
		bool = list.isEmpty();
//		System.out.println(bool);
		
		System.out.println(list);
	}


	/**
	 * Generic 타입변수
	 * 기본형을 사용할 수 없다.
	 */
	private void test2() {
		List<String> list = new ArrayList<String>();
		//요소추가시에 타입체크 가능
		list.add("안녕");
		list.add(new String("hello"));
//		list.add(new Date());
		
		//요소를 가져올때 형변환 할 필요가 없다.
		String s = list.get(0);
		
		for(String str : list) {
			System.out.println(str);
		}
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(1);// 1 -> new Integer(1); auto-boxing
		numList.add(2);// 2 -> new Integer(2); 
		
		System.out.println(numList.get(0) + numList.get(1));
		//Integer + Integer -> 1 + 2 auto-unboxing
		System.out.println(numList.get(0).getClass().getName());
		
	}

	private void test1() {
		ArrayList list1 = new ArrayList();
		List<Object> list2 = new ArrayList<Object>();
		Collection list3 = new ArrayList();
		
		list1.add("apple");
		list1.add(new Student());
		list1.add(123);
		list1.add(123);
		list1.add(new Date());
		
//		Object o = list1.get(0);
		String s = (String)list1.get(0);
		
		System.out.println(list1);
		
		//특정요소 : 인덱스로 접근
		System.out.println(list1.get(0));
		System.out.println(list1.get(3));
		
		//요소개수 확인
		System.out.println(list1.size());
		
//		for(int i = 0; i < list1.size(); i++)
//			System.out.println(list1.get(i));
		
		for(Object o : list1) {
			System.out.println(o);
		}
	}

	/**
	 * 배열의 한계
	 */
	private void test0() {
		Student[] arr = new Student[3];
		arr[0] = new Student(1, "홍길동");
		arr[1] = new Student(2, "신사임당");
		arr[2] = new Student(3, "장영실");
		
		//학생2명 추가
		Student[] arr1 = new Student[10];
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		arr1[3] = new Student(4, "세종대왕");
		arr1[4] = new Student(5, "윤봉준");
		
		//학생1명 삭제 : 다음요소를 하나씩 앞당기는 작업
//		arr1[1] = null;
		arr1[1] = arr1[2];
		arr1[2] = arr1[3];
		arr1[3] = arr1[4];
		arr1[4] = null;
		
		//학생1명추가 : 중간에 삽입
		arr1[4] = arr1[3];
		arr1[3] = arr1[2];
		arr1[2] = arr1[1];
		arr1[1] = new Student(2, "유관순");
		
		
		//확인
		for(Student s : arr1)
			System.out.println(s);
	}
	

}




