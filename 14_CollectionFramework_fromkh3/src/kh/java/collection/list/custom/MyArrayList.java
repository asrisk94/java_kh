package kh.java.collection.list.custom;

import java.util.ArrayList;

public class MyArrayList<E> extends ArrayList<E> {

	public int indexOf(E search, int nth) {

		int check = 0;	//몇번째 체크
		int index = -1;	//인덱스
		
		for(int i = 0; i < size(); i++) {
			if (get(i).equals(search)) {
				check++;
				if (check == nth) {
					index = i;
					break;
				}
			} 
		}
		
		return index;
	}
}
