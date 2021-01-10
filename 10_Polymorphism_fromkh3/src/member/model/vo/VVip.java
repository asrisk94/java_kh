package member.model.vo;

public class VVip  extends Member{
	public VVip(){}
	
	public VVip(String name, String grade, int point){
		super(name, grade, point);
	}
	
	@Override
	public int buy(int price) {
		//물건가격 - (할인금액)
		return price - (int)(price * 0.15);
	}
	
	@Override
	public double getEjapoint(){ 
		return super.getPoint()*0.15;
	}
	

}
