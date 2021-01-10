package kh.java.inherit.shape;
/**
 * 도형
 *
 */
public class Shape {
	double area; 	//넓이
	
	double calcArea() {
		return area;
	}
	
	void draw() {
		System.out.println("도형을 그린다.");
	}
}
