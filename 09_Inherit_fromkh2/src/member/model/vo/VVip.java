package member.model.vo;

public class VVip  extends Member {
	public VVip(){}
	
	public VVip(String name, String grade, int point){
		super(name, grade, point);
	}
	
	//컴파일러에게 명시적으로 재정의함을 알림으로써, 오탈자나 메소드 선언부의 오류발생시 에러 알림을 받는다.
	@Override
	public double getEjapoint(){ 
		return super.getPoint()*0.15;
	}
}
