package kh.java.inherit.product.after;

/**
 * @실습문제1
 * Desktop과 SmartPhone의 공통필드를 관리하는 
 * Computer클래스를 작성하고 상속하세요
 *
 */
//public class Desktop extends Product {
public class Desktop extends Computer {

	private String monitor;
	private String keyboard;
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String productName, int price,
			       String os, String monitor, String keyboard) {
//		this.brand = brand;
//		this.productName = productName;
//		this.price = price;
		
		//1. public메소드를 통해 우회 접근
//		setBrand(brand);
//		setProductName(productName);
//		setPrice(price);
		
		//2. super 부모생성자를 이용한 값대입
		//최상단 단한번만 사용가능하다.
		super(brand, productName, price, os);
		this.monitor = monitor;
		this.keyboard = keyboard;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	/**
	 * 오버라이드 하는것을 명시적으로 표현
	 * 부모메소드의 시그니쳐와 다른 경우, 컴파일오류를 유발
	 */
	@Override
	public String getProductInfo() {
		//부모클래스 Product의 getProductInfo 호출
		return super.getProductInfo() + ", " 
			 + monitor + ", " + keyboard;
	}
	
	
	
}

