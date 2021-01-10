package kh.java.inherit.basic;

/**
 * 상속
 * 부모클래스의 멤버(필드, 메소드)를 자식클래스에서 가져다 쓸수 있는 것.
 * 
 * 1. 부모멤버는 자식클래스에서 선언없이 사용가능.
 * 		- 물려받은 메소드는 오버라이딩 가능
 * 2. 모든 클래스는 Object클래스의 후손클래스
 * 		- Object의 모든 메소드를 후손클래스에서 사용가능
 * 3. 부모클래스의 초기화블럭, 생성자는 상속불가
 * 		- 자식클래스 객체 생성시, super(); 부모생성자를 먼저 자동 호출 
 * 4. 부모클래스의 private 멤버는 상속은 되지만, 같은 클래스가 아니므로 접근불가
 * 		- public메소드를 이용해 우회접근.
 * 		- 값대입시에 부모생성자super를 이용해 처리 가능
 *
 */
public class Run extends Object{

	public static void main(String[] args) {
		Parent p = new Parent();
		p.name = "고길동";
		p.age = 30;
		p.say();
		p.printInfo();
//		p.doGame();
		
		
		Child c = new Child();
		c.name = "둘리";
		c.age = 300;
		c.say();
		c.printInfo();
		c.doGame();
		
		
		Child2 c2 = new Child2();
		c2.name = "도우너";
		c2.age = 40;
		c2.say();
		c2.printInfo();
//		c2.doGame();
		
		GrandChild gc = new GrandChild();
		gc.name = "둘리 아들";
		gc.age = 3;
		gc.say();
		gc.printInfo();
		gc.doGame();
		
	}

}
