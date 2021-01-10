package member.model.vo;
public class Silver extends Member{
	
	public Silver() {}
	public Silver(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public int buy(int price) {
		//물건가격 - (할인금액)
		return price - (int)(price * 0.02);
	}
	
	//[[3]] : 추상메소드를 통한 강제화때구현
	@Override
	public double getEjapoint(){ 
		return super.getPoint()*0.02;
	}

}