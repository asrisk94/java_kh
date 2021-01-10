package com.oop.method.static_;

public class Run {

	public static void main(String[] args) {
		StaticMethod.setValue("java");
		//1
		StaticMethod.toUpper();
		
//		StaticMethod s = new StaticMethod();
//		s.toUpper();
		
		//2
		StaticMethod.setChar(0, 'x');
		
		//3
		int len = StaticMethod.valueLength();
		System.out.println(len);
		//4
		String result = StaticMethod.valueConcat(" good~");
		System.out.println(result);
	}

}
