package kh.java.inherit.product.after;

public class ProductAfterMain {

	public static void main(String[] args) {

		Desktop d = new Desktop("삼성", "오딧세이", 1_500_000, 
								"windows10", "27인치모니터", "기계식 키보드");
		SmartPhone s = new SmartPhone("애플", "아이폰12", 1_000_000, 
							  		  "ios", "kt");
		Television tv = new Television("LG", "롤러블TV", 100_000_000, 75);
		
//		System.o	ut.println(d.getDesktopInfo());
//		System.out.println(s.getSmartPhoneInfo());
//		System.out.println(tv.getTelevisionInfo());
		
		//부모메소드
		System.out.println(d.getProductInfo());
		System.out.println(s.getProductInfo());
		System.out.println(tv.getProductInfo());
		
	}

}
