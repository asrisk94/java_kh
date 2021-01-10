package member.model.vo;

/**
 * Buyable.buy추상메소드는
 * Member가 추상클래스이므로 자식클래스에서 구현하도록 한다.
 * (Member는 구현 강제화가 적용되지 않는다.) 
 *
 */
public abstract class Member implements Buyable {
	/*protected*/
	private String name;
	private String grade;
	private int point;
	
	public Member(){}
	
	public Member(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
//	public double getEjapoint(){
//		return this.point*0.02;
//	}
	
	//[[3]] 추상메소드를 통한 메소드 구현을 강제화
	public abstract double getEjapoint();
	
	
}
