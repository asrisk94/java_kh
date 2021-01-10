package member.model.vo;
public class Gold extends Member {

	public Gold() {}

	public Gold(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public int buy(int price) {
		//물건가격 - (할인금액)
		return price - (int)(price * 0.05);
	}
	
	
	@Override
	public double getEjapoint(){ 
		return super.getPoint()*0.05;
	}
	

	
}