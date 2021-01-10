package kh.java.collection.list.custom;

public class Test {

	public static void main(String[] args) {
		
		MyArrayList<String> list = new MyArrayList<>();

		list.add("abc");
		list.add("bcd");
		list.add("cd");
		list.add("bcd");
		list.add("eas");
		list.add("bcd");
		list.add("gds");
		list.add("hgsf");
		list.add("wqwi");
		list.add("jsf");
		
		System.out.println(list.indexOf("bcd", 2));
		System.out.println(list.indexOf("kkk", 2));
		
	}
	
}