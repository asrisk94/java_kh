package kh.java.polymorphism.device;

public class Laptop extends Device {
	private int capacity;
	
	public Laptop() {}

	public Laptop(String brand, String deviceName, int price, int capacity) {
		super(brand, deviceName, price);
		this.capacity = capacity;
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Laptop [" + super.toString() + "capacity=" + capacity + "]";
	}
	
	
	
	
	
}
