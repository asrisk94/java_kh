package kh.java.polymorphism.device;

public class Run {
	Device[] arr = new Device[10];
	
	{
		arr[0] = new TV("삼성", "평면TV", 3000000, 10);
		arr[1] = new Laptop("Lenovo", "ThinkPad", 1000000, 500);
		arr[2] = new Laptop("애플", "맥북", 1000000, 256);
		arr[3] = new TV("LG", "울트라TV", 4000000, 50);
	}

	public static void main(String[] args) {
		Run r = new Run();
		r.test1();
		
		r.test2();
	}
	/**
	 * 1. arr을 순회하면서, 
	 * tv객체라면 channelUp메소드 호출
	 * laptop객체 용량 정보를 출력
	 */
	public void test1() {
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] != null){
				
				if(arr[i] instanceof TV){
					//instanceof 연산자가 true라면, 해당타입으로 형변환을 보장받는다.
					//해당타입 형변환시, 절대 ClassCastException이 발생하지 않는다.
					((TV)arr[i]).channelUp();
				}
				
				if (arr[i] instanceof Laptop){
					System.out.println(((Laptop)arr[i]).getCapacity());
				}
			}
				
		}
	}
	
	/**
	 * 2. arr을 순회하면서 모든 필드정보를 조회(toString)
	 * toString오버라이딩을 통해 동적바인딩 이용하기
	 */
	public void test2() {
		for(Device d : arr)
			if(d != null)
				System.out.println(d.toString());
	}

}