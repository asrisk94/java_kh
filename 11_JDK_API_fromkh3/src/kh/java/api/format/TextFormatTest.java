package kh.java.api.format;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TextFormatTest {

	public static void main(String[] args) {
		TextFormatTest t = new TextFormatTest();
		t.test1();
		t.test2();
	}
	
	/**
	 * DecimalFormat
	 * 
	 * - # : 해당자리수의 숫자가 없다면 생략.
	 * - 0 : 해당자리수의 숫자가 없다면 0으로 채움
	 */
	public void test2() {
		double num = 123456789.123;
		DecimalFormat df = new DecimalFormat("#,###.#####");
		System.out.println(df.format(num));
		
		df.applyPattern("0,000.00000");
		System.out.println(df.format(num));
		
		
	}

	/**
	 * SimpleDateFormat
	 */
	public void test1() {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd (E) HH:mm:ss");
		Date now = new Date();
		System.out.println(sdf.format(now));
		
		System.out.println(new SimpleDateFormat("a HH시 mm분 ss초").format(now));
		
		System.out.println(new SimpleDateFormat("MMMM LLLL",  Locale.FRENCH).format(now));
	}

}
