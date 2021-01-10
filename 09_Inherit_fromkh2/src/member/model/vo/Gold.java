package member.model.vo;

public class Gold extends Member{

	public Gold() {}

	public Gold(String name, String grade, int point) {
//		super(name, grade, point);
		
		//부모클래스 필드 접근제한자가 protected인 경우.
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	@Override
	public double getEjapoint(){ 
		return super.getPoint()*0.05;
	}
	
}