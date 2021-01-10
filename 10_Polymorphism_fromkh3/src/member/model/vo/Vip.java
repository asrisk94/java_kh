package member.model.vo;
public class Vip extends Member {
	public Vip(){}
	public Vip(String name, String grade, int point){
		super(name, grade, point);
	}
	
	@Override
	public int buy(int price) {
		//물건가격 - (할인금액)
		return price - (int)(price * 0.1);
	}
	
	@Override
	public double getEjapoint(){ 
		return super.getPoint()*0.1;
	}
	

}