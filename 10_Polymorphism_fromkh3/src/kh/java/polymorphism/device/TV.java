package kh.java.polymorphism.device;

public class TV extends Device {
	private int channel;

	
	public TV() {}

	public TV(String brand, String deviceName, int price, int channel) {
		super(brand, deviceName, price);
		this.channel = channel;
	}
	

	public void channelUp(){
		System.out.println("현재 채널은 "+ ++channel+"입니다.");
	}

	public void channelDown(){
		System.out.println("현재 채널은 "+ --channel+"입니다.");
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		return "TV [" + super.toString() + ", channel=" + channel + "]";
	}

	
}
